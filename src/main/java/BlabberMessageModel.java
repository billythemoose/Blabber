import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.chat2.Chat;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.chat2.IncomingChatMessageListener;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smackx.iqregister.AccountManager;
import org.jxmpp.jid.EntityBareJid;
import org.jxmpp.jid.impl.JidCreate;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class BlabberMessageModel {
    private XMPPTCPConnection connection;
    private XMPPTCPConnectionConfiguration config;
    private ChatManager chatManager;
    private AccountManager accountManager;
    private String currentUser;
    private String password;
    private ArrayList<String> messages;
    private BlabberMessageController parentController;

    public BlabberMessageModel (BlabberMessageController controller, String username, char[] password, ArrayList<String> participants){
        this.parentController = controller;
        this.currentUser = username;
        StringBuilder strBuild = new StringBuilder();
        for (char c : password) {
            strBuild.append(c);
        }

        messages = new ArrayList<String>();

        this.password = strBuild.toString();

        this.ConnectToChat();
    }

    public boolean ConnectToChat() {
        try {
            config = XMPPTCPConnectionConfiguration
                    .builder()
                    .setSecurityMode(ConnectionConfiguration.SecurityMode.disabled)
                    .setXmppDomain("blackbox")
                    .setHost("blackbox")
                    .setPort(5222)
                    .setUsernameAndPassword(this.currentUser, this.password)
                    .build();
            connection = new XMPPTCPConnection(config);
            connection.connect().login();

            chatManager = ChatManager.getInstanceFor(connection);
            chatManager.addIncomingListener(new IncomingChatMessageListener() {
                @Override
                public void newIncomingMessage(EntityBareJid entityBareJid, Message message, Chat chat) {
                    System.out.println("New message from " + entityBareJid + ": " + message.getBody());
                    ReceiveMessage(entityBareJid.toString(), message);
                }
            });
        }
        catch (Exception e) {
            System.out.println("Chat connection initialization failed");
            System.out.println(e.toString());
        }

        return true;
    }

    public void ReceiveMessage(String username, Message message) {
        this.messages.add(message.getBody());
        this.parentController.UpdateMessages(username, message.getBody());
    }




    // sends a message to a single user
    // true if successful
    // false if failed to send
    public boolean SendMessage(String usernameTo, String chatMessage) {
        try {
            if (!this.connection.isConnected() || !this.connection.isAuthenticated()){
                this.ConnectToChat();
            }

            EntityBareJid jid = JidCreate.entityBareFrom(usernameTo + "@blackbox");
            Chat chat = chatManager.chatWith(jid);
            chat.send(chatMessage);
        }
        catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
        return true;
    }
}

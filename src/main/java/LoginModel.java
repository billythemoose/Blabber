import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.chat2.Chat;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.chat2.IncomingChatMessageListener;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.roster.RosterEntries;
import org.jivesoftware.smack.roster.RosterEntry;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smackx.iqregister.AccountManager;
import org.jxmpp.jid.EntityBareJid;
import org.jxmpp.jid.impl.JidCreate;
import org.jxmpp.jid.parts.Localpart;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class LoginModel {

    private XMPPTCPConnection connection;
    private XMPPTCPConnectionConfiguration config;
    private ChatManager chatManager;
    private Collection<RosterEntry> contacts;

    // Create a new Blabber XMPP connection
    public LoginModel() {
        /*
        try {
            XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration
                    .builder()
                    .setSecurityMode(ConnectionConfiguration.SecurityMode.disabled)
                    .setXmppDomain("blackbox")
                    .setHost("blackbox")
                    .setPort(5222)
                    .build();
            connection = new XMPPTCPConnection(config);
            connection.connect();
        }
        catch (Exception e) {
            System.out.println("Connection initialization failed");
            System.out.println(e.toString());
        }
        */
    }

    // reconnect to instance
    // true if connected
    // false if failed to connect
    public boolean ReonnectToInstance() {
        try {
            connection.connect();
        }
        catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }

        return true;
    }

    // disconnect from instance
    // true if disconnected
    // false if failed to disconnect
    public boolean DisconnectFromInstance() {
        try {
            connection.disconnect();
        }
        catch (Exception e ) {
            System.out.println(e.toString());
            return false;
        }

        return true;
    }

    // Check XMPP Connection status
    // True if connected
    // False if disconnected
    public boolean ConnectionStatus() {
        return connection.isConnected();
    }

    // Connects user to XMPP instance
    // True if user connected
    // False if failed to connect user
    public boolean UserLogin(String username, String password) {
        try {
            XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration
                    .builder()
                    .setSecurityMode(ConnectionConfiguration.SecurityMode.disabled)
                    .setXmppDomain("blackbox")
                    .setHost("blackbox")
                    .setPort(5222)
                    .setUsernameAndPassword(username, password)
                    .build();
            connection = new XMPPTCPConnection(config);
            connection.connect();
        }
        catch (Exception e) {
            System.out.println("Connection initialization failed");
            System.out.println(e.toString());
        }

        return true;
    }

    public boolean BuildContacts() {
        try {
            Roster roster = Roster.getInstanceFor(connection);
            contacts = roster.getEntries();
            for (RosterEntry contact : contacts) {

            }
        }
        catch (Exception e) {
            System.out.println("Failed to load contacts");
            return false;
        }

        return true;
    }

    // sends a message to a single user
    // true if successful
    // false if failed to send
    public boolean SendMessageToUser(String username, String chatMessage) {
        try {
            chatManager = ChatManager.getInstanceFor(connection);
            chatManager.addIncomingListener(new IncomingChatMessageListener() {
                @Override
                public void newIncomingMessage(EntityBareJid entityBareJid, Message message, Chat chat) {
                    System.out.println("New message from " + entityBareJid + ": " + message.getBody());
                }
            });

            EntityBareJid jid = JidCreate.entityBareFrom(username);
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

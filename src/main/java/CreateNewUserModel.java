import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smackx.iqregister.AccountManager;
import org.jxmpp.jid.parts.Localpart;

public class CreateNewUserModel {
    private XMPPTCPConnection connection;
    private AccountManager accountManager;

    // Create a new Blabber user
    public CreateNewUserModel() {
        try {
            XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration
                    .builder()
                    .setSecurityMode(ConnectionConfiguration.SecurityMode.disabled)
                    .setXmppDomain("blackbox")
                    .setHost("blackbox")
                    .setPort(5552)
                    .build();
            connection = new XMPPTCPConnection(config);
            connection.connect();
        }
        catch (Exception e) {
            System.out.println("Connection intialization failed");
            System.out.println(e.toString());
        }
    }

    // adds new user to Blabber server
    // true if successful
    // false if failed
    public void AddUser(String username, String password) {
        try {

            accountManager = AccountManager.getInstance(connection);
            accountManager.sensitiveOperationOverInsecureConnection(true);
            accountManager.createAccount(Localpart.from(username), password);
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

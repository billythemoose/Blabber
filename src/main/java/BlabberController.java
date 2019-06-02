

public class BlabberController {

    // Model and UI components
    private LoginModel loginModel;
    private LoginGUI loginGUI;
    private ContactsGUI contactsGUI;
    private ContactsModel contactsModel;

    // Current user variables
    private String m_username;
    private char[] m_password;


    // Main handler for the blabber application
    public BlabberController() {
        InitializeLogin();
    }

    public void InitializeLogin() {
        loginModel = new LoginModel();

        loginGUI = new LoginGUI(this);
        loginGUI.setVisible(true);
    }

    public void InitializeContacts() {
        contactsModel = new ContactsModel();
        contactsGUI = new ContactsGUI();
    }

    public void LoginUser(String username, char[] password) {

        boolean success = loginModel.UserLogin(username, password.toString());
        if (success) {
            this.m_username = username;
            this.m_password = password;
            InitializeContacts();
            loginGUI.setVisible(false);
        }
        else {
            System.out.println("User login failed");
        }
    }
}

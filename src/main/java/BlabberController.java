

public class BlabberController {

    // UI Components
    private LoginGUI loginGUI;
    private ContactsGUI contactsGUI;
    private CreateNewUserGUI newUserGUI;

    // Model components
    private ContactsModel contactsModel;
    private BlabberControllerModel controllerModel;

    // Current user variables
    private String m_username;
    private char[] m_password;


    // Main handler for the blabber application
    public BlabberController() {
        InitializeLogin();
    }

    private void HideUIElements(String currentUI) {
        if (loginGUI != null && loginGUI.isVisible() && !currentUI.contains("login")) {
            loginGUI.setVisible(false);
        }

        if (newUserGUI != null && newUserGUI.isVisible() && !currentUI.contains("newuser")) {
            loginGUI.setVisible(false);
        }

        if (contactsGUI != null && contactsGUI.isVisible() && !currentUI.contains("contacts")) {
            contactsGUI.setVisible(false);
        }
    }

    public void InitializeLogin() {
        controllerModel = new BlabberControllerModel();

        loginGUI = new LoginGUI(this);
        loginGUI.setVisible(true);
    }

    public void InitializeNewUser() {
        if (loginGUI.isVisible()) {
            loginGUI.setVisible(false);
        }

        newUserGUI = new CreateNewUserGUI(this);
        newUserGUI.setVisible(true);
    }

    public void InitializeContacts() {
        HideUIElements("contacts");
        /*
        ContactsGUI messages = new ContactsGUI();
        messages.getUsername(usernameField.getText().toString());
        messages.setVisible(true);
        setVisible(false);
        */
        contactsModel = new ContactsModel();
        contactsGUI = new ContactsGUI(this);
        contactsGUI.getUsername(this.m_username);
        contactsGUI.setVisible(true);
    }

    public void LoginUser(String username, char[] password) {

        boolean success = controllerModel.UserLogin(username, password);
        if (success) {
            this.m_username = username;
            this.m_password = password;
            InitializeContacts();
        }
        else {
            System.out.println("User login failed");
        }
    }

    public void CreateUser(String username, char[] password) {
        boolean success = controllerModel.CreateUser(username, password);
        if (success) {
            this.m_username = username;
            this.m_password = password;
            InitializeContacts();
        }
        else {
            System.out.println("User login failed");
        }
    }
}

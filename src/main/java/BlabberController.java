import java.util.ArrayList;

public class BlabberController {

    // UI Components
    private LoginGUI loginGUI;
    private ContactsGUI contactsGUI;
    private CreateNewUserGUI newUserGUI;

    // Model components
    private ContactsModel contactsModel;
    private BlabberControllerModel controllerModel;
    private ArrayList<BlabberMessageModel> messageModels;

    // Current user variables
    private String m_username;
    private char[] m_password;


    // Main handler for the blabber application
    public BlabberController() {
        InitializeLogin();
        messageModels = new ArrayList<BlabberMessageModel>();
    }

    private void HideUIElements(String currentUI) {
        if (this.loginGUI != null && this.loginGUI.isVisible() && !currentUI.contains("login")) {
            this.loginGUI.setVisible(false);
        }

        if (this.newUserGUI != null && this.newUserGUI.isVisible() && !currentUI.contains("newuser")) {
            this.loginGUI.setVisible(false);
        }

        if (this.contactsGUI != null && this.contactsGUI.isVisible() && !currentUI.contains("contacts")) {
            this.contactsGUI.setVisible(false);
        }
    }

    public void InitializeLogin() {
        this.controllerModel = new BlabberControllerModel();

        this.loginGUI = new LoginGUI(this);
        this.loginGUI.setVisible(true);
    }

    public void InitializeNewUser() {
        if (this.loginGUI.isVisible()) {
            this.loginGUI.setVisible(false);
        }

        this.newUserGUI = new CreateNewUserGUI(this);
        this.newUserGUI.setVisible(true);
    }

    public void InitializeContacts() {
        HideUIElements("contacts");
        System.out.println("Fetching contact list");
        boolean success = this.controllerModel.BuildContacts();
        if (success) {
            System.out.println("Building contact list view");
            this.contactsGUI = new ContactsGUI(this, this.controllerModel.GetContactNames());
        }
        else {
            System.out.println("No contacts found");
            this.contactsGUI = new ContactsGUI(this);
        }

        System.out.println("Showing contacts window");
        this.contactsGUI.getUsername(this.m_username);
        this.contactsGUI.setVisible(true);
    }

    public void InitializeMessage(ArrayList<String> usernames) {
        BlabberMessageController messageController =
                new BlabberMessageController(this.m_username, this.m_password, usernames);
    }

    public void LoginUser(String username, char[] password) {

        boolean success = this.controllerModel.UserLogin(username, password);
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
        boolean success = this.controllerModel.CreateUser(username, password);
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

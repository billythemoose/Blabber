import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class BlabberMessageController {

    private BlabberMessageModel messageModel;
    private MessagesGUI messagesGUI;


    public BlabberMessageController(String username, char[] password, ArrayList<String> usernames) {
        this.messageModel = new BlabberMessageModel(this, username, password, usernames);
        messagesGUI = new MessagesGUI(this, username, usernames);
        messagesGUI.setVisible(true);
    }

    public void SendMessage(String usernameTo, String message) {
        this.messageModel.SendMessage(usernameTo, message);
    }

    public void UpdateMessages(String username, String messsage) {
        this.messagesGUI.UpdateMessages(username, messsage);
    }

}


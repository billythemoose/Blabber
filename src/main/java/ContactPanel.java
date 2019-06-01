
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandae2
 */
public class ContactPanel extends JPanel{
    public JLabel contactUsername;
    public JToggleButton blockUserButton;
    public JCheckBox checkboxAddToConversation;
    public JPanel panel;
    
    public ContactPanel(String username){
        panel = new JPanel();
        contactUsername = new JLabel();
        blockUserButton = new JToggleButton();
        checkboxAddToConversation = new JCheckBox();
        panel.setBackground(Color.WHITE);
        contactUsername.setText(username);
        blockUserButton.setText("Block User?");
        panel.add(contactUsername);
        panel.add(blockUserButton);
        panel.add(checkboxAddToConversation);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setPreferredSize(new Dimension(100, 50));
        panel.setLayout(new GridLayout(4,6,2,2));
        panel.setVisible(true); 
        
        
    }
    
}

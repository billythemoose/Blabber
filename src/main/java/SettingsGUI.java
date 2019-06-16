
import java.awt.Color;
import javax.swing.JColorChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandae2
 */
public class SettingsGUI extends javax.swing.JFrame {
    private Color BlabberBackground = new Color(12, 130, 186); 
    private String username;

    /**
     * Creates new form MessagesGUI
     */
    public SettingsGUI(String _username, Color color) {
        if(color != BlabberBackground){
           BlabberBackground = color;
        }
        initComponents();
        getContentPane().setBackground( BlabberBackground );
        username = _username;
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeColor = new javax.swing.JButton();
        contactsButton = new javax.swing.JButton();
        convosButton = new javax.swing.JButton();
        changeLanguages = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        changeColor.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 24)); // NOI18N
        changeColor.setText("Change Color");
        changeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeColorActionPerformed(evt);
            }
        });

        contactsButton.setText("Contacts");
        contactsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactsButtonActionPerformed(evt);
            }
        });

        convosButton.setText("Convos");
        convosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convosButtonActionPerformed(evt);
            }
        });

        changeLanguages.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 24)); // NOI18N
        changeLanguages.setText("Change Languages");
        changeLanguages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeLanguagesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(convosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, Short.MAX_VALUE))
                .addGap(151, 151, 151)
                .addComponent(changeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(236, Short.MAX_VALUE)
                    .addComponent(changeLanguages, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(197, 197, 197)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(convosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contactsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(changeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(changeLanguages, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(257, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactsButtonActionPerformed
        ContactsGUI messages = new ContactsGUI(BlabberBackground);
        messages.getUsername(username);
        messages.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_contactsButtonActionPerformed

    private void convosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convosButtonActionPerformed
        MessagesGUI messages = new MessagesGUI(username,BlabberBackground);
        messages.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_convosButtonActionPerformed

    private void changeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeColorActionPerformed
        Color userColor = Color.WHITE; 
        userColor = JColorChooser.showDialog(null, "Pick a Color", userColor);
        if(userColor==null){
            userColor = (Color.WHITE);
        }
        BlabberBackground = userColor;
        getContentPane().setBackground(BlabberBackground);
    }//GEN-LAST:event_changeColorActionPerformed

    private void changeLanguagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLanguagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeLanguagesActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeColor;
    private javax.swing.JButton changeLanguages;
    private javax.swing.JButton contactsButton;
    private javax.swing.JButton convosButton;
    // End of variables declaration//GEN-END:variables
}

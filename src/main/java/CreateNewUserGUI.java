
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandae2
 */
public class CreateNewUserGUI extends javax.swing.JFrame {

    public Color BlabberBackground = new Color(12, 130, 186);
    
    public CreateNewUserGUI() {
        initComponents();
        getContentPane().setBackground(BlabberBackground);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        createLoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password Again:");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });

        passwordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sign up for Blabber, now!");

        createLoginButton.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 18)); // NOI18N
        createLoginButton.setText("Join the Blabberverse!");
        createLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailField)
                            .addComponent(usernameField)
                            .addComponent(passwordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(passwordField2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(createLoginButton)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField1ActionPerformed

    private void passwordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField2ActionPerformed

    private void createLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLoginButtonActionPerformed
        MessagesGUI messages = new MessagesGUI();
        messages.getUsername(usernameField.getText().toString());
        messages.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_createLoginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createLoginButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}

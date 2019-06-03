
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandae2
 */
public class ContactsGUI extends javax.swing.JFrame {
    
    public Color BlabberBackground = new Color(12, 130, 186);
    private String username;
    private final Border border = BorderFactory.createStrokeBorder(new BasicStroke(5.0f));
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton startConversationButton;
    private javax.swing.JLabel welcomeText;

    private BlabberController parentController;
    private ArrayList<JPanel> m_contactPanels = new ArrayList<JPanel>();
    private ArrayList<String> testContacts = new ArrayList<String>();
    


    public ContactsGUI(BlabberController blabberParent) {
        this.parentController = blabberParent;
        testContacts.add("nice");
        BuildInitialComponents();
        BuildContactComponent("name 1");
        BuildContactComponent("name 2");
        BuildContactComponent("name 3");
        BuildLayout();
    }

    public void BuildInitialComponents() {

        jFrame1 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        welcomeText = new javax.swing.JLabel();
        startConversationButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        welcomeText.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 22)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(255, 255, 255));
        welcomeText.setText("jLabel1");

        startConversationButton.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 14)); // NOI18N
        startConversationButton.setText("Start Conversation");
        startConversationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startConversationButtonActionPerformed(evt);
            }
        });

        getContentPane().setBackground( BlabberBackground );
    }

    public void BuildContactComponent(String username) {
        JPanel newContactPanel = new JPanel();
        JCheckBox newCheckBox = new JCheckBox();
        JToggleButton newToggleButton = new JToggleButton();
        JLabel newUsernameContact = new JLabel();

        javax.swing.GroupLayout contactPanelLayout = new javax.swing.GroupLayout(newContactPanel);
        newContactPanel.setLayout(contactPanelLayout);
        contactPanelLayout.setHorizontalGroup(
                contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contactPanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(newCheckBox)
                                        .addComponent(newUsernameContact))
                                .addContainerGap(92, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
        );
        contactPanelLayout.setVerticalGroup(
                contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contactPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(newUsernameContact)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newToggleButton)
                                .addGap(18, 18, 18))
        );

        newContactPanel.setPreferredSize(new java.awt.Dimension(265, 105));
        newUsernameContact.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 18)); // NOI18N
        newUsernameContact.setText("jLabel1");
        newToggleButton.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        newToggleButton.setText("Block user?");
        newCheckBox.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        newCheckBox.setText("Add to Conversation");

        newUsernameContact.setText(username);
        newContactPanel.setBackground(Color.WHITE);
        newContactPanel.setBorder(border);

        m_contactPanels.add(newContactPanel);
    }

    public void BuildLayout() {
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        GroupLayout.SequentialGroup sequentialGroupHorizontal = jPanel1Layout.createSequentialGroup();
        GroupLayout.SequentialGroup sequentialGroupVertical = jPanel1Layout.createSequentialGroup();
        // set the horizontal layout
        // horizontal layout is half of however many components there are
        GroupLayout.ParallelGroup parallelLeft = jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
        GroupLayout.ParallelGroup parallelRight = jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);

        for (int i = 0; i < m_contactPanels.size(); i++) {
            if (i%2 == 0) {
                parallelLeft.addComponent(m_contactPanels.get(i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE);
            }
            else {
                parallelRight.addComponent(m_contactPanels.get(i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE);
            }
        }

        sequentialGroupHorizontal.addContainerGap()
                .addGroup(parallelLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parallelRight)
                .addContainerGap(130, Short.MAX_VALUE);

        // set the vertical group
        // one group per 2 components
        // gap
        for (int i = 0; i < m_contactPanels.size(); i++) {
            GroupLayout.ParallelGroup parallel = jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
            parallel.addComponent(m_contactPanels.get(i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE);
            i++;
            if (i < m_contactPanels.size()) {
                parallel.addComponent(m_contactPanels.get(i), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE);
            }

            sequentialGroupVertical
                    .addGap(18, 18, 18)
                    .addGroup(parallel)
                    .addContainerGap(21, Short.MAX_VALUE);
        }

        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(sequentialGroupHorizontal));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sequentialGroupVertical));
        jPanel1.setLayout(jPanel1Layout);

        scrollPane.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(startConversationButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(welcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 164, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(welcomeText)
                                .addGap(18, 18, 18)
                                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(startConversationButton)
                                .addGap(23, 23, 23))
        );

        pack();
    }

    public void getUsername(String _username){
        username = _username;
        welcomeText.setText("Welcome to Blabberland, friend " + username);
    }

    private void startConversationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startConversationButtonActionPerformed
        MessagesGUI newMessage = new MessagesGUI(username);
        newMessage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_startConversationButtonActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

}

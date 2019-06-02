package main.java;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;



//Chat App
import java.awt.BorderLayout;
import java.awt.Dimension;



public class MessagesGUI extends javax.swing.JFrame
{
    private Color BlabberBackground = new Color(12, 130, 186); 
    private static String username;
    private static String convoText;


    // Chat App
    private JFrame frm = new JFrame("Chat App");
    private JPanel pnl = new JPanel();
    private static String chatLog = "";
    private static JTextArea chatTxt = new JTextArea(20,3);
    private static JTextField msgTxt = new JTextField(20);

    public MessagesGUI(String _username)
    {
        initComponents();
        getContentPane().setBackground( BlabberBackground );
        username = _username;
        convoText = "";
    }

    public MessagesGUI() { }

    public static void updateView(String message)
    {
        //                              //
        //// Start of Messages Thread ////
        //                              //
//        try
//        {
//            Socket socket = new Socket("localhost", 1234);
//            System.out.println("Blabber application connected... ");
//            msgTxt.addKeyListener(new KeyListener()
//            {
//                @Override
//                public void keyTyped(KeyEvent e) {}
//
//                @Override
//                public void keyReleased(KeyEvent e)
//                {
//                    if(e.getKeyCode() == KeyEvent.VK_ENTER)
//                    {
//                        String message = msgTxt.getText();
//                        PrintWriter outStream;
//                        try
//                        {
//                            outStream = new PrintWriter(socket.getOutputStream());
//                            outStream.println(message);
//                            outStream.flush();
//                        }
//                        catch(IOException e1)
//                        {
//                            e1.printStackTrace();
//                        }
//                    }
//                }
//
//                @Override
//                public void keyPressed(KeyEvent e){}
//            });
//
        chatLog += message + "\n";
        System.out.println(chatLog);
        chatTxt.setText(chatLog);
//
//        convoText+="\n"+username.toUpperCase()+" says: "+userNewMessage.getText().toString();
//        allMessages.setText(convoText);
//        userNewMessage.setText("");
//
//            MessagesThread messagesThread = new MessagesThread(socket);
//            messagesThread.start();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
        //                            //
        //// End of Messages Thread ////
        //                            //
    }

    private void initComponents()
    {
        jScrollPane1 = new javax.swing.JScrollPane();
        userNewMessage = new javax.swing.JTextArea();
        sendMessageButton = new javax.swing.JButton();
        contactsButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        convosButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        allMessages = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blabber Messages");
        userNewMessage.setColumns(20);

        userNewMessage.setRows(5);
        jScrollPane1.setViewportView(userNewMessage);

        sendMessageButton.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 1, 18));
        sendMessageButton.setText("Send!");
        sendMessageButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sendMessageButtonActionPerformed(evt);
            }
        });

        contactsButton.setText("Contacts");
        contactsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                contactsButtonActionPerformed(evt);
            }
        });

        settingsButton.setText("Settings");
        settingsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                settingsButtonActionPerformed(evt);
            }
        });

        convosButton.setText("Convos");
        convosButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                convosButtonActionPerformed(evt);
            }
        });

        allMessages.setColumns(20);
        allMessages.setRows(5);
        jScrollPane3.setViewportView(allMessages);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contactsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(convosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendMessageButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane3)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(convosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contactsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(sendMessageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        pack();
    }

    private void contactsButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        ContactsGUI messages = new ContactsGUI();
        messages.getUsername(username);
        messages.setVisible(true);
        setVisible(false);
    }

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        // TODO add your handling code here:
    }

    private void convosButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        // TODO add your handling code here:
    }

    public void sendMessageButtonActionPerformed(ActionEvent evt)
    {
        convoText+="\n"+username.toUpperCase()+" says: "+userNewMessage.getText().toString();
        allMessages.setText(convoText);
        userNewMessage.setText("");
    }

    public static void main(String args[])
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MessagesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessagesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessagesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessagesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MessagesGUI().setVisible(true);
            }
        });
    }

    private static javax.swing.JTextArea allMessages;
    private javax.swing.JButton contactsButton;
    private javax.swing.JButton convosButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JButton settingsButton;
    private static javax.swing.JTextArea userNewMessage;
}

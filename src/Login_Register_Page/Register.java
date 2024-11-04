/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login_Register_Page;

/**
 *
 * @author Title
 */
import Users.AllUser;
import Users.Lecturer;
import Users.User;
import Users.Student;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setResizable(false);
        addClearOnFocusListener(usernameTF,"b6620xxxxxx or axxxx");
        addClearOnFocusListener(firstNameTF,"Input your name pls");
        addClearOnFocusListener(sureNameTF,"Input your surname pls");
        addClearOnFocusListener(usernameTF,"Have user already");
        addClearOnFocusListener(passwordTF, "1 big letter and 3 small letter");
        addClearOnFocusListener(passwordTF, "Password not equal");
        //
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        KuScheduletxtLB = new javax.swing.JLabel();
        registertxtLB1 = new javax.swing.JLabel();
        registericonLB = new javax.swing.JLabel();
        //jPanel3 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(Color.white);

                // Draw rounded rectangle with the specified corner radius
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 60, 60);
                g2.dispose();
            }
        };
        confirmPassLB = new javax.swing.JLabel();
        firstNameLB = new javax.swing.JLabel();
        surNameLB = new javax.swing.JLabel();
        usernameLB = new javax.swing.JLabel();
        passLB = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        sureNameTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        backBT = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        confirmPassTF = new javax.swing.JPasswordField();
        passwordTF = new javax.swing.JPasswordField();
        ShowPassCB = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 188, 119));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(2, 188, 119));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel2.setLayout(null);

        KuScheduletxtLB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        KuScheduletxtLB.setForeground(new java.awt.Color(255, 255, 255));
        KuScheduletxtLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KuScheduletxtLB.setText("Ku Schedule");
        KuScheduletxtLB.setToolTipText("");
        jPanel2.add(KuScheduletxtLB);
        KuScheduletxtLB.setBounds(130, 350, 150, 30);

        registertxtLB1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registertxtLB1.setForeground(new java.awt.Color(255, 255, 255));
        registertxtLB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registertxtLB1.setText("Register");
        registertxtLB1.setToolTipText("");
        jPanel2.add(registertxtLB1);
        registertxtLB1.setBounds(130, 320, 150, 30);

        registericonLB.setIcon(new javax.swing.ImageIcon("src/resource/Image/JobApp_preview.png")); // NOI18N
        jPanel2.add(registericonLB);
        registericonLB.setBounds(-30, 30, 430, 350);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(400, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel3.setLayout(null);

        confirmPassLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmPassLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        confirmPassLB.setText("Confirm Password");
        jPanel3.add(confirmPassLB);
        confirmPassLB.setBounds(20, 340, 140, 40);

        firstNameLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstNameLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstNameLB.setText("Firstname");
        jPanel3.add(firstNameLB);
        firstNameLB.setBounds(20, 60, 130, 40);

        surNameLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        surNameLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        surNameLB.setText("Surname");
        jPanel3.add(surNameLB);
        surNameLB.setBounds(20, 130, 130, 40);

        usernameLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usernameLB.setText("Username");
        jPanel3.add(usernameLB);
        usernameLB.setBounds(20, 200, 120, 40);

        passLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passLB.setText("Password");
        jPanel3.add(passLB);
        passLB.setBounds(20, 270, 130, 40);

        firstNameTF.setPreferredSize(new java.awt.Dimension(180, 40));
        jPanel3.add(firstNameTF);
        firstNameTF.setBounds(180, 60, 180, 40);

        sureNameTF.setPreferredSize(new java.awt.Dimension(180, 40));
        jPanel3.add(sureNameTF);
        sureNameTF.setBounds(180, 130, 180, 40);

        usernameTF.setPreferredSize(new java.awt.Dimension(180, 40));
        jPanel3.add(usernameTF);
        usernameTF.setBounds(180, 200, 180, 40);

        backBT.setFocusPainted(false);
        backBT.setText("Back");
        backBT.setActionCommand("");
        backBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBTMouseClicked(evt);
            }
        });
        jPanel3.add(backBT);
        backBT.setBounds(20, 410, 72, 23);

        confirm.setFocusPainted(false);
        confirm.setText("Confirm");
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmMouseClicked(evt);
            }
        });
        jPanel3.add(confirm);
        confirm.setBounds(290, 410, 80, 23);

        confirmPassTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmPassTF.setPreferredSize(new java.awt.Dimension(180, 40));

        jPanel3.add(confirmPassTF);
        confirmPassTF.setBounds(180, 340, 180, 40);

        passwordTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordTF.setPreferredSize(new java.awt.Dimension(180, 40));

        jPanel3.add(passwordTF);
        passwordTF.setBounds(180, 270, 180, 40);

        ShowPassCB.setOpaque(false);
        ShowPassCB.setFocusPainted(false);
        ShowPassCB.setText("Show Password");
        ShowPassCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassCBActionPerformed(evt);
            }
        });
        jPanel3.add(ShowPassCB);
        ShowPassCB.setBounds(180, 310, 130, 20);

        jPanel1.add(jPanel3);
//        jPanel3.setBounds(0, 0, 400, 500);
        jPanel3.setBounds(10, 20, 380, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void ConfirmMouseClicked(java.awt.event.MouseEvent evt) {
        boolean check = true ;
        String fullName = firstNameTF.getText();
        String surName = sureNameTF.getText();
        String username = usernameTF.getText();
        String password = passwordTF.getText();
        String conPass = confirmPassTF.getText();
        if(fullName.equals("")){
            firstNameTF.setText("Input your name pls");
            check = false;
        }
        if(surName.equals("")){
            sureNameTF.setText("Input your surname pls");
            check = false;
        }
        if(((username.indexOf("b") == 0) && username.length() == 11)||((username.indexOf("a") == 0) && username.length() == 5)){
            AllUser a = new AllUser();
            if((AllUser.readUserObjFile())!=null){
                a = AllUser.readUserObjFile();
                for(String i : a.getAllkey()){
                    if(username.equals(i)){
                        System.out.println(i);
                        usernameTF.setText("Have user already");
                        check = false;
                    }
                }
            }
            int countBigLetter = 0;
            int countSmallLetter = 0;
            for (char i : password.toCharArray()) {
                if(i > 'A' && i < 'Z') {
                    countBigLetter ++;
                }else if (i > 'a' && i < 'z') {
                    countSmallLetter ++;
                }
            }
            if (countBigLetter < 1 && countSmallLetter < 2 && check) {
                passwordTF.setText("1 big letter and 3 small letter");
                passwordTF.setEchoChar((char) 0);
                check = false;
            }
            if (!(password.equals(conPass)) && check) {
                passwordTF.setText("Password not equal");
                passwordTF.setEchoChar((char) 0);
                check = false;
            }
            if(check){
//            System.out.println("11");
                if(username.contains("b")){
                    User newUser = new Student(username,fullName,surName,password,a);
                    AllUser.writeUserObjFile(a);
                    new Login();
                    this.dispose();
                }else if (username.contains("a")){
                    String showPopUp = "Enter Lecturer code";
                    boolean checkPass = true;
                    boolean firstInput = true;
                    while(checkPass){
                        JTextField passwordField = new JPasswordField();
                        int option = JOptionPane.showConfirmDialog(
                                null,
                                passwordField,
                                showPopUp,
                                JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.PLAIN_MESSAGE);
                        if(option == JOptionPane.OK_OPTION){
                            if(passwordField.getText().equals("Inwza007xlucifer")){
                                checkPass = false;
                                User newUser = new Lecturer(username,fullName,surName,password,a);
                                AllUser.writeUserObjFile(a);
                                new Login();
                                this.dispose();
                            }
                        }else{
                            System.exit(0);
                        }
                        if (firstInput) {
                            showPopUp = "Wrong password Try again!";
                            firstInput = false;
                        }
                    }
                }
            }
        }else{
            usernameTF.setText("b6620xxxxxx or axxxx");
        }
    }

    private void BackBTMouseClicked(java.awt.event.MouseEvent evt) {
        new Login();
        this.dispose();
    }

    private void ShowPassCBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(ShowPassCB.isSelected()){
            passwordTF.setEchoChar((char)0);
        }else{
            if(!passwordTF.getText().equals("Password")) {
                passwordTF.setEchoChar('●');
            }
        }
    }


    private void addClearOnFocusListener(javax.swing.JTextField textField, String errorMessage) {
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Clear the field only if it shows the error message
                if (textField.getText().equals(errorMessage)) {
                    textField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton backBT;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel confirmPassLB;
    private javax.swing.JLabel firstNameLB;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JLabel KuScheduletxtLB;
    private javax.swing.JLabel passLB;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JLabel registericonLB;
    private javax.swing.JLabel registertxtLB1;
    private javax.swing.JCheckBox ShowPassCB;
    private javax.swing.JLabel surNameLB;
    private javax.swing.JTextField sureNameTF;
    private javax.swing.JLabel usernameLB;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JPasswordField confirmPassTF;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox showpassCB;
    // End of variables declaration
}

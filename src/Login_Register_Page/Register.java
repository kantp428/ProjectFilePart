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
        addClearOnFocusListener(firstNameTF,"Input your name pls");
        addClearOnFocusListener(sureNameTF,"Input your surname pls");
        addClearOnFocusListener(usernameTF,"Have user already");
        addClearOnFocusListener(usernameTF, "Start with 'b' followed by your student ID");
        addClearOnFocusListener(usernameTF,"Start with 'b' or 'a'");
        addClearOnFocusListener(passwordTF, "1 big letter and 3 small letter");
        addClearOnFocusListener(passwordTF, "Password not equal");
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
        RegistertxtLB1 = new javax.swing.JLabel();
        RegistericonLB = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ConfirmPassLB = new javax.swing.JLabel();
        FirstNameLB = new javax.swing.JLabel();
        SureNameLB = new javax.swing.JLabel();
        UsernameLB = new javax.swing.JLabel();
        PassLB = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        sureNameTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        BackBT = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        confirmPassTF = new javax.swing.JPasswordField();
        passwordTF = new javax.swing.JPasswordField();
        ShowPassCB = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
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
        KuScheduletxtLB.setBounds(150, 350, 150, 30);

        RegistertxtLB1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegistertxtLB1.setForeground(new java.awt.Color(255, 255, 255));
        RegistertxtLB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegistertxtLB1.setText("Register");
        RegistertxtLB1.setToolTipText("");
        jPanel2.add(RegistertxtLB1);
        RegistertxtLB1.setBounds(150, 320, 150, 30);

        RegistericonLB.setIcon(new javax.swing.ImageIcon("src/resource/Image/JobApp_preview.png")); // NOI18N
        jPanel2.add(RegistericonLB);
        RegistericonLB.setBounds(-10, 30, 430, 350);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(400, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel3.setLayout(null);

        ConfirmPassLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ConfirmPassLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ConfirmPassLB.setText("Confirm Password");
        jPanel3.add(ConfirmPassLB);
        ConfirmPassLB.setBounds(20, 340, 140, 40);

        FirstNameLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FirstNameLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FirstNameLB.setText("First Name");
        jPanel3.add(FirstNameLB);
        FirstNameLB.setBounds(20, 60, 130, 40);

        SureNameLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SureNameLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SureNameLB.setText("Sure Name");
        jPanel3.add(SureNameLB);
        SureNameLB.setBounds(20, 130, 130, 40);

        UsernameLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UsernameLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsernameLB.setText("Username");
        jPanel3.add(UsernameLB);
        UsernameLB.setBounds(20, 200, 120, 40);

        PassLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PassLB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PassLB.setText("Password");
        jPanel3.add(PassLB);
        PassLB.setBounds(20, 270, 130, 40);

        firstNameTF.setPreferredSize(new java.awt.Dimension(180, 40));
        jPanel3.add(firstNameTF);
        firstNameTF.setBounds(180, 60, 180, 40);

        sureNameTF.setPreferredSize(new java.awt.Dimension(180, 40));
        jPanel3.add(sureNameTF);
        sureNameTF.setBounds(180, 130, 180, 40);

        usernameTF.setPreferredSize(new java.awt.Dimension(180, 40));
        jPanel3.add(usernameTF);
        usernameTF.setBounds(180, 200, 180, 40);

        BackBT.setFocusPainted(false);
        BackBT.setText("Back");
        BackBT.setActionCommand("");
        BackBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBTMouseClicked(evt);
            }
        });
        jPanel3.add(BackBT);
        BackBT.setBounds(20, 410, 72, 23);

        Confirm.setFocusPainted(false);
        Confirm.setText("Confirm");
        Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmMouseClicked(evt);
            }
        });
        jPanel3.add(Confirm);
        Confirm.setBounds(290, 410, 80, 23);

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
        jPanel3.setBounds(0, 0, 400, 500);

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
        if(!(username.contains("b") || username.contains("a"))){
            usernameTF.setText("Start with 'b' or 'a'");
            check = false;
        }
        if(username.contains("b") && username.length() !=11 ){
            usernameTF.setText("Start with 'b' followed by your student ID");
        }
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
    private javax.swing.JButton BackBT;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel ConfirmPassLB;
    private javax.swing.JLabel FirstNameLB;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JLabel KuScheduletxtLB;
    private javax.swing.JLabel PassLB;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JLabel RegistericonLB;
    private javax.swing.JLabel RegistertxtLB1;
    private javax.swing.JCheckBox ShowPassCB;
    private javax.swing.JLabel SureNameLB;
    private javax.swing.JTextField sureNameTF;
    private javax.swing.JLabel UsernameLB;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JPasswordField confirmPassTF;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox showpassCB;
    // End of variables declaration
}

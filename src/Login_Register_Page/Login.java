package Login_Register_Page;

import Users.AllUser;
import Users.User;
import Function.Time;
import MainPage.LecturerPage;
import MainPage.StudentPage;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        addLoginStyle(UsernameTF);
        addLoginStyle(PasswordTF);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LeftBackGroundpanel = new javax.swing.JPanel();
        scheduleiconLB = new javax.swing.JLabel();
        KuScheduletxtLB = new javax.swing.JLabel();
        RightBackGroundpanel = new javax.swing.JPanel();
        LoginLB = new javax.swing.JLabel();
        KuiconLB = new javax.swing.JLabel();
        UsernameTF = new javax.swing.JTextField();
        PassiconLB = new javax.swing.JLabel();
        UsericonLB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        SignupButton = new javax.swing.JButton();
        PasswordTF = new javax.swing.JPasswordField();
        showpassCB = new javax.swing.JCheckBox();
        ShowIncorrect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        LeftBackGroundpanel.setBackground(new java.awt.Color(2, 188, 119));
        LeftBackGroundpanel.setPreferredSize(new java.awt.Dimension(400, 500));
        LeftBackGroundpanel.setLayout(null);

        scheduleiconLB.setIcon(new javax.swing.ImageIcon("src/resource/Image/150x150_schedule.png")); // NOI18N
        scheduleiconLB.setText("jLabel1");
        scheduleiconLB.setPreferredSize(new java.awt.Dimension(150, 150));
        LeftBackGroundpanel.add(scheduleiconLB);
        scheduleiconLB.setBounds(130, 130, 150, 150);

        KuScheduletxtLB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        KuScheduletxtLB.setForeground(new java.awt.Color(255, 255, 255));
        KuScheduletxtLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KuScheduletxtLB.setText("KU schedule");
        LeftBackGroundpanel.add(KuScheduletxtLB);
        KuScheduletxtLB.setBounds(120, 280, 150, 50);

        jPanel1.add(LeftBackGroundpanel);
        LeftBackGroundpanel.setBounds(0, 0, 400, 500);

        RightBackGroundpanel.setBackground(new java.awt.Color(255, 255, 255));
        RightBackGroundpanel.setPreferredSize(new java.awt.Dimension(400, 500));
        RightBackGroundpanel.setLayout(null);

        LoginLB.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        LoginLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLB.setText("Login");
        RightBackGroundpanel.add(LoginLB);
        LoginLB.setBounds(160, 170, 80, 43);

        KuiconLB.setIcon(new javax.swing.ImageIcon("src/resource/picture/100x100_ku_icon_no_bg.png")); // NOI18N
        RightBackGroundpanel.add(KuiconLB);
        KuiconLB.setBounds(150, 40, 100, 100);

        UsernameTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UsernameTF.setText("Username");
        UsernameTF.setToolTipText("");
        UsernameTF.setRequestFocusEnabled(true);
        UsernameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameTFFocusLost(evt);
            }
        });
        RightBackGroundpanel.add(UsernameTF);
        UsernameTF.setBounds(140, 240, 180, 40);

        PassiconLB.setIcon(new javax.swing.ImageIcon("src/resource/Image/100x100_pass.png")); // NOI18N
        RightBackGroundpanel.add(PassiconLB);
        PassiconLB.setBounds(100, 300, 20, 20);

        UsericonLB.setIcon(new javax.swing.ImageIcon("src/resource/Image/100x100user.png")); // NOI18N
        RightBackGroundpanel.add(UsericonLB);
        UsericonLB.setBounds(100, 250, 20, 20);

        jLabel3.setText("if don't have an account ");
        RightBackGroundpanel.add(jLabel3);
        jLabel3.setBounds(10, 440, 140, 16);

        LoginButton.setFocusPainted(false);
        LoginButton.setText("Login");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        RightBackGroundpanel.add(LoginButton);
        LoginButton.setBounds(250, 360, 70, 23);

        SignupButton.setFocusPainted(false);
        SignupButton.setText("Sign up");
        SignupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupButtonMouseClicked(evt);
            }
        });
        RightBackGroundpanel.add(SignupButton);
        SignupButton.setBounds(150, 440, 72, 20);

        PasswordTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordTF.setText("Password");
        PasswordTF.setEchoChar((char) 0);
        PasswordTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordTFFocusLost(evt);
            }
        });
        RightBackGroundpanel.add(PasswordTF);
        PasswordTF.setBounds(140, 290, 180, 40);

        showpassCB.setOpaque(false);
        showpassCB.setFocusPainted(false);
        showpassCB.setText("Show Password");
        showpassCB.setToolTipText("");
        showpassCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassCBActionPerformed(evt);
            }
        });
        RightBackGroundpanel.add(showpassCB);
        showpassCB.setBounds(140, 340, 160, 20);

        ShowIncorrect.setForeground(new java.awt.Color(255, 51, 51));
        ShowIncorrect.setText("");
        RightBackGroundpanel.add(ShowIncorrect);
        ShowIncorrect.setBounds(250, 220, 70, 16);

        jPanel1.add(RightBackGroundpanel);
        RightBackGroundpanel.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void showpassCBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(showpassCB.isSelected()){
            PasswordTF.setEchoChar((char)0);
        }else{
            if (!PasswordTF.getText().equals("Password")) {
                PasswordTF.setEchoChar('●');
            }
        }
    }

    private void UsernameTFFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if (UsernameTF.getText().equals("Username")) {
            UsernameTF.setText("");
        }
        UsernameTF.setForeground(Color.BLACK);
    }
    private void UsernameTFFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if(UsernameTF.getText().length()==0){
            addLoginStyle(UsernameTF);
            UsernameTF.setText("Username");
        }
    }

    private void PasswordTFFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if(PasswordTF.getText().equals("Password")){
            PasswordTF.setText("");
            PasswordTF.requestFocus();
            PasswordTF.setEchoChar('●');
            removeLoginStyle(PasswordTF);
        }
        PasswordTF.setForeground(Color.BLACK);
    }
    private void PasswordTFFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if(PasswordTF.getText().length()==0){
            addLoginStyle(PasswordTF);
            PasswordTF.setText("Password");
            PasswordTF.setEchoChar((char) 0);
        }
    }

    private void SignupButtonMouseClicked(java.awt.event.MouseEvent evt) {
        Register rgst = new Register();
        rgst.setVisible(true);
        rgst.pack();
        rgst.setLocationRelativeTo(null);
        rgst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {
        boolean haveUser = false;
        String username = UsernameTF.getText();
        String password = PasswordTF.getText();
        AllUser a = new AllUser();
        a = AllUser.readUserObjFile();
        for(String i : a.getAllkey()){
            if(username.equals(i)){
                haveUser = true;
                break;
            }
        }
        if (haveUser){
            if(password.equals(a.getUserMap().get(username).getPassword())){
                if(username.contains("b")){
                    User student = a.getUserMap().get(username);
                    StudentPage stp = new StudentPage(student);
                    stp.setVisible(true);
                    stp.pack();
                    stp.setLocationRelativeTo(null);
                    stp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                }else if(username.contains("a")){
                    User lecturer = a.getUserMap().get(username);
                    LecturerPage ltp = new LecturerPage(a.getUserMap().get(username));
                    ltp.setVisible(true);
                    ltp.pack();
                    ltp.setLocationRelativeTo(null);
                    ltp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                }
            }else{
                ShowIncorrect.setText("Incorrected");
                Time.delay(2000,()->ShowIncorrect.setText(""));
            }
        }else{
            int answer = JOptionPane.showConfirmDialog(null, "Do you want to create an account?", "User not found", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
                Register rgst = new Register();
                rgst.setVisible(true);
                rgst.pack();
                rgst.setLocationRelativeTo(null);
                rgst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Dispose the current Login JFrame
                dispose();
            } else {
                System.exit(0);
            }
        }
    }

    public void addLoginStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }

    public void removeLoginStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel KuScheduletxtLB;
    private javax.swing.JLabel KuiconLB;
    private javax.swing.JPanel LeftBackGroundpanel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLB;
    private javax.swing.JLabel PassiconLB;
    private javax.swing.JPasswordField PasswordTF;
    private javax.swing.JPanel RightBackGroundpanel;
    private javax.swing.JLabel ShowIncorrect;
    private javax.swing.JButton SignupButton;
    private javax.swing.JLabel UsericonLB;
    private javax.swing.JTextField UsernameTF;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel scheduleiconLB;
    private javax.swing.JCheckBox showpassCB;
    // End of variables declaration
}

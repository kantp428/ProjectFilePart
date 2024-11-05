package Login_Register_Page;

import MainPage.LecturerPage;
import Users.AllUser;
import Users.User;
import Function.Time;
import MainPage.StudentPage;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.text.DefaultEditorKit;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addLoginStyle(UsernameTF);
        addLoginStyle(passwordTF);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        leftBackGroundpanel = new javax.swing.JPanel();
        scheduleiconLB = new javax.swing.JLabel();
        KuScheduletxtLB = new javax.swing.JLabel();
        rightBackGroundpanel = new javax.swing.JPanel();
        loginLB = new javax.swing.JLabel();
        KuiconLB = new javax.swing.JLabel();
        UsernameTF = new javax.swing.JTextField();
        passiconLB = new javax.swing.JLabel();
        usericonLB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        SignupButton = new javax.swing.JButton();
        passwordTF = new javax.swing.JPasswordField();
        showpassCB = new javax.swing.JCheckBox();
        showIncorrect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        leftBackGroundpanel.setBackground(new java.awt.Color(2, 188, 119));
        leftBackGroundpanel.setPreferredSize(new java.awt.Dimension(400, 500));
        leftBackGroundpanel.setLayout(null);

        scheduleiconLB.setIcon(new javax.swing.ImageIcon("src/resource/Image/150x150_schedule.png")); // NOI18N
        scheduleiconLB.setText("jLabel1");
        scheduleiconLB.setPreferredSize(new java.awt.Dimension(150, 150));
        leftBackGroundpanel.add(scheduleiconLB);
        scheduleiconLB.setBounds(130, 130, 150, 150);

        KuScheduletxtLB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        KuScheduletxtLB.setForeground(new java.awt.Color(255, 255, 255));
        KuScheduletxtLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KuScheduletxtLB.setText("KU schedule");
        leftBackGroundpanel.add(KuScheduletxtLB);
        KuScheduletxtLB.setBounds(120, 280, 150, 50);

        jPanel1.add(leftBackGroundpanel);
        leftBackGroundpanel.setBounds(0, 0, 400, 500);

        rightBackGroundpanel.setBackground(new java.awt.Color(255, 255, 255));
        rightBackGroundpanel.setPreferredSize(new java.awt.Dimension(400, 500));
        rightBackGroundpanel.setLayout(null);

        loginLB.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        loginLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLB.setText("Login");
        rightBackGroundpanel.add(loginLB);
        loginLB.setBounds(160, 170, 80, 43);

        KuiconLB.setIcon(new javax.swing.ImageIcon("src/resource/Image/100x100_ku_icon_no_bg.png")); // NOI18N
        rightBackGroundpanel.add(KuiconLB);
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
        rightBackGroundpanel.add(UsernameTF);
        UsernameTF.setBounds(140, 240, 180, 40);

        passiconLB.setIcon(new javax.swing.ImageIcon("src/resource/Image/100x100_pass.png")); // NOI18N
        rightBackGroundpanel.add(passiconLB);
        passiconLB.setBounds(100, 300, 20, 20);

        usericonLB.setIcon(new javax.swing.ImageIcon("src/resource/Image/100x100user.png")); // NOI18N
        rightBackGroundpanel.add(usericonLB);
        usericonLB.setBounds(100, 250, 20, 20);

        jLabel3.setText("if don't have an account ");
        rightBackGroundpanel.add(jLabel3);
        jLabel3.setBounds(10, 440, 140, 16);

        loginButton.setFocusPainted(false);
        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        enterKeyDispatcher = e -> {
            if (e.getID() == KeyEvent.KEY_PRESSED && e.getKeyCode() == KeyEvent.VK_ENTER) {
                LoginBehavior();
                return true;
            }
            return false;
        };
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(enterKeyDispatcher);
        rightBackGroundpanel.add(loginButton);
        loginButton.setBounds(250, 360, 70, 23);

        SignupButton.setFocusPainted(false);
        SignupButton.setText("Sign up");
        SignupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupButtonMouseClicked(evt);
            }
        });
        rightBackGroundpanel.add(SignupButton);
        SignupButton.setBounds(150, 440, 80, 20);


        passwordTF.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK), "none");
        passwordTF.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK), "none");
        UsernameTF.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK), "none");
        UsernameTF.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK), "none");
        passwordTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordTF.setText("Password");
        passwordTF.setEchoChar((char) 0);
        passwordTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordTFFocusLost(evt);
            }
        });
        rightBackGroundpanel.add(passwordTF);
        passwordTF.setBounds(140, 290, 180, 40);

        showpassCB.setOpaque(false);
        showpassCB.setFocusPainted(false);
        showpassCB.setText("Show Password");
        showpassCB.setToolTipText("");
        showpassCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassCBActionPerformed(evt);
            }
        });
        rightBackGroundpanel.add(showpassCB);
        showpassCB.setBounds(140, 340, 160, 20);

        showIncorrect.setForeground(new java.awt.Color(255, 51, 51));
        showIncorrect.setText("");
        rightBackGroundpanel.add(showIncorrect);
        showIncorrect.setHorizontalTextPosition(SwingConstants.CENTER);
        showIncorrect.setBounds(195, 220, 200, 16);

        jPanel1.add(rightBackGroundpanel);
        rightBackGroundpanel.setBounds(400, 0, 400, 500);

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
            passwordTF.setEchoChar((char)0);
        }else{
            if (!passwordTF.getText().equals("Password")) {
                passwordTF.setEchoChar('●');
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
        if(passwordTF.getText().equals("Password")){
            passwordTF.setText("");
            passwordTF.requestFocus();
            passwordTF.setEchoChar('●');
            removeLoginStyle(passwordTF);
        }
        passwordTF.setForeground(Color.BLACK);
    }
    private void PasswordTFFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if(passwordTF.getText().length()==0){
            addLoginStyle(passwordTF);
            passwordTF.setText("Password");
            passwordTF.setEchoChar((char) 0);
        }
    }

    private void SignupButtonMouseClicked(java.awt.event.MouseEvent evt) {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(enterKeyDispatcher);
        new Register();
        this.dispose();
    }

    private void LoginBehavior() {
        boolean haveUser = false;
        String username = UsernameTF.getText();
        String password = passwordTF.getText();
        AllUser a ;
        if ((AllUser.readUserObjFile()) != null){
            a = AllUser.readUserObjFile();
            if(username != null){
                for(String i : a.getAllkey()){
                    //System.out.println(i);
                    if(username.equals(i)){
                        haveUser = true;
                        break;
                    }
                }
            }
            if (haveUser){
                if(password.equals(a.getUserMap().get(username).getPassword())){
                    if(username.contains("b")){
                        User student = a.getUserMap().get(username);
                        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(enterKeyDispatcher);
                        StudentPage stp = new StudentPage(student);
                        this.dispose();
                    }else if(username.contains("a")){
                        User lecturer = a.getUserMap().get(username);
                        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(enterKeyDispatcher);
                        LecturerPage ltp = new LecturerPage(a.getUserMap().get(username));
                        this.dispose();
                    }
                }else{
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(enterKeyDispatcher);
                    int answer = JOptionPane.showConfirmDialog(
                            null,
                            "Do you want to create an new account?",
                            "User Incorrected password",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            new ImageIcon("src/resource/Image/confirmButtonImage.png")
                    );
                    if(answer == JOptionPane.YES_OPTION){
                        a.getUserMap().remove(username);
                        AllUser.writeUserObjFile(a);
                    }else{
                        showIncorrect.setText("Incorrected password");
                        Time.delay(2000,()-> showIncorrect.setText(""));
                    }
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(enterKeyDispatcher);
                }
            }else{
                JLabel message = new JLabel("Do you want to create an account?");
                message.setForeground(Color.RED);
                message.setOpaque(false);
                KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(enterKeyDispatcher);
                int answer = JOptionPane.showConfirmDialog(null, message, "User not found", JOptionPane.YES_NO_OPTION);
                System.out.println("removeKey");
                if (answer == JOptionPane.YES_OPTION) {
                    new Register();
                    dispose();
                } else {
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(enterKeyDispatcher);
                }
            }
        }
    }

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {
        boolean haveUser = false;
        String username = UsernameTF.getText();
        String password = passwordTF.getText();
        AllUser a ;
        if ((AllUser.readUserObjFile()) != null){
            a = AllUser.readUserObjFile();
            if(username != null){
                for(String i : a.getAllkey()){
                    //System.out.println(i);
                    if(username.equals(i)){
                        haveUser = true;
                        break;
                    }
                }
            }
            if (haveUser){
                if(password.equals(a.getUserMap().get(username).getPassword())){
                    if(username.contains("b")){
                        User student = a.getUserMap().get(username);
                        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(enterKeyDispatcher);
                        StudentPage stp = new StudentPage(student);
                        this.dispose();
                    }else if(username.contains("a")){
                        User lecturer = a.getUserMap().get(username);
                        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(enterKeyDispatcher);
                        LecturerPage ltp = new LecturerPage(a.getUserMap().get(username));
                        this.dispose();
                    }
                }else{
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(enterKeyDispatcher);
                    int answer = JOptionPane.showConfirmDialog(
                            null,
                            "Do you want to create an new account?",
                            "User Incorrected password",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            new ImageIcon("src/resource/Image/confirmButtonImage.png")
                    );
                    if(answer == JOptionPane.YES_OPTION){
                        a.getUserMap().remove(username);
                        AllUser.writeUserObjFile(a);
                    }else{
                        showIncorrect.setText("Incorrected password");
                        Time.delay(2000,()-> showIncorrect.setText(""));
                    }
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(enterKeyDispatcher);
                }
            }else{
                JLabel message = new JLabel("Do you want to create an account?");
                message.setForeground(Color.RED);
                message.setOpaque(false);
                KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(enterKeyDispatcher);
                int answer = JOptionPane.showConfirmDialog(null, message, "User not found", JOptionPane.YES_NO_OPTION);
                if (answer == JOptionPane.YES_OPTION) {
                    new Register();
                    dispose();
                } else {
                    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(enterKeyDispatcher);
                }
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
    private KeyEventDispatcher enterKeyDispatcher;
    private javax.swing.JLabel KuScheduletxtLB;
    private javax.swing.JLabel KuiconLB;
    private javax.swing.JPanel leftBackGroundpanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLB;
    private javax.swing.JLabel passiconLB;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JPanel rightBackGroundpanel;
    private javax.swing.JLabel showIncorrect;
    private javax.swing.JButton SignupButton;
    private javax.swing.JLabel usericonLB;
    private javax.swing.JTextField UsernameTF;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel scheduleiconLB;
    private javax.swing.JCheckBox showpassCB;
    // End of variables declaration
}

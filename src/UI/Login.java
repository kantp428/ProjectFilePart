/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author Title
 */
import AllUser.AllUser;
import Function.Time;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        addLoginStyle(UsernameTF);
        addLoginStyle(PasswordTF);
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

        scheduleiconLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Title\\Documents\\NetBeansProjects\\mavenproject1\\src\\pic\\150x150 schedule.png")); // NOI18N
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

        KuiconLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Title\\Documents\\NetBeansProjects\\mavenproject1\\src\\pic\\100x100 ku icon no bg.png")); // NOI18N
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

        PassiconLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Title\\Documents\\NetBeansProjects\\mavenproject1\\src\\pic\\100x100 pass.png")); // NOI18N
        RightBackGroundpanel.add(PassiconLB);
        PassiconLB.setBounds(100, 300, 20, 20);

        UsericonLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Title\\Documents\\NetBeansProjects\\mavenproject1\\src\\pic\\100x100user.png")); // NOI18N
        RightBackGroundpanel.add(UsericonLB);
        UsericonLB.setBounds(100, 250, 20, 20);

        jLabel3.setText("if don't have an account ");
        RightBackGroundpanel.add(jLabel3);
        jLabel3.setBounds(10, 440, 140, 16);

        LoginButton.setText("Login");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        RightBackGroundpanel.add(LoginButton);
        LoginButton.setBounds(250, 360, 70, 23);

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
            PasswordTF.setEchoChar('*');
        }
    }

    private void UsernameTFFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if (UsernameTF.getText().equals("Username")) {
            UsernameTF.setText("");
        }
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
            PasswordTF.setText(null);
            PasswordTF.requestFocus();
            PasswordTF.setEchoChar('*');
            removeLoginStyle(PasswordTF);
        }
    }
    private void PasswordTFFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if(PasswordTF.getText().length()==0){
            addLoginStyle(PasswordTF);
            PasswordTF.setText("Password");
            PasswordTF.setEchoChar('\u0000');
        }
    }

    private void SignupButtonMouseClicked(java.awt.event.MouseEvent evt) {
        UserRegister rgst = new UserRegister();
        rgst.setVisible(true);
        rgst.pack();
        rgst.setLocationRelativeTo(null);
        rgst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {
        String username = UsernameTF.getText();
        String password = PasswordTF.getText();
        AllUser a = new AllUser();
        a = AllUser.readUserObjFile();
        if(password.equals(a.getUserMap().get(username).getPassword())){

        }else{
            ShowIncorrect.setText("Incorrected");
            Time.delay(2000,()->ShowIncorrect.setText(""));
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
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
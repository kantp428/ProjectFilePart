package MainPage;
import CourseMap.ColorMap;
import Login_Register_Page.Login;
import Users.User;
import FilePath.CourseFileCreatePanel;
import FilePath.PathCourseSet;
import CourseMap.MapPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LecturerPage extends javax.swing.JFrame {
    public LecturerPage(User user) {
        this.setTitle("Lecturer-->");
        this.user = user;
        this.fullName = user.getFullName()+" "+user.getLastName();

        String[] courseName = PathCourseSet.getCourseName();

        if (courseName != null) {
            courseComboBox = new javax.swing.JComboBox<>(courseName);
        } else {
            courseComboBox = new JComboBox<>();
        }

        initComponents();
        setMinimumSize(new Dimension(1245, 720));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public LecturerPage() {
        this.setTitle("Lecturer-->");
        this.user = null;
        this.fullName = "Supakorn Leelatanangkul";

        String[] courseName = PathCourseSet.getCourseName();

        if (courseName != null) {
            courseComboBox = new javax.swing.JComboBox<>(courseName);
        } else {
            courseComboBox = new JComboBox<>();
        }

        initComponents();
        setMinimumSize(new Dimension(1245, 720));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        headerPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        Usericon = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        insertFileButton = new javax.swing.JButton();
        centerPanel = new javax.swing.JPanel();
        resetAllowed = false;

        colorPanel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(Color.white);

                // Draw rounded rectangle with the specified corner radius
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
                g2.dispose();
            }
        };

        escDispatcher = e -> {
          if (e.getID() == KeyEvent.KEY_PRESSED && e.getKeyCode() == KeyEvent.VK_ESCAPE) {
              KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(escDispatcher);
              new Login();
              dispose();
              return true;
          }
          return false;
        };

        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(escDispatcher);

        requireBoxLabel = new javax.swing.JLabel();
        requireLabel = new javax.swing.JLabel();
        nextBoxLabel = new javax.swing.JLabel();
        nextLabel = new javax.swing.JLabel();
        currentLabel = new javax.swing.JLabel();
        currentBoxLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(2, 188, 119));
        headerPanel.setPreferredSize(new java.awt.Dimension(800, 65));

        usernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        usernameLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 17)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");
        usernameLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        usernameLabel.setText(fullName);

        Usericon.setIcon(new javax.swing.ImageIcon("src/resource/Image/userImage.jpg")); // NOI18N
        Usericon.setToolTipText("");

        courseComboBox.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 16));
        courseComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                comboBoxActionEvent(evt);
            }
        });

        insertFileButton.setText("INSERT");
        insertFileButton.setFocusPainted(false);
        insertFileButton.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 16));
        insertFileButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                insertFileButtonMouseClicked(e);
            }
        });

        resetButton.setText("RESET");
        resetButton.setFocusPainted(false);
        resetButton.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 16));
        resetButton.setBackground(Color.WHITE);
        resetButton.setForeground(Color.BLACK);
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });

        colorPanel.setPreferredSize(new java.awt.Dimension(400, 30));
        colorPanel.setLayout(new java.awt.GridBagLayout());
        colorPanel.setOpaque(false);

        GridBagConstraints gridBagConstraints;

        currentBoxLabel.setBackground(ColorMap.ACTIVE_CLICKED_NODE_COLOR);
        currentBoxLabel.setBorder(BorderFactory.createLineBorder(ColorMap.BORDER_ACTIVE_NODE_COLOR,2));
        currentBoxLabel.setOpaque(true);
        currentBoxLabel.setPreferredSize(new java.awt.Dimension(21, 21));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 30, 0, 0);
        colorPanel.add(currentBoxLabel, gridBagConstraints);

        nextBoxLabel.setBackground(ColorMap.ACTIVE_TARGET_NODE_COLOR);
        nextBoxLabel.setOpaque(true);
        nextBoxLabel.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 34, 0, 0);
        colorPanel.add(nextBoxLabel, gridBagConstraints);

        requireBoxLabel.setBackground(ColorMap.ACTIVE_SOURCE_NODE_COLOR);
        requireBoxLabel.setOpaque(true);
        requireBoxLabel.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 22, 0, 0);
        colorPanel.add(requireBoxLabel, gridBagConstraints);

        requireLabel.setText("Require");
        requireLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        colorPanel.add(requireLabel, gridBagConstraints);

        currentLabel.setText("Current");
        currentLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 18, 0, 0);
        colorPanel.add(currentLabel, gridBagConstraints);

        nextLabel.setText("Next");
        nextLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 13));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 28);
        colorPanel.add(nextLabel, gridBagConstraints);



        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGap(18, 18, 18)
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(insertFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(Usericon)
                                .addGap(23, 23, 23)
                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(2, 2, 2)
                                        .addComponent(Usericon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(headerPanelLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(courseComboBox)
                                                        .addComponent(insertFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(colorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(11, 11, 11))
        );

        getContentPane().add(headerPanel, java.awt.BorderLayout.NORTH);

        centerPanel.setLayout(cardLayout);
        // Set default centerPanel
        JPanel blankPanel = new JPanel();
        blankPanel.setPreferredSize(new Dimension(800, 449));
        centerPanel.add(blankPanel, BorderLayout.CENTER);
        centerPanel.add(blankPanel, "blankPanel");

        getContentPane().add(centerPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>

    private void comboBoxActionEvent(java.awt.event.ActionEvent evt) {
        centerPanel.removeAll();

        resetAllowed = true;
        String courseName = (String) courseComboBox.getSelectedItem();
        MapPanel mapPanel = new MapPanel(PathCourseSet.getPathOf(courseName));
        centerPanel.add(mapPanel, "mapPanel");

        cardLayout.show(centerPanel, "mapPanel");

        // Repaint to make sure the UI is updated
        centerPanel.revalidate();
        centerPanel.repaint();
    }

    private void insertFileButtonMouseClicked(MouseEvent e) {
        new CourseFileCreatePanel(this);
    }

    private void resetButtonMouseClicked(MouseEvent evt) {
        if (!resetAllowed) return;
        centerPanel.removeAll();
        String courseName = (String) courseComboBox.getSelectedItem();
        MapPanel mapPanel = new MapPanel(PathCourseSet.getPathOf(courseName));
        centerPanel.add(mapPanel, "mapPanel");

        cardLayout.show(centerPanel, "mapPanel");

        // Repaint to make sure the UI is updated
        centerPanel.revalidate();
        centerPanel.repaint();
    }

    public void updateCourseComboBox() {
            String[] courseNames = PathCourseSet.getCourseName();

            courseComboBox.removeAllItems();

            if (courseNames != null) {
                for (String courseName : courseNames) {
                    courseComboBox.addItem(courseName);
                }
            }

            // Repaint to make sure the UI is updated
            courseComboBox.revalidate();
            courseComboBox.repaint();

    }

    // Variables declaration - do not modify
    private boolean resetAllowed;
    private KeyEventDispatcher escDispatcher;
    private final CardLayout cardLayout = new CardLayout();
    private final javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel Usericon;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton insertFileButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel centerPanel;

    private javax.swing.JPanel colorPanel;
    private javax.swing.JLabel currentBoxLabel;
    private javax.swing.JLabel currentLabel;
    private javax.swing.JLabel nextBoxLabel;
    private javax.swing.JLabel nextLabel;
    private javax.swing.JLabel requireBoxLabel;
    private javax.swing.JLabel requireLabel;
    private User user;
    private String fullName;
    // End of variables declaration
}
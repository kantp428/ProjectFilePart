package PageFrame;
import AllUser.User;
import FilePath.CourseFileCreatePanel;
import FilePath.PathCourseSet;
import Tree.MapPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class LecturerPage extends javax.swing.JFrame {
    public LecturerPage(User user) {
        this.setTitle("Lecturer-->");
        this.user = user;
        this.fullName = user.getFullName()+" "+user.getLastName();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //
        }

        String[] courseName = PathCourseSet.getCourseName();

        if (courseName != null) {
            courseComboBox = new javax.swing.JComboBox<>(courseName);
        } else {
            courseComboBox = new JComboBox<>();
        }

        initComponents();
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
        confirmButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        insertFileButton = new javax.swing.JButton();
        centerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(2, 188, 119));
        headerPanel.setPreferredSize(new java.awt.Dimension(800, 60));

        usernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");
        usernameLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        usernameLabel.setText(fullName);

        Usericon.setIcon(new javax.swing.ImageIcon("src/Image/userImage.jpg")); // NOI18N
        Usericon.setToolTipText("");

        confirmButton.setIcon(new javax.swing.ImageIcon("src/Image/confirmButtonImage.png")); // NOI18N
        confirmButton.setPreferredSize(new java.awt.Dimension(30, 30));
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });

        courseComboBox.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 16));

        insertFileButton.setText("INSERT");
        insertFileButton.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 16));
        insertFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                insertFileButtonMouseClicked(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(insertFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addComponent(Usericon)
                                .addGap(28, 28, 28)
                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Usericon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(headerPanelLayout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(courseComboBox)
                                                        .addComponent(confirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                                        .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(insertFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // Clear centerPanel to remove any existing components
        centerPanel.removeAll();

        String courseName = (String) courseComboBox.getSelectedItem();

        MapPanel mapPanel = new MapPanel(PathCourseSet.getPathOf(courseName));
        centerPanel.add(mapPanel, "mapPanel");

        // Show the newly added mapPanel
        cardLayout.show(centerPanel, "mapPanel");

        // Refresh/revalidate centerPanel to apply changes
        centerPanel.revalidate();
        centerPanel.repaint();
    }

    private void insertFileButtonMouseClicked(MouseEvent evt) {
        new CourseFileCreatePanel(this);
    }

    private void resetButtonMouseClicked(MouseEvent evt) {
        centerPanel.removeAll();

        JPanel blankPanel = new JPanel();
        blankPanel.setPreferredSize(new Dimension(800, 449));
        centerPanel.add(blankPanel, BorderLayout.CENTER);
        centerPanel.add(blankPanel);

        cardLayout.show(centerPanel, "blankPanel");
        centerPanel.revalidate();
        centerPanel.repaint();
    }

    public void updateCourseComboBox() {
            String[] courseNames = PathCourseSet.getCourseName();

            // Clear existing items from the combo box
            courseComboBox.removeAllItems();

            // Add each course name to the combo box
            if (courseNames != null) {
                for (String courseName : courseNames) {
                    courseComboBox.addItem(courseName);
                }
            }

            // Repaint to make sure the UI is updated
            courseComboBox.revalidate();
            courseComboBox.repaint();

    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (Exception e) {
//            //
//        }
//
//        JFrame mainFrame = new LecturerPage(user);
//        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        mainFrame.setVisible(true);
//    }

    // Variables declaration - do not modify
    private final CardLayout cardLayout = new CardLayout();
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel Usericon;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton insertFileButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel centerPanel;
    private User user;
    private String fullName;
    // End of variables declaration
}
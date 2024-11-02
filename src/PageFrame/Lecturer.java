package PageFrame;

import Tree.MapPanel;
import javax.swing.*;
import java.awt.*;

/**
 * Main class for Lecturer GUI
 */
public class Lecturer extends javax.swing.JFrame {

    // CardLayout for switching panels
    private CardLayout cardLayout = new CardLayout();

    /**
     * Creates new form Lecturer
     */
    public Lecturer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        outerPanel = new javax.swing.JPanel();
        centerPanel = new javax.swing.JPanel();  // Set the layout here
        headerPanel = new javax.swing.JPanel();
        CB1 = new javax.swing.JComboBox<>();
        Username = new javax.swing.JLabel();
        Usericon = new javax.swing.JLabel();
        ConfirmBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        outerPanel.setBackground(new java.awt.Color(255, 255, 255));
        outerPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        outerPanel.setLayout(new java.awt.BorderLayout());

        // Set CardLayout directly to centerPanel
        centerPanel.setLayout(cardLayout);

        // Set blankPanel
        JPanel blankPanel = new JPanel();
        centerPanel.add(blankPanel, "blankPanel");

        outerPanel.add(centerPanel, java.awt.BorderLayout.CENTER);

        headerPanel.setBackground(new java.awt.Color(2, 188, 119));
        headerPanel.setPreferredSize(new java.awt.Dimension(800, 60));

        CB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mapPanel", "blankPanel", "Item 3", "Item 4" }));
        CB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB1ActionPerformed(evt);
            }
        });

        Username.setBackground(new java.awt.Color(255, 255, 255));
        Username.setFont(new java.awt.Font("Segoe UI", 0, 14));
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username");
        Username.setPreferredSize(new java.awt.Dimension(100, 30));

        Usericon.setIcon(new javax.swing.ImageIcon("src/Image/userImage.jpg"));

        ConfirmBT.setIcon(new javax.swing.ImageIcon("src/Image/confirmButtonImage.png"));
        ConfirmBT.setPreferredSize(new java.awt.Dimension(30, 30));
        ConfirmBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBTActionPerformed(evt);
            }
        });

        CB1.setPreferredSize(new Dimension(50, 10));

        // Arrange components in headerPanel
        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
                headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(CB1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ConfirmBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                                .addComponent(Usericon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
        );
        headerLayout.setVerticalGroup(
                headerLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(CB1)
                        .addComponent(ConfirmBT)
                        .addComponent(Usericon)
                        .addComponent(Username)
        );

        outerPanel.add(headerPanel, BorderLayout.NORTH);
        getContentPane().add(outerPanel, BorderLayout.CENTER);

        pack();
    }

    private void ConfirmBTActionPerformed(java.awt.event.ActionEvent evt) {
        // Clear centerPanel to remove any existing components
        centerPanel.removeAll();

        // Create the MapPanel dynamically and add it to centerPanel
        MapPanel mapPanel = new MapPanel("src/CourseObjFile/Course_CPE.ser");
        centerPanel.add(mapPanel, "mapPanel");

        // Show the newly added mapPanel
        cardLayout.show(centerPanel, "mapPanel");

        // Refresh/revalidate centerPanel to apply changes
        centerPanel.revalidate();
        centerPanel.repaint();
    }

    private void CB1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Handle combo box selection if needed
    }

    /**
     * Main method to run the application
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Launch the Lecturer GUI
        java.awt.EventQueue.invokeLater(() -> new Lecturer().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JComboBox<String> CB1;
    private javax.swing.JButton ConfirmBT;
    private javax.swing.JLabel Usericon;
    private javax.swing.JLabel Username;
    private javax.swing.JPanel outerPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JPanel headerPanel;
}

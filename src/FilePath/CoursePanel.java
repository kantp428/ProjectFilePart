package FilePath;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import javax.swing.*;
import java.io.*;
import Course.*;

/**
 *
 * @author This pc
 */
public class CoursePanel extends javax.swing.JPanel {

    /**
     * Creates new form CoursePanel
     */
    public CoursePanel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
//            e.printStackTrace();
        }

//        File dir = new File("src/CourseObjFile/");
//        String[] courseName = dir.list((dir1, filename) -> filename.endsWith(".ser"));
//
//        // remove .ser from file
//        if (courseName != null) {
//            for (int i = 0; i < courseName.length; i++) {
//                courseName[i] = courseName[i].replaceFirst("\\.ser$", "").replaceFirst("Course_", "");
//            }
//        }

        String[] courseName = PathCourseSet.getCourseName();

        if (courseName != null) {
            courseComboBox = new javax.swing.JComboBox<>(courseName);
        } else {
            courseComboBox = new JComboBox<>();
        }
        initComponents();
        courseTextArea.setEditable(false); // textArea can't edit


        JOptionPane.showMessageDialog(null, this, "CourseCreator", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        new CoursePanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        javax.swing.JScrollPane courseScrollPane;
        javax.swing.JLabel headerLb;
        javax.swing.JPanel inPanel;
        javax.swing.JButton selectButton;
        inPanel = new javax.swing.JPanel();
        courseScrollPane = new javax.swing.JScrollPane();
        courseTextArea = new javax.swing.JTextArea();
        headerLb = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();

        selectButton.setFocusPainted(false); // make button not focus

        setBackground(new java.awt.Color(0, 153, 0));

        inPanel.setBackground(new java.awt.Color(255, 255, 255));

        courseTextArea.setColumns(20);
        courseTextArea.setRows(5);
        courseScrollPane.setViewportView(courseTextArea);

        headerLb.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        headerLb.setText("Course of ");

        courseComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        selectButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectButton.setText("select");
        selectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout inPanelLayout = new javax.swing.GroupLayout(inPanel);
        inPanel.setLayout(inPanelLayout);
        inPanelLayout.setHorizontalGroup(
                inPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(inPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(inPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(courseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(inPanelLayout.createSequentialGroup()
                                                .addComponent(headerLb, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        inPanelLayout.setVerticalGroup(
                inPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(inPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(inPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(headerLb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(courseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(selectButton))
                                .addGap(27, 27, 27)
                                .addComponent(courseScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(inPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(inPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>

    private void selectButtonMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String dir = "src/CourseObjFile/Course_";
        String courseName = (String) courseComboBox.getSelectedItem();
        Course course = ObjReader.readObj(dir + courseName + ".ser");
        courseTextArea.setText("");

        for(String code : course.getAllsubCode()) {
            courseTextArea.setText(courseTextArea.getText() + "Name: " + course.getIdMap().get(code).getName()+"\n");
            courseTextArea.setText(courseTextArea.getText() + "id: " + course.getIdMap().get(code).getId() +"\n");

            courseTextArea.setText(courseTextArea.getText() + "Require-> ");
            if(course.getIdMap().get(code).getRequire().isEmpty())
                courseTextArea.setText(courseTextArea.getText() + "null");
            for(Subject s : course.getIdMap().get(code).getRequire()) {
                courseTextArea.setText(courseTextArea.getText() + s.getId() + " ");
            }

            courseTextArea.setText(courseTextArea.getText() + "\nNext-> ");
            if(course.getIdMap().get(code).getNext().isEmpty())
                courseTextArea.setText(courseTextArea.getText() + "null");
            for(Subject s : course.getIdMap().get(code).getNext()) {
                courseTextArea.setText(courseTextArea.getText() + s.getId() + " ");
            }
            courseTextArea.setText(courseTextArea.getText() + "\n-----------------------------------------------------\n");
        }

    }


    // Variables declaration - do not modify
    private javax.swing.JTextArea courseTextArea;
    private final javax.swing.JComboBox<String> courseComboBox;
    // End of variables declaration
}


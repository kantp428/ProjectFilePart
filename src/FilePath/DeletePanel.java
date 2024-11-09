package FilePath;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class DeletePanel extends JPanel {
    JComboBox<String> courseComboBox;
    public DeletePanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(200, 100));
        String[] courseSet = PathCourseSet.getCourseName();

        if (courseSet != null) {
            courseComboBox = new JComboBox<>(courseSet);
        } else {
            courseComboBox = new JComboBox<>();
        }

        JButton deleteButton = new JButton("Delete");
        Dimension comboBoxDimension = new Dimension(180, 30);
        courseComboBox.setPreferredSize(comboBoxDimension);
        courseComboBox.setMaximumSize(comboBoxDimension);
        courseComboBox.setMinimumSize(comboBoxDimension);

        Dimension delButtonDimension = new Dimension(80, 30);
        deleteButton.setPreferredSize(delButtonDimension);
        deleteButton.setMaximumSize(delButtonDimension);
        deleteButton.setMinimumSize(delButtonDimension);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseName = (String) courseComboBox.getSelectedItem();
                File deleteFile = new File(PathCourseSet.getPathOf(courseName));
                boolean delete = deleteFile.delete();
                if (delete) {loadComboBox();}
            }
        });

        courseComboBox.setAlignmentX(Component.CENTER_ALIGNMENT);
        courseComboBox.setFocusable(false);
        deleteButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        deleteButton.setFocusPainted(false);

        add(Box.createRigidArea(new Dimension(0, 10)));
        add(courseComboBox);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(deleteButton);

        JOptionPane.showMessageDialog(null, this, "choose delete file", JOptionPane.PLAIN_MESSAGE);
    }

    private void loadComboBox() {
        courseComboBox.removeAllItems();
        String[] courseSet = PathCourseSet.getCourseName();
        if (courseSet != null) {
            for (String courseName : courseSet) {
                courseComboBox.addItem(courseName);
            }
        }

        courseComboBox.revalidate();
        courseComboBox.repaint();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //
        }
        new DeletePanel();
        //new CourseFileCreatePanel();
    }
}

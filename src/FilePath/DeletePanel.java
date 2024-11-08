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
        deleteButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(courseComboBox);
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
        new DeletePanel();
    }
}

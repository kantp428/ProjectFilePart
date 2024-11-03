package Program;

import MainPage.StudentPage;

import javax.swing.*;

public class StudentPageTest {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //
        }

        new StudentPage().setVisible(true);
    }
}

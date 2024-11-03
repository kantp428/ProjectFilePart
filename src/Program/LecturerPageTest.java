package Program;

import MainPage.LecturerPage;
import MainPage.StudentPage;

import javax.swing.*;

public class LecturerPageTest {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //
        }

        new LecturerPage();
    }
}

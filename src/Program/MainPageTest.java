package Program;

import MainPage.LecturerPage;

import javax.swing.*;

public class MainPageTest {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //
        }

        new LecturerPage();
    }
}

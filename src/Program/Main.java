package Program;

import Login_Register_Page.Login;
import MainPage.LecturerPage;
import Users.Lecturer;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //
        }
        new LecturerPage();
    }
}

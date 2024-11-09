package Program;

import JarMainPage.MainPage;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //
        }
        new MainPage().setVisible(true);
    }
}

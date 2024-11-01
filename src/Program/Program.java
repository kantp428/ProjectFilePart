package Program;

import AllUser.AllUser;
import AllUser.Student;
import AllUser.User;
import AllUser.Lecturer;
import UI.Login;

public class Program {

    public static void main(String[] args) {
//        AllUser a = new AllUser();
//        User user1 = new Lecturer("a123","Tanongtuy","Kongkonkoy","tek027454184",a);
//        User user2 = new Student("b6620503578","Supakorn","Leelatanangkul","tek027454184",a);
//        AllUser.writeUserObjFile(a);
        AllUser b = AllUser.readUserObjFile();
//        AllUser b = AllUser.readUserObjFile();
//        AllUser.writeUserObjFile(a);
//        AllUser b = AllUser.readUserObjFile();
        for(String i : b.getAllkey()) {
            System.out.println(i);
        }
//        System.out.println(b.getUserMap().get("b6620503578").getFullName());
          new Login().setVisible(true);
    }
}

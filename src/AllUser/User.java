package AllUser;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String userName ;
    private String fullName ;
    private String lastName ;
    private String password ;
    private String studentID ;

    public User(String userName, String fullName, String lastName, String password, String studentID ,AllUser allUser) {
        this.userName = userName;
        this.fullName = fullName;
        this.lastName = lastName;
        this.password = password;
        this.studentID = studentID;
        allUser.getUserMap().put(userName,this);
    }

//    public static void main(String[] args) {
//        AllUser a = AllUser.readUserObjFile();
//        a.getUserMap().put("b6620503578", new Student("b6620503578", "Supakorn", "Leelatanangkul", "123456","123456", a));
//
//        if(a==null) {
//            System.out.println("a is null");
//        } else {
//            User u = a.getUserMap().get("b6620503349");
//            System.out.println(u.fullName);
//            u = a.getUserMap().get("b6620503578");
//            System.out.println(u.fullName);
//        }
//
//        b.getUserMap().put("b6620503349", new Student("b6620503349", "Kantapat", "Athan", "123456","123456", b));
//        System.out.println(b.getUserMap().get("b6620503349").getFullName());
//        AllUser.writeUserObjFile(b);
//    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}

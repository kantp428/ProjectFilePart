package AllUser;

import java.io.Serializable;

public class Student extends User  {
    public Student(String userName, String fullName, String lastName, String password,AllUser allUser) {
        super(userName, fullName, lastName, password,allUser);
    }
}

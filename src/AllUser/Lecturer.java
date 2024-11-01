package AllUser;

import java.io.Serializable;

public class Lecturer extends User {
    public Lecturer(String userName, String fullName, String lastName, String password,AllUser alluser) {
        super(userName, fullName, lastName, password,alluser);
    }
}

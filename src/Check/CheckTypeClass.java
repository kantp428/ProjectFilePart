package Check;

import AllUser.User;

public class CheckTypeClass {
    private User user ;
    public  CheckTypeClass(User user){
        this.user = user;
    }
    public  Class<?> checkType() {
        return user.getClass();
    }
}

package srp.good;

public class UserLogin {

    User login(String userName, String password) {

    	User user = new User();
        if (user == null) {
        }
        new sendEmail(user, "Successfull login");
        return user;
    }
    

}

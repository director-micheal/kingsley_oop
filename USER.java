public class User {
    String name;
    String password;
    String login() {
        return "Login";
    }
    String logout() {
        return "Log out";
    }
    String register() {
        if (name.equals("") || password.equals("")) {
            return "Can't be empty";
        } else {
            return "Successfull";
        }
    }
}
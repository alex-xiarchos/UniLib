abstract class User {
    private String user_name;
    private String user_password;
    private String user_email;

    public User(String user_name, String user_email, String user_password){
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_email = user_email;
    }

    public String getName() {
        return user_name;
    }

    public String getPassword() {
        return user_password;
    }

    public String getEmail() {
        return user_email;
    }
}
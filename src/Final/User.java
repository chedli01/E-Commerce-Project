package Final;

public class User {
    String username;
    String password;
    int userId;

    public User(String username,String password,int userId){
        this.userId=userId;
        this.password=password;
        this.username=username;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

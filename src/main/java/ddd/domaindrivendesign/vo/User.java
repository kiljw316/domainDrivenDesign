package ddd.domaindrivendesign.vo;

public class User {

    private UserId userId;
    private UserName userName;

    public User(UserName userName) {
        this.userName = userName;
    }

    public UserId getUserId() {
        return userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    User createUser(String name) {
        UserName userName = new UserName(name);
        return new User(userName);

    }

    User updateUser(String name) {
        UserName userName = new UserName(name);
        return new User(userName);

    }
}

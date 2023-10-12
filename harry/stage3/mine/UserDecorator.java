package mine;

public abstract class UserDecorator extends User {
    User user;

    public String getTotalUserId() {
        return user.getUserId();
    }
}

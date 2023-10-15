package mine;

public class InsaUsers extends User {
    public InsaUsers(String id, String name, String accountType) {
        this.userId = id;
        this.username = name;
        this.accountType = accountType;
    }

    @Override
    public String getDisplayId() {
        return this.userId;
    }
}

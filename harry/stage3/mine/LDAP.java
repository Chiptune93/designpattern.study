package mine;

public class LDAP extends UserDecorator {
    public LDAP(User user) {
        this.user = user;
    }

    @Override
    public String getDisplayId() {
        return "[LDAP]" + super.getTotalUserId();
    }
}

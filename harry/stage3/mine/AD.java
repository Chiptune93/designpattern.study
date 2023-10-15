package mine;

public class AD extends UserDecorator {
    public AD(User user) {
        this.user = user;
    }

    @Override
    public String getDisplayId() {
        return "[AD]" + super.getTotalUserId();
    }
}

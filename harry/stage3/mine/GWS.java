package mine;

public class GWS extends UserDecorator {
    public GWS(User user) {
        this.user = user;
    }

    @Override
    public String getDisplayId() {
        return "[GWS]" + super.getTotalUserId();
    }
}

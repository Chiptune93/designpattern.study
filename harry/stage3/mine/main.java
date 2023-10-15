package mine;

public class main {
    public static void main(String[] args) {
        // ... get User ...
        User insaUsers = new InsaUsers("harry.93", "해리", "인사");
        // 원래는 if-else-if 여야 하는데 보여주려고 이렇게 ...
        insaUsers = new AD(insaUsers);
        System.out.println(insaUsers.getDisplayId());

        User insaUsers1 = new InsaUsers("ian.curtis", "이안", "인사");
        insaUsers1 = new GWS(insaUsers1);
        System.out.println(insaUsers1.getDisplayId());

        User insaUsers2 = new InsaUsers("dwyane.jung", "드웨인", "인사");
        insaUsers2 = new LDAP(insaUsers2);
        System.out.println(insaUsers2.getDisplayId());

    }
}

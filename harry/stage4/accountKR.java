import java.util.HashMap;
import java.util.List;

public class accountKR extends Account {

    public void status() {
        System.out.println("잔액 : " + getTotalMoney());
        System.out.println("<통화별 예수금>");
        for (HashMap<String, Integer> s : getDeposit()) {
            System.out.println(s);
        }
    }

}

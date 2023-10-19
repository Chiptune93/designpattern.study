import java.util.HashMap;
import java.util.List;

public class accountUS extends Account {

    public void status() {
        System.out.println("account Money : " + getTotalMoney());
        System.out.println("<Deposit>");
        for (HashMap<String, Integer> s : getDeposit()) {
            System.out.println(s);
        }
    }
}

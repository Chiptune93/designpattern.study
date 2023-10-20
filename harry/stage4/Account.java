import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Account {

    int money;
    List<HashMap<String, Integer>> deposit = new ArrayList<>();

    int getTotalMoney() {
        return money;
    }

    List<HashMap<String, Integer>> getDeposit() {
        return deposit;
    }

    void income(String kind, Integer money) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(kind, money);
        deposit.add(hashMap);
    }

    public abstract void status();
}

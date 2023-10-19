import java.util.ArrayList;

public class bankUS implements AccountFactory {
    @Override
    public Account createAccount() {
        Account usaAcount = new accountUS();
        usaAcount.income("USD", 5);
        return usaAcount;
    }
}

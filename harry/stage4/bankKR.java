import java.util.ArrayList;

public class bankKR implements AccountFactory {

    public Account createAccount() {
        Account koreanAccount = new accountKR();
        koreanAccount.income("KRW", 5000);
        return koreanAccount;
    }
}

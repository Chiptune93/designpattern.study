package NotificationCenter;

public class AppLaunch {
    public static void main(String[] args) {
        SecuritiesDataForAccount securitiesDataForAccount = new SecuritiesDataForAccount();
        Account account1 = new Account(securitiesDataForAccount, 102044939, new String[]{"Y", "Y", "Y"});
        securitiesDataForAccount.setMoney(4593340.2312f);
        securitiesDataForAccount.setLoan(32499.2390f);
        securitiesDataForAccount.setStock(100f);


        SecuritiesDataForAccount securitiesDataForAccount2 = new SecuritiesDataForAccount();
        Account account2 = new Account(securitiesDataForAccount2, 4353342, new String[]{"N", "N", "Y"});
        securitiesDataForAccount2.setMoney(4593340.2312f);
        securitiesDataForAccount2.setLoan(32499.2390f);
        securitiesDataForAccount2.setStock(100f);

        account1.display();
        account2.display();
    }
}

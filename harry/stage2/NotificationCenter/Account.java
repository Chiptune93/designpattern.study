package NotificationCenter;

public class Account implements MoneyObserver, LoanObserver, StockObserver, App {
    private int acno;
    private String[] agrees;
    private float money;
    private float loan;
    private float stock;
    private SecuritiesDataForAccount securitiesDataForAccount;

    public Account(SecuritiesDataForAccount securitiesDataForAccount, int acno, String[] agrees) {
        this.acno = acno;
        this.agrees = agrees;
        this.securitiesDataForAccount = securitiesDataForAccount;
        if (this.agrees[0].equals("Y")) securitiesDataForAccount.MoneyRegisterObserver(this);
        else securitiesDataForAccount.MoneyRemoveObserver(this);
        if (this.agrees[1].equals("Y")) securitiesDataForAccount.LoanRegisterObserver(this);
        else securitiesDataForAccount.LoanRemoveObserver(this);
        if (this.agrees[2].equals("Y")) securitiesDataForAccount.StockRegisterObserver(this);
        else securitiesDataForAccount.StockRemoveObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this.acno + "님의 계좌 현황");
        System.out.println("예수금현황 : " + this.money);
        System.out.println("대출금현황 : " + this.loan);
        System.out.println("주식잔고현황 : " + this.stock);
    }

    @Override
    public void update() {
        if (this.agrees[0].equals("Y")) this.money = securitiesDataForAccount.getMoney();
        if (this.agrees[1].equals("Y")) this.loan = securitiesDataForAccount.getLoan();
        if (this.agrees[2].equals("Y")) this.stock = securitiesDataForAccount.getStock();
        // display();
    }
}

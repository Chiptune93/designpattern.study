package NotificationCenter;

public interface Subject {
    public void MoneyRegisterObserver(MoneyObserver o);

    public void MoneyRemoveObserver(MoneyObserver o);

    public void MoneyNotifyObservers();

    public void LoanRegisterObserver(LoanObserver o);

    public void LoanRemoveObserver(LoanObserver o);

    public void LoanNotifyObservers();

    public void StockRegisterObserver(StockObserver o);

    public void StockRemoveObserver(StockObserver o);

    public void StockNotifyObservers();
}

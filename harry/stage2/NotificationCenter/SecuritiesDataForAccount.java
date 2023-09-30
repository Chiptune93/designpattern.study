package NotificationCenter;

import java.util.ArrayList;
import java.util.List;

public class SecuritiesDataForAccount implements Subject {
    List<MoneyObserver> moneyObserverList;
    List<LoanObserver> loanObserverList;
    List<StockObserver> stockObserverList;

    private float money;
    private float loan;
    private float stock;

    public SecuritiesDataForAccount() {
        moneyObserverList = new ArrayList<>();
        loanObserverList = new ArrayList<>();
        stockObserverList = new ArrayList<>();
    }

    @Override
    public void MoneyRegisterObserver(MoneyObserver o) {
        moneyObserverList.add(o);
    }

    @Override
    public void MoneyRemoveObserver(MoneyObserver o) {
        moneyObserverList.remove(o);
    }

    @Override
    public void MoneyNotifyObservers() {
        for (MoneyObserver moneyObserver : moneyObserverList) {
            moneyObserver.update();
        }
    }

    @Override
    public void LoanRegisterObserver(LoanObserver o) {
        loanObserverList.add(o);
    }

    @Override
    public void LoanRemoveObserver(LoanObserver o) {
        loanObserverList.remove(o);
    }

    @Override
    public void LoanNotifyObservers() {
        for (LoanObserver loanObserver : loanObserverList) {
            loanObserver.update();
        }
    }

    @Override
    public void StockRegisterObserver(StockObserver o) {
        stockObserverList.add(o);
    }

    @Override
    public void StockRemoveObserver(StockObserver o) {
        stockObserverList.remove(o);
    }

    @Override
    public void StockNotifyObservers() {
        for (StockObserver stockObserver : stockObserverList) {
            stockObserver.update();
        }
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
        MoneyNotifyObservers();
    }

    public float getLoan() {
        return loan;
    }

    public void setLoan(float loan) {
        this.loan = loan;
        LoanNotifyObservers();
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
        StockNotifyObservers();
    }
}

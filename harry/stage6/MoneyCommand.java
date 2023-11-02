public class MoneyCommand implements Command {

    IncomeMoneyModule incomeMoneyModule;

    int Money;

    public MoneyCommand(IncomeMoneyModule incomeMoneyModule, int money) {
        this.incomeMoneyModule = incomeMoneyModule;
        Money = money;
    }

    @Override
    public void execute() {
        incomeMoneyModule.deposit(Money);
    }

    @Override
    public void undo() {
        incomeMoneyModule.withdraw(Money);
    }
}

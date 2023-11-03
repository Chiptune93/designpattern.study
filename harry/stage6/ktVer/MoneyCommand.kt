package ktVer

class MoneyCommand(var module: IncomeMoneyModule, var money: Int) : Command {
    override fun execute(): Unit = module.deposit(money)
    override fun undo(): Unit = module.withdraw(money)
}
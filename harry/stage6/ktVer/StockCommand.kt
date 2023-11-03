package ktVer

class StockCommand(var module: StockModule, var quantity: Int) : Command {
    override fun execute(): Unit = module.store(quantity)
    override fun undo(): Unit = module.release(quantity)
}
public class StockCommand implements Command {
    StockModule stockModule;
    int quantity;

    public StockCommand(StockModule stockModule, int quantity) {
        this.stockModule = stockModule;
        this.quantity = quantity;
    }

    @Override
    public void execute() throws Exception {
        throw new Exception("에러발생!");
        // stockModule.store(quantity);
    }

    @Override
    public void undo() {
        stockModule.release(quantity);
    }


}

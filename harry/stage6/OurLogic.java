public class OurLogic {
    public static void main(String[] args) {
        // 실행 객체 생성
        Deal deal = new Deal();
        // 구상 커맨드 생성
        IncomeMoneyModule incomeMoneyModule = new IncomeMoneyModule();
        MoneyCommand moneyCommand = new MoneyCommand(incomeMoneyModule, 100000);

        StockModule stockModule = new StockModule();
        StockCommand stockCommand = new StockCommand(stockModule, 10);

        // 커맨드를 로드
        deal.setCommand(moneyCommand);
        deal.setCommand(stockCommand);

        // 로직을 실행
        deal.play();

        // <정상 케이스 로그>
        //        돈을 100000원 입금 합니다.
        //        주식을 10주 입고합니다.

    }
}

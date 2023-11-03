package ktVer

fun main() {
    // 실행객체 생성
    val deal = Deal()
    // 커맨드 구상 클래스 생성
    var mm = IncomeMoneyModule()
    var sm = StockModule()
    // 100,000 원을 입급하려는 커맨드
    var moneyCommand = MoneyCommand(mm, 100000)
    // 100주를 입고하려는 커맨드
    var stockCommand = StockCommand(sm, 100)

    // 커맨드 세팅
    deal.setCommand(moneyCommand)
    deal.setCommand(stockCommand)

    // play!
    deal.play()

    // <정상케이스로그>
    //    돈을 100000 원 입금합니다.
    //    주식을 100 주 입고 합니다.


}
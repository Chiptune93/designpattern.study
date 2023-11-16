class AmericanUserStockIn(private val chargeKinds: ChargeKinds, private val taxKinds: TaxKinds) : StockInProcess() {

    override fun chargeKindChk(): Boolean {
        return chargeKinds.percent != 0
    }

    override fun taxChk(): Boolean {
        return taxKinds.percent != 0
    }

    // 해외주식 거래의 경우 환율에 따른 추가 부과를 구현
    override fun charge() {
        println("${chargeKinds.percent} 만큼 수수료를 부과합니다.")
        println("환율을 고려하여 추가적으로 ${chargeKinds.percent * 0.1 * 1310} 원을 추가적 으로 부과 합니다.")
    }

    // 해외주식 거래의 경우 환율에 따른 추가 부과를 구현
    override fun tax() {
        println("${taxKinds.percent} 만큼 세금을 부과합니다.")
        println("환율을 고려하여 추가적으로 ${taxKinds.percent * 0.1 * 1310} 원을 추가적 으로 부과 합니다.")
    }
}

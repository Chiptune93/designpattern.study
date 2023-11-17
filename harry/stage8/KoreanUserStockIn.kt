class KoreanUserStockIn(private val chargeKinds: ChargeKinds, private val taxKinds: TaxKinds) : StockInProcess() {

    override fun chargeKindChk(): Boolean {
        return chargeKinds.percent != 0
    }

    override fun taxChk(): Boolean {
        return taxKinds.percent != 0
    }

    override fun charge() {
        println("${chargeKinds.percent} 만큼 수수료를 부과합니다.")
    }

    override fun tax() {
        println("${taxKinds.percent} 만큼 세금을 부과합니다.")
    }
}

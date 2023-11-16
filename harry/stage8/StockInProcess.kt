/**
 * 주식 입고 처리 프로세스를 템플릿화
 * >> 후크
 * 1. 수수료 부과 여부에 따른 수수료 부과 진행
 * 2. 세금 부과 여부에 따른 세금 부과 진행
 * >> 서브클래스에서 정의하는 메소드
 * 1. 수수료 부과 메소드
 * 2. 세금 부과 메소드
 */
abstract class StockInProcess {
    // 알고리즘 정의 메소드 템플릿
    fun execute() {
        acountChk()
        if (chargeKindChk()) {
            charge()
        }
        if (taxChk()) {
            tax()
        }
        stockIn()
    }

    // 공통 알고리즘 단계
    private fun acountChk() {
        println("계좌 사고 확인을 진행합니다.")
    }

    // 공통 알고리즘 단계
    private fun stockIn() {
        println("주식이 입고 처리 됩니다.")
    }

    // 후크 메소드
    open fun chargeKindChk(): Boolean {
        return true
    }

    // 후크 메소드
    open fun taxChk(): Boolean {
        return true
    }

    // 서브 클래스에서 정의하는 알고리즘 메소드
    abstract fun charge()
    abstract fun tax()
}

package ktVer

class StockModule {
    fun store(quantity: Int): Unit {
        throw Exception("에러 발생했습니다!")
        // println("주식을 $quantity 주 입고 합니다.")
    }

    fun release(quantity: Int): Unit = println("주식을 $quantity 주 출고 합니다.")
}
package iterator

class batchList : batch {
    val batch: List<String> = listOf("BSSB1002", "BSSB1003", "BSSB1004", "BSSB2001", "BSSB2002", "BSSB2006", "BSSB3001", "BSSB3002", "BSSB3003", "BSSB3004", "BSSB3006", "BSSB9999", "BSSB231043")

    fun print() {
        for (b in batch) {
            println("${b} 배치가 존재합니다.")
        }
    }

    override fun createIterator() {
        // ?
    }

}
package iterator

class client(val a: batchList, val b: jenkinsbatchList) {
    fun printAllBatch() {
        a.print()
        b.print()
    }
}

fun main() {
    val batchSampleList = batchList()
    val jenkinsSampleList = jenkinsbatchList()
    val cla = client(batchSampleList,jenkinsSampleList)
    cla.printAllBatch()
}
/**
 * 실제 작업을 수행하는 객체
 */
class UnkownService : ServiceInterface {

    var property: Int = 0

    override fun mainDo(): String {
        if (property == 1) return doThis()
        if (property == 2) return doThat()
        return "None"
    }

    override fun doThis(): String = "doThis"
    override fun doThat(): String = "doThat"
}

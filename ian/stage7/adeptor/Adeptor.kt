
class Adapter(newYouNameBatch: YourNameBatch) : Acc {
    private val yourName: YourName

    init {
        yourName = newYouNameBatch
    }

    override fun getUser():String {
        return yourName.getUser()
    }
}
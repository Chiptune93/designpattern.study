interface Acc {
    fun getUser(): String {
        return "user"
    }
}

class AccBatch : Acc{
    override fun getUser(): String {
        return "AccBatch user"
    }
}



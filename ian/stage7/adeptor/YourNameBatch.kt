


interface YourName {
    fun getUser(): String {
        return "user"
    }
}

class YourNameBatch : YourName {
    override fun getUser(): String {
        return "YourNameBatch user"
    }
}



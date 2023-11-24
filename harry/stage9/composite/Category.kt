package composite

abstract class Category() {
    fun add(): Nothing = throw UnsupportedOperationException("123")
    fun remove(): Nothing = throw UnsupportedOperationException("123")
    open fun print(): Unit = throw UnsupportedOperationException("123")
    fun getChild(): Nothing = throw UnsupportedOperationException("123")

}
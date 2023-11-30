interface State {
    val myState: String
    fun transform(erenState: ErenState)
    fun fly()
    fun attack()
}
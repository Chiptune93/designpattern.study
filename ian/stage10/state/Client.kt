class ErenState {
    var state: State = 인간

    fun transformState() = state.transform(this)
    fun attak() = state.attack()
    fun fly() = state.fly()
}

fun main() {
    val eren = ErenState()
    eren.transformState()
    eren.attak()
    eren.fly()
    eren.transformState()
    eren.attak()
    eren.fly()
}
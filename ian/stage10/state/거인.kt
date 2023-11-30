object 거인: State {
    override val myState = "거인 상태"
    override fun transform(erenState: ErenState) {
        erenState.state = 인간변신중
        println(erenState.state.myState)
        erenState.state = 인간
    }

    override fun fly() {
        println("거인은 날 수 없음")
    }

    override fun attack() {
        println("거인 공격")
    }
}
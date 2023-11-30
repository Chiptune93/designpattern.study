object 인간: State {
    override val myState = "인간 상태"

    override fun transform(erenState: ErenState){
        erenState.state = 거인변신중
        println(erenState.state.myState)
        erenState.state = 거인

    }

    override fun fly() {
        println("입체 기동 장치를 사용하여 날아감")
    }

    override fun attack() {
        println("칼로 공격 함")
    }
}
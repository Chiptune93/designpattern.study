object 거인변신중:State {
    override val myState = "거인으로 변신 중"

    override fun transform(erenState: ErenState) {
        println("변신 중엔 불가능")
    }

    override fun fly() {
        println("변신 중에는 날 수 없음")
    }

    override fun attack() {
        println("변신 중에는 공격 할 수 없음")
    }
}
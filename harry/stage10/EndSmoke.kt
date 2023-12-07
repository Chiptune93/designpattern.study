class EndSmoke(var me: Me) : CigaretteState {
    override fun smoke() {
        println("이미 담배를 껐습니다.")
    }

    override fun lightItUp() {
        println("이미 담배를 껐습니다.")
    }

    override fun cutOff() {
        println("이미 담배를 껐습니다.")
    }

    override fun endSmoke() {
        println("이미 담배를 다 피웠습니다.")
    }

}

class NoState(var me: Me): CigaretteState {

    override fun smoke() {
        println("아무 일도 일어나지 않았습니다.")
    }

    override fun lightItUp() {
        println("불을 붙입니다.")
        me.setState(me.s)
    }

    override fun cutOff() {
        println("소모되지 않아 털 수 없습니다.")
    }

    override fun endSmoke() {
        println("소모되지 않아 끌 수 없습니다.")
    }

}

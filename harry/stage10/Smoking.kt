class Smoking(var me: Me) : CigaretteState {
    override fun smoke() {
        println("담배를 핍니다.")
        if (me.cnt > 9) me.setState(me.c)
        else me.cnt++
    }

    override fun lightItUp() {
        println("이미 불이 붙었습니다.")
    }

    override fun cutOff() {
        println("재를 텁니다.")
        me.setState(me.c)
    }

    override fun endSmoke() {
        println("재를 털지 않아 끌 수 없습니다.")
    }

}

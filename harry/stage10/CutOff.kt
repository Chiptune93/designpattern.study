class CutOff(var me: Me):CigaretteState {
    override fun smoke() {
        println("이미 재를 털어서 필 수 없습니다.")
    }

    override fun lightItUp() {
        println("이미 재를 털어서 불을 붙일 수 없습니다.")
    }

    override fun cutOff() {
        println("이미 재를 털었습니다.")
    }

    override fun endSmoke() {
        println("담배 피기를 종료합니다.")
        me.setState(me.e)
    }

}

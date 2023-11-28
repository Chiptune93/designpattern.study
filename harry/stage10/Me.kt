class Me(var count: Int) {
    var n: NoState = NoState(this)
    var s: Smoking = Smoking(this)
    var c: CutOff = CutOff(this)
    var e: EndSmoke = EndSmoke(this)
    var now: CigaretteState
    var cnt: Int = 0

    init {
        cnt = count
        if (cnt > 0 ) now = s
        else now = n
    }

    fun setState(state:CigaretteState) {
        this.now = state
    }

    fun smoke() {
        println("담배를 핀 횟수 : ${cnt}")
        now.smoke()
    }

    fun lightItUp() {
        println("담배를 핀 횟수 : ${cnt}")
        now.lightItUp()
    }

    fun cutOff() {
        println("담배를 핀 횟수 : ${cnt}")
        now.cutOff()
    }

    fun endSmoke() {
        println("담배를 핀 횟수 : ${cnt}")
        now.endSmoke()
    }





}

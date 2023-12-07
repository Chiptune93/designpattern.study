fun main() {
    var me:Me = Me(0)
    me.lightItUp()
    for(i in  1..20) me.smoke()
    // me.smoke()
    me.cutOff()
    me.endSmoke()
}

package Facade

class MoveFacade(var kw: keyW, var ka: keyA, var ks: keyS, var kd: keyD) {
    fun warigari(): Unit {
        ka.type()
        kd.type()
        ka.type()
        kd.type()
        ka.type()
        kd.type()
        ka.type()
        kd.type()
        println("")
    }

    fun updown(): Unit {
        kw.type()
        ks.type()
        kw.type()
        kw.type()
        ks.type()
        println("")
    }
}

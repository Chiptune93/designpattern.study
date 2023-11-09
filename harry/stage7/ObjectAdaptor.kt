fun main() {
    var myduck = kakaoDuck()
    var myturkey = kakaoTurkey()

    var spy = TurkeyToDuckAdaptor(myturkey)

    myduck.quack()
    myturkey.fly()

    println(spy.javaClass)
    spy.quack()
    spy.fly()
}
package ObjectAdapter

fun main() {
    var myduck: Duck = kakaoDuck()
    var myturkey: Turkey = kakaoTurkey()

    var spy: Duck = TurkeyToDuckAdaptor(myturkey)

    myduck.quack()
    myturkey.fly()

    println(spy.javaClass)
    spy.quack()
    spy.fly()
}

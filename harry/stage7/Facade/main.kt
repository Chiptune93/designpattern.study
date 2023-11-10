package Facade

fun main() {
    val w: keyW = keyW()
    val a: keyA = keyA()
    val s: keyS = keyS()
    val d: keyD = keyD()
    val keyboard: MoveFacade = MoveFacade(w, a, s, d)

    keyboard.warigari()
    keyboard.updown()
}

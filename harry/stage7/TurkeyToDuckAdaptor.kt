class TurkeyToDuckAdaptor(private var turkey: kakaoTurkey) : Duck {
    override fun quack() {
        return turkey.golgol()
    }

    override fun fly(): Unit {
        turkey.fly()
    }
}
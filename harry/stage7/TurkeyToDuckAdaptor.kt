class TurkeyToDuckAdaptor(private var turkey: Turkey) : Duck {
    override fun quack() {
        return turkey.golgol()
    }

    override fun fly(): Unit {
        turkey.fly()
    }
}

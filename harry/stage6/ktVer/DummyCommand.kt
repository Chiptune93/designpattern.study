package ktVer

class DummyCommand : Command {
    override fun execute(): Unit = println("Dummy!")
    override fun undo(): Unit = println("Dummy Undo!")
}
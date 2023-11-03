package ktVer

interface Command {
    fun execute(): Unit
    fun undo(): Unit
}
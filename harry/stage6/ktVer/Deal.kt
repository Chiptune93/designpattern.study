package ktVer

import java.util.*

class Deal {
    val commandQueue: Queue<Command> = LinkedList<Command>()
    val rollbackQueue: Queue<Command> = LinkedList<Command>()

    fun setCommand(command: Command) = commandQueue.add(command)

    fun play(): Unit {
        try {
            while (!commandQueue.isEmpty()) {
                val rollbackCommandTemp = commandQueue.peek()
                commandQueue.poll().execute()
                rollbackQueue.add(rollbackCommandTemp)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            while (!rollbackQueue.isEmpty()) {
                rollback()
            }
        }
    }

    private fun rollback(): Unit {
        try {
            rollbackQueue.poll().undo()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}
package computer
import command.Command
class Computer (private val onCommand: Command, private val offCommand: Command) {
    fun on() {
        onCommand.execute()
    }
    fun off() {
        offCommand.execute()
    }
}

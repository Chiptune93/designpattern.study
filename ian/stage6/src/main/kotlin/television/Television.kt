package television
import command.Command
class Television (private val onCommand: Command, private val offCommand: Command) {
    fun on() {
        onCommand.execute()
    }
    fun off() {
        offCommand.execute()
    }
}

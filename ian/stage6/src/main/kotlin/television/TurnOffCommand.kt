package television

import command.Command

// command.Command 객체
class TurnOffCommand (private val power: Power) : Command {
    override fun execute() {
        power.turnOff()
    }
}
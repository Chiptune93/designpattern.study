package computer

import command.Command

// command.Command 객체

class TurnOnCommand (private val power: Power) : Command {
    override fun execute() {
        power.turnOn()
    }
}
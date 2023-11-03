import command.Command
import television.*

fun main(args: Array<String>) {
    val power = Power()

//    val turnOn : Command = TurnOnCommand(power)
//    val turnOff : Command = TurnOffCommand(power)
    val tel = Television(TurnOnCommand(power), TurnOffCommand(power)) // 인보커(Television) 에 리시버(power)를 담은 커맨드객체(TurnOnCommand)를 전달해주고

    tel.on() // 인보커에서 실행한다
    tel.off()
}
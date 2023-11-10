
fun main(args: Array<String>) {
    var acc = AccBatch()
    var yourName = YourNameBatch()

    var accGetUser = acc.getUser()
    var yourNameGetUser = Adapter(yourName).getUser()

    print(accGetUser)
    print(yourNameGetUser)
}
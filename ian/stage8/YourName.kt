
val userDataList = listOf(Person("ian.curtis",5),Person("harry.93",1))

class YourName: PermissionCheck() {
    override fun nameValidation(name: String) {
        println("유저 체크 ${ userDataList.filter { it.name == name } }")
    }

    override fun permissionValidation(name: String) {
        println("권한 체크 ${ userDataList.filter { it.name == name }[0].permissionLevel > 4 }")
    }
}
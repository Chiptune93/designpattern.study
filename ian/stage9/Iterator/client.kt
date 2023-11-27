val flexUserDataList = listOf(
    Person("ian.curtis","기술플랫폼실"),
    Person("harry.93","페이먼츠서비스실"),
    Person("taki.haru","기술플랫폼실"),
    Person("dwayne.jung","인프라플랫폼팀"),
)

val dbUserDataList = listOf(
    Person("ian.curtis","기술플랫폼실"),
    Person("harry.93","유가증권서버개발팀"),
    Person("taki.haru","워크플랫폼팀"),
    Person("dwayne.jung","인프라플랫폼팀"),
)

fun main() {
    var userList = IteratorUser(dbUserDataList)

    while(userList.hasNext()){
        var user = userList.next()
        if (user !in flexUserDataList) {
            println("!! update !! $user")
        } else {
            println("pass $user")
        }
    }
}
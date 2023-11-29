
class TitanUser(override var name: String): TitianComponent {
    var titans = arrayListOf<Any>()

    override fun getTitans() {
        print(name)
    }
//    override fun name(name:String) {
//        print(name)
//    }
}


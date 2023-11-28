
class TitanGroup(override var name: String): TitianComponent {
    var titans = arrayListOf<Any>()

    fun add(titan: TitianComponent) {
        titans.add(titan.name)
    }

    fun remove(titan: TitianComponent) {
        titans.remove(titan.name)
    }
    override fun getTitans() {
        print(titans)
    }
//    override fun name(name:String) {
//        print(titans)
//    }
}


package composite

fun main() {
    val c1 = SubCategory("1","main1")
    val c2 = SubCategory("2", "main2")
    val c3 = SubCategory("3", "main2")
    val c4 = SubCategory("4", null)
    val c5 = SubCategory("5", null)
    val m1 = MainCategory("main1",null, listOf(c1))
    val m2 = MainCategory("main2",null, listOf(c2,c3))
    m1.print()
    m2.print()
    c1.print()
    c2.print()
    c3.print()
    c4.print()
    c5.print()
}
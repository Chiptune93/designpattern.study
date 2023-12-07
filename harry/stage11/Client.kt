fun main() {
    var ps1: ProxyService = ProxyService("service1")
    var ps2: ProxyService = ProxyService("service2")
    var ps3: ProxyService = ProxyService("service3")

    println(ps1.mainDo())
    println(ps2.mainDo())
    println(ps3.mainDo())

}

/**
 * 프록시 객체
 */
class ProxyService : ServiceInterface {

    var s: UnkownService

    // 실제 작업 객체의 생명 주기를 관리한다.
    // 실제 작업 객체 접근 전에 생성자에서 invoke를 통해 serviceName에 따라 메소드 접근을 관리한다.
    // 메소드 접근 관리는 실제 객체 내부의 Property 값을 통해 어떤 메소드를 호출할지 결정한다.
    constructor(serviceName: String) {
        s = UnkownService()
        var h: IdentifyServiceHandler = IdentifyServiceHandler()
        h.invoke(s, serviceName)
    }

    fun getUnknownService(): UnkownService {
        return this.s
    }

    override fun mainDo(): String {
        return s.mainDo()
    }

    override fun doThis(): String {
        throw IllegalArgumentException("no do this in proxy")
    }

    override fun doThat(): String {
        throw IllegalArgumentException("no do that in proxy")
    }
}

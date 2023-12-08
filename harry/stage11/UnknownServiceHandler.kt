/**
 * 서비스 핸들러의 인터페이스, Invoke를 가지고 있다.
 */
interface UnknownServiceHandler {
    fun invoke(method: UnkownService, serviceName: String)
}

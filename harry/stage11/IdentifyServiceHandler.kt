/**
 * 서비스 핸들러, 서비스 네임에 따라 같이 호출된 실제 작업 객체의 프로퍼티를 조정하여
 * 객체 내부 메소드 접근을 제어하는 핸들러이다.
 */
class IdentifyServiceHandler : UnknownServiceHandler {
    override fun invoke(method: UnkownService, serviceName: String) {
        if (serviceName == "service1") method.property = 1
        if (serviceName == "service2") method.property = 2
    }
}

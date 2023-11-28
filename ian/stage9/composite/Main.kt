/*
시조의거인 유미르 프리츠 → 프리츠 왕가 → 레이스 가 → 우리 레이스 → 프리다 레이스 → 그리샤 예거 -> 에렌 예거
차력 거인 -> 에르디아 귀족 가문 → 마레의 전사 -> 피크 핑거
턱거인 -> 에르디아 귀족 가문 → 마레의 전사 → 마르셀 갤리어드 → 유미르 → 포르코 갤리어드
진격의거인 -> 에르디아 귀족 가문 → 에르디아 복권파 리더 → 엘런 크루거 → 그리샤 예거
여성형거인 -> 에르디아 귀족 가문 → 마레의 전사
짐승거인 -> 에르디아 귀족 가문 → 마레의 전사 → 톰 쿠사바
초대형거인 -> 에르디아 귀족 가문 → 마레의 전사 → 베르톨트 후버
전퇴의거인 -> 타이버 가문 → 라라 타이버
갑옷거인 -> 에르디아 귀족 가문 → 마레의 전사

 */

fun main(args: Array<String>) {
    var 유미르 = TitanGroup("유미르 가문")
    var 에르디아 = TitanGroup("에르디아 귀족 가문")
    var 마레전사 = TitanGroup("마레의 전사")

    val 시조의거인 = TitanUser("시조의거인")
    val 턱거인 = TitanUser("턱거인")
    val 진격의거인 = TitanUser("진격의거인")
    val 여성형거인 = TitanUser("여성형거인")
    val 짐승거인 = TitanUser("짐승거인")
    val 초대형거인 = TitanUser("초대형거인")
    val 전퇴의거인 = TitanUser("전퇴의거인")
    val 갑옷거인 = TitanUser("갑옷거인")

    마레전사.add(여성형거인)
    마레전사.add(갑옷거인)
    마레전사.add(턱거인)

    에르디아.add(전퇴의거인)
    에르디아.add(시조의거인)
    에르디아.add(진격의거인)
    에르디아.add(짐승거인)
    에르디아.add(초대형거인)

    유미르.add(에르디아)
    유미르.add(마레전사)

    유미르.getTitans()
    마레전사.getTitans()
    에르디아.getTitans()
}


package harry;

public class Simulator {
    public static void main(String[] args) {
        코카콜라 coke = new 코카콜라(); // 코카콜라 종목이 들어왔네?
        coke.setStatus(new 상장상태()); // 상장 상태이고
        coke.setWork(new CalPrice(100, 10)); // 이번에 100원 가격으로 10주가 들어왔다.
        coke.display(); // 그럼 현재 어떤 상태~ ???
    }
}

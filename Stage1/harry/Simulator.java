package harry;

public class Simulator {
    public static void main(String[] args) {
        코카콜라 coke = new 코카콜라();
        coke.setStatus(new 상장상태());
        coke.setWork(new CalPrice(100, 10));
        coke.display();
    }
}

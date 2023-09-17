package harry;

public class CalPrice implements Work {

    int price;
    int cnt;

    public CalPrice(int p, int c) {
        this.price = p;
        this.cnt = c;
    }

    @Override
    public void display() {
        System.out.println("가격은 " + (price * cnt) + "원 입니다.");
    }
}

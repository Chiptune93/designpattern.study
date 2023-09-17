package harry;

/**
 * 평가금액 계산 업무
 */
public class CalPrice implements Work {

    int price;
    int cnt;

    /**
     * 생성자로 가격과 수량을 받아 세팅함.
     * @param p
     * @param c
     */
    public CalPrice(int p, int c) {
        this.price = p;
        this.cnt = c;
    }

    /**
     * 받은 가격과 수량으로 계산하여 디스플레이
     */
    @Override
    public void display() {
        System.out.println("평가금액은 " + (price * cnt) + "원 입니다.");
    }
}

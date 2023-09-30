package harry;

/**
 * 종목 클래스는 주식 종목을 나타냄.
 */
public class 종목 {
    // 상태와 업무를 멤버로 가짐.
    상태 status;

    Work work;

    // 디스플레이에서는 현재 상태 및 할당 업무를 보여줌.
    public void display() {
        System.out.println("[상태]");
        this.status.display();
        System.out.println("[업무]");
        this.work.display();
    }

    // 세터 클래스
    public void setStatus(상태 status) {
        this.status = status;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}

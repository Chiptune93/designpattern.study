package harry;

public class 종목 {
    상태 status;

    Work work;

    public void display() {
        System.out.println("[상태]");
        this.status.display();
        System.out.println("[업무]");
        this.work.display();
    }

    public void setStatus(상태 status) {
        this.status = status;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}

package harry;

public class 상장상태 implements 상태{
    Status status = Status.상장;
    @Override
    public void display() {
        System.out.println("상장 상태 입니다.");
    }
}

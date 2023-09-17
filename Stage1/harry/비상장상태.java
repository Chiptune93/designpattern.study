package harry;

public class 비상장상태 implements 상태{
    Status status = Status.비상장;
    @Override
    public void display() {
        System.out.println("비상장 상태 입니다.");
    }
}

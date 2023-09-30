package harry;

/**
 * 상태 인터페이스에는 멤버변수 상태와, 현재 상태를 보여주는 함수가 있어야 함.
 */
public interface 상태 {
    Status status = Status.없음;

    void display();
}

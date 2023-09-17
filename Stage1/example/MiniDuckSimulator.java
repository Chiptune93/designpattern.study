package example;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack(); // MallardDuck에서 상속받은 performQuack() 메소드가 호출됨. example.QuackBehavior 에게 할일을 위임.
        mallard.performFly(); // performFly() 메소드도 호출한다.
    }
}

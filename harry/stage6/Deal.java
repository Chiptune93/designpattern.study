import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Deal {

    Queue<Command> commandQueue = new LinkedList<>();
    Queue<Command> rollbackQueue = new LinkedList<>();

    public Deal() {
    }

    public void setCommand(Command command) {
        commandQueue.add(command);
    }

    public void play() {
        rollbackQueue.add(commandQueue.peek());
        // 로직 실행
        try {
            while (!commandQueue.isEmpty()) {
                commandQueue.poll().execute();
            }
        } catch (Exception e) {
            // 에러 발생한 경우 보상로직 실행~
            e.printStackTrace();
            while (!rollbackQueue.isEmpty()) {
                rollback();
            }
        }

    }

    public void rollback() {
        try {
            rollbackQueue.poll().undo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

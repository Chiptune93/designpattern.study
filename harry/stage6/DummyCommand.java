public class DummyCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Dummy");
    }

    @Override
    public void undo() {
        System.out.println("Dummy");
    }
}

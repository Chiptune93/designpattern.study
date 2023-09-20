//package ian.curtis;

public class Simulator {
    public static void main(String[] args) {
        Pistol a = new Pistol();
        a.stance();
//        Rifle rifle = new Rifle();
//        rifle.stance();
    }
}
public interface DemonHunter {
    public abstract void stance();
}

class Pistol implements DemonHunter {
    public void stance() {
        System.out.printf("pistol mode");
    }
}
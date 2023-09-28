package ian;
public class Simulator {
    public static void main(String[] args) {
        TakeWeaponStrategy hand = new ian.TakeWeaponStrategy();
        hand.setWeapon(new Rifle());
        hand.stance();
//        Rifle rifle = new Rifle();
//        rifle.stance();
    }
}
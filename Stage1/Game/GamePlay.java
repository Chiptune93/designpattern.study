package Game;

public class GamePlay {
    public static void main(String[] args) {
        King king = new King();
        king.setWeapon(new KnifeBehavior());
        king.fight();

        Queen queen = new Queen();
        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();

        Knight knight = new Knight();
        knight.setWeapon(new SwordBehavior());
        knight.fight();

        Troll troll = new Troll();
        troll.setWeapon(new AxeBehavior());
        troll.fight();
    }
}

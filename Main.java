public class Main {

    public static void main(String[] args) {

        // set up the creatures
        Creature a = new Arman(); // Creatures must be manually switched between still sadly
        Creature b = new Hans();

        a.health = 120;
        b.health = 120;

        // set up the battle
        BattleSystem battleSystem = new BattleSystem();

        // run the battle
        battleSystem.battle(a, b);

        if (a.health < 0) {
            System.out.println(b.name + " Wins the battle!");
        }

        if (b.health < 0) {
            System.out.println(a.name + " Wins the battle!");
        }
    }
}
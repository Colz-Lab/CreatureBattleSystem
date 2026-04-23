public class BattleSystem {

    public void battle(Creature a, Creature b) {
        while (a.health > 0 && b.health > 0) {
            float attackPower;

            if (Rand.randomInt(0, 4) == 1) {
                attackPower = a.heavyAttack();
            } else {
                attackPower = a.attack();
            }

            b.defend(attackPower);
            System.out.println(a.readAction());
            System.out.println(b.readAction());

            System.out.println(a);
            System.out.println(b);
            System.out.println();

            // swap turns
            Creature temp = a;
            a = b;
            b = temp;
        }
    }
}
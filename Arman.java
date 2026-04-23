public class Arman extends Creature {

    // Set the character's identity used for combat output and winner display
    public Arman() {
        this.name = "Arman";
    }


    // Returns the heavy damage done by the Creature
    @Override
    public float heavyAttack() {

        // Chance of missing
        if (Rand.randomInt(0, 10) < 8) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 0 - 75
        float power = Rand.randomFloat(0, 75);
        action = name + " heavy attacked with power " + power + "!";
        return power;
    }


    @Override
    public float attack() {

        // Chance of missing
        if (Rand.randomInt(0, 15) < 4) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with power " + power + "!";
        return power;
    }


    @Override
    public void defend(float incomingPower) {

        // Chance of reducing damage taken
        if (Rand.randomInt(0, 9) < 4) {
            incomingPower = incomingPower * 0.6f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        } else {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }
}
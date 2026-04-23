public class Marcus extends Creature {

    // Set the character's identity used for combat output and winner display
    public Marcus() {
        this.name = "Marcus";
    }


    // Returns the heavy damage done by the Creature
    @Override
    public float heavyAttack() {

        // Chance of missing
        if (Rand.randomInt(0, 10) < 8) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 0-50
        float power = Rand.randomFloat(0, 50);
        action = name + " heavy attacked with power " + power + "!";
        return power;
    }


    @Override
    public float attack() {

        // Chance of missing
        if (Rand.randomInt(0, 10) < 3) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 8 - 30
        float power = Rand.randomFloat(8, 30);
        action = name + " attacked with power " + power + "!";
        return power;
    }


    @Override
    public void defend(float incomingPower) {

        // Chance of reducing damage taken
        if (Rand.randomInt(0, 7) < 1) {
            incomingPower = incomingPower * 0.5f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        } else {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }
}
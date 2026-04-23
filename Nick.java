public class Nick extends Creature {

    // Set the character's identity used for combat output and winner display
    public Nick() {
        this.name = "Nick";
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
        if (Rand.randomInt(0, 20) < 1) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 10-15
        float power = Rand.randomFloat(10, 15);
        action = name + " attacked with power " + power + "!";
        return power;
    }


    @Override
    public void defend(float incomingPower) {

        // Chance of reducing damage taken
        if (Rand.randomInt(0, 8) < 4) {
            incomingPower = incomingPower * 0.3f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        } else {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }
}
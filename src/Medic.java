public class Medic extends Hero{

    private double healPoints;

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public double increaseExperience() {
        return healPoints = healPoints * 0.1;
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic has applied super ability: Heal");
    }
}

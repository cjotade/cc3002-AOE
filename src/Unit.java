public abstract class Unit implements Attacker {
    double hitPoints;
    int attackPower;

    @Override
    public void setHitPoints(double hitPoints){
        this.hitPoints = hitPoints;
    }

    public void heal(double additionalHealth){
        this.hitPoints += additionalHealth;
    }

    @Override
    public double getHitPoints() {
        return hitPoints;
    }

    @Override
    public void decreaseHealth(int attackPower) {
        hitPoints -= attackPower;
    }

    @Override
    public void attack(Attackable opponent){
        opponent.decreaseHealth(attackPower);
    }

    @Override
    public double getAttackPoints(Attackable opponent) {
        double beforeAttack = getHitPoints();
        attack(opponent);
        return beforeAttack - getHitPoints();
    }


}

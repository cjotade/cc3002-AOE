package cc3002;

public abstract class Unit extends Entity {
    int attackPower;

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

    public void heal(double additionalHealth){
        this.hitPoints += additionalHealth;
    }

}

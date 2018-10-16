package cc3002;

public abstract class Building extends Entity {
    int attackPower;

    @Override
    public void setHitPoints(double hitPoints){
        this.hitPoints = hitPoints;
    }

    @Override
    public void attack(Attackable opponent){
        opponent.decreaseHealth(attackPower);
    }

    @Override
    public void decreaseHealth(int attackPower) {
        hitPoints -= attackPower;
    }

    @Override
    public double getAttackPoints(Attackable opponent) {
        double beforeAttack = getHitPoints();
        attack(opponent);
        return beforeAttack - getHitPoints();
    }

}


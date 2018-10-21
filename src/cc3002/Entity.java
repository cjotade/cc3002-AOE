package cc3002;

/**
 * Entity that represents the architecture of a Building or a Unit.
 *
 * @author Camilo Jara Do Nascimento.
 */
public abstract class Entity implements Attackable {
    private double hitPoints;
    private double attackPower;
    private double maxHitPoints;

    public double getHitPoints(){
        return hitPoints;
    }

    public void setHitPoints(double hitPoints){
        this.hitPoints = hitPoints;
    }

    public void setMaxHitPoints(double maxHitPoints){
        this.maxHitPoints = maxHitPoints;
    }

    public double getMaxHitPoints(){
        return maxHitPoints;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower){
        this.attackPower = attackPower;
    }

    public boolean isAlive(){
        return getHitPoints() > 0;
    }

    public boolean isMaxHitPoints(){
        return getMaxHitPoints() < getHitPoints();
    }

    public void setLimitHitPoints(){
        if(!isAlive()){
            setHitPoints(0);
        }
        if(isMaxHitPoints()){
            setHitPoints(getMaxHitPoints());
        }
    }


}

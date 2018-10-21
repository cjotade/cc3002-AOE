package cc3002;

/**
 * Units.
 *
 * @author Camilo Jara Do Nascimento.
 */
public abstract class Unit extends Entity implements Attacker {
    /**
     * Constructor for a default Unit.
     */
    public Unit(){}

    /**
     * Constructor for a Unit setting its hit points and attack power.
     *
     * @param hitPoints the hit points of the Unit.
     * @param attackPower the attack power of the Unit.
     */
    public Unit(double hitPoints,double attackPower){
        setHitPoints(hitPoints);
        setAttackPower(attackPower);
        setMaxHitPoints(2*getHitPoints());
    }
}


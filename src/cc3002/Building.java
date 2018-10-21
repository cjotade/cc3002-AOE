package cc3002;

/**
 * Buildings.
 *
 * @author Camilo Jara Do Nascimento.
 */
public abstract class Building extends Entity {
    /**
     * Constructor for a default Building.
     */
    public Building() {}

    /**
     * Constructor for a Building that only can receive attacks.
     *
     * @param hitPoints the hit points of the Building.
     */
    public Building(double hitPoints) {
        setHitPoints(hitPoints);
        setMaxHitPoints(getHitPoints());
    }

    /**
     * Constructor for a Building that can be attack and receive attacks.
     *
     * @param hitPoints the hit points of the Building.
     * @param attackPower the attack power of the Building.
     */
    public Building(double hitPoints, double attackPower){
        setHitPoints(hitPoints);
        setAttackPower(attackPower);
        setMaxHitPoints(getHitPoints());
    }

}


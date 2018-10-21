package cc3002;

/**
 * Interface implemented to mark when you can be attacked.
 *
 * @author Camilo Jara Do Nascimento.
 */
public interface Attackable {
    /**
     * Gets the actual hit points of an Attackable.
     *
     * @return the hit points.
     */
    double getHitPoints();

    /**
     * Set the actual hit points to given parameter of an Attackable.
     *
     * @param hitPoints the new hit points that will be set.
     */
    void setHitPoints(double hitPoints);

    /**
     * Gets the maximum hit points that an Attackable can reach.
     *
     * @return the maximum hit points.
     */
    double getMaxHitPoints();

    /**
     * Set the actual hit points to given parameter of an Attackable.
     *
     * @param maxHitPoints the new maximum hit points that will be set.
     */
    void setMaxHitPoints(double maxHitPoints);

    /**
     * If the Attackable is dead or not.
     *
     * @return true if the Attackable is dead, false if not.
     */
    boolean isAlive();

    /**
     * If the Attackable reaches its maximum hit points.
     *
     * @return true if it's on its maximum hit points, false if not.
     */
    boolean isMaxHitPoints();

    /**
     * Set the actual hit points to 0 or its maximum hit points if the Attackable is out of this range.
     */
    void setLimitHitPoints();

    /**
     * Receives an attack of a InfantryUnit.
     *
     * @param infantry the attacking InfantryUnit.
     */
    void attackByInfantryUnit(InfantryUnit infantry);

    /**
     * Receives an attack of a Castle.
     *
     * @param castle the attacking Castle.
     */
    void attackByCastle(Castle castle);

    /**
     * Receives an attack of a ArcherUnit.
     *
     * @param archer the attacking ArcherUnit.
     */
    void attackByArcherUnit(ArcherUnit archer);

    /**
     * Receives an attack of a CavalryUnit.
     *
     * @param cavalry the attacking CavalryUnit.
     */
    void attackByCavalryUnit(CavalryUnit cavalry);

    /**
     * Receives an attack of a SiegeUnit.
     *
     * @param siege the attacking SiegeUnit.
     */
    void attackBySiegeUnit(SiegeUnit siege);

    /**
     * Receives an attack of a Villager.
     *
     * @param villager the attacking Villager.
     */
    void attackByVillager(Villager villager);

    /**
     * Receives an attack (heal) of a Monk.
     *
     * @param monk the attacking (healing) Monk.
     */
    void attackByMonk(Monk monk);

}

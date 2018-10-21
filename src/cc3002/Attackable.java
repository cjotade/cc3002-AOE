package cc3002;

public interface Attackable {
    double getHitPoints();
    void setHitPoints(double hitPoints);
    double getMaxHitPoints();
    void setMaxHitPoints(double maxHitPoints);
    void attackByInfantryUnit(InfantryUnit infantry);
    void attackByCastle(Castle castle);
    void attackByArcherUnit(ArcherUnit archer);
    void attackByCavalryUnit(CavalryUnit cavalry);
    void attackBySiegeUnit(SiegeUnit siege);
    void attackByVillager(Villager villager);
    void attackByMonk(Monk monk);
    boolean isAlive();
    boolean isMaxHitPoints();
    void setLimitHitPoints();


}

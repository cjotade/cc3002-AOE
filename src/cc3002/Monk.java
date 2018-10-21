package cc3002;

public class Monk extends Unit{
    public Monk() {
        setHitPoints(30);
        setAttackPower(9);
    }

    public Monk(double hitPoints, double attackPower) {
        super(hitPoints, attackPower);
    }

    @Override
    public void attack(Attackable opponent) {
        opponent.attackByMonk(this);
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry) {
        setHitPoints(0);
    }

    @Override
    public void attackByCastle(Castle castle) {
        setHitPoints(0);
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        setHitPoints(0);
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        setHitPoints(0);
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        setHitPoints(0);
    }

    @Override
    public void attackByVillager(Villager villager){
        setHitPoints(getHitPoints());
    }

    @Override
    public void attackByMonk(Monk monk){
        setHitPoints(getHitPoints()+0.5*monk.getAttackPower());
    }
}

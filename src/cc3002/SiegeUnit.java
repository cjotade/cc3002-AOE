package cc3002;

public class SiegeUnit extends Unit {

    public SiegeUnit(double hitPoints, double attackPower) {
        super(hitPoints, attackPower);
    }


    @Override
    public void attack(Attackable opponent) {
        opponent.attackBySiegeUnit(this);
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry) {
        setHitPoints(getHitPoints()-1.5*infantry.getAttackPower());
    }

    @Override
    public void attackByCastle(Castle castle) {
        setHitPoints(getHitPoints()-1.2*castle.getAttackPower());
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        setHitPoints(getHitPoints()-0.8*archer.getAttackPower());
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        setHitPoints(getHitPoints()-1.2*cavalry.getAttackPower());
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        setHitPoints(getHitPoints()-1.5*siege.getAttackPower());
    }

    @Override
    public void attackByVillager(Villager villager){
        setHitPoints(getHitPoints()+0.5*villager.getAttackPower());
    }

    @Override
    public void attackByMonk(Monk monk){
        setHitPoints(getHitPoints());
    }
}

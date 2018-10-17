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
        //this.hitPoints -= 1.5*infantry.attackPower;
        setHitPoints(getHitPoints()-1.5*infantry.getAttackPower());
    }

    @Override
    public void attackByCastle(Castle castle) {
        //this.hitPoints -= 1.2*castle.attackPower;
        setHitPoints(getHitPoints()-1.2*castle.getAttackPower());
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        //this.hitPoints -= 0.8*archer.attackPower;
        setHitPoints(getHitPoints()-0.8*archer.getAttackPower());
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        //this.hitPoints -= 1.2*cavalry.attackPower;
        setHitPoints(getHitPoints()-1.2*cavalry.getAttackPower());
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        //this.hitPoints -= 1.5*siege.attackPower;
        setHitPoints(getHitPoints()-1.5*siege.getAttackPower());
    }

    @Override
    public void attackByVillager(Villager villager){
        //this.hitPoints += 0.5*villager.attackPower;
        setHitPoints(getHitPoints()+0.5*villager.getAttackPower());
    }

    @Override
    public void attackByMonk(Monk monk){
        //this.hitPoints += 0;
        setHitPoints(getHitPoints());
    }
}

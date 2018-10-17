package cc3002;

public class CavalryUnit extends Unit {
    public CavalryUnit(double hitPoints, double attackPower) {
        super(hitPoints, attackPower);
    }

    @Override
    public void attack(Attackable opponent) {
        opponent.attackByCavalryUnit(this);
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry){
        //this.hitPoints -= 1.2*infantry.attackPower;
        setHitPoints(getHitPoints()-1.2*infantry.getAttackPower());
    }

    @Override
    public void attackByCastle(Castle castle){
        //this.hitPoints -= 1.2*castle.attackPower;
        setHitPoints(getHitPoints()-1.2*castle.getAttackPower());
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        //this.hitPoints -= 1.0*archer.attackPower;
        setHitPoints(getHitPoints()-1.0*archer.getAttackPower());
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        //this.hitPoints -= 1.0*cavalry.attackPower;
        setHitPoints(getHitPoints()-1.0*cavalry.getAttackPower());
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        //this.hitPoints -= 1.0*siege.attackPower;
        setHitPoints(getHitPoints()-1.0*siege.getAttackPower());
    }

    @Override
    public void attackByVillager(Villager villager){
        //this.hitPoints -= 0.5*villager.attackPower;
        setHitPoints(getHitPoints()-0.5*villager.getAttackPower());
    }

    @Override
    public void attackByMonk(Monk monk){
        //this.hitPoints += 0.5*monk.attackPower;
        setHitPoints(getHitPoints()+0.5*monk.getAttackPower());
    }
}

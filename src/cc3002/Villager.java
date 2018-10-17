package cc3002;

public class Villager extends Unit{
    public Villager(double hitPoints, double attackPower) {
        super(hitPoints, attackPower);
    }

    @Override
    public void attack(Attackable opponent){
        opponent.attackByVillager(this);
    }

    @Override
    public void attackByCastle(Castle castle){
        //this.hitPoints -= 1.2*castle.attackPower;
        setHitPoints(getHitPoints()-1.2*castle.getAttackPower());
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry){
        //this.hitPoints -= 1.5*infantry.attackPower;
        setHitPoints(getHitPoints()-1.5*infantry.getAttackPower());
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        //this.hitPoints -= 1.5*archer.attackPower;
        setHitPoints(getHitPoints()-1.5*archer.getAttackPower());
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        //this.hitPoints -= 1.5*cavalry.attackPower;
        setHitPoints(getHitPoints()-1.5*cavalry.getAttackPower());
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        //this.hitPoints -= 1.5*siege.attackPower;
        setHitPoints(getHitPoints()-1.5*siege.getAttackPower());
    }

    @Override
    public void attackByVillager(Villager villager){
        //this.hitPoints -= 1.0*villager.attackPower;
        setHitPoints(getHitPoints()-1.0*villager.getAttackPower());
    }

    @Override
    public void attackByMonk(Monk monk){
        //this.hitPoints += 0.5*monk.attackPower;
        setHitPoints(getHitPoints()+0.5*monk.getAttackPower());
    }
}

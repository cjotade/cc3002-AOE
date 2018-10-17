package cc3002;

public class Castle extends Building implements Attacker {

    public Castle(double hitPoints, double attackPower){
        super(hitPoints,attackPower);
    }

    /*
    @Override
    public double getAttackPoints() {
        return attackPower;
    }
    */
    @Override
    public void attack(Attackable opponent){
        opponent.attackByCastle(this);
    }

    @Override
    public void attackByCastle(Castle castle){
        setHitPoints(getHitPoints()-0.1*castle.getAttackPower());
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry){
        setHitPoints(getHitPoints()-0.3*infantry.getAttackPower());
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        setHitPoints(getHitPoints()-0.1*archer.getAttackPower());
        //this.hitPoints -= 0.1*archer.attackPower;
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        setHitPoints(getHitPoints()-1.2*cavalry.getAttackPower());
        //this.hitPoints -= 0.3*cavalry.attackPower;
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        setHitPoints(getHitPoints()-2.0*siege.getAttackPower());
        //this.hitPoints -= 2.0*siege.attackPower;
    }

    @Override
    public void attackByVillager(Villager villager){
        setHitPoints(getHitPoints()+0.3*villager.getAttackPower());
        //this.hitPoints += 0.3*villager.attackPower;
    }

    @Override
    public void attackByMonk(Monk monk){
        setHitPoints(getHitPoints());
        //this.hitPoints += 0;
    }

}

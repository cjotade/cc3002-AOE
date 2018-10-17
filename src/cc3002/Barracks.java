package cc3002;

public class Barracks extends Building {

    public Barracks(double hitPoints){
        super(hitPoints);
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry){
        //this.hitPoints -= 0.7*infantry.attackPower;
        setHitPoints(getHitPoints()-0.7*infantry.getAttackPower());
    }

    @Override
    public void attackByCastle(Castle castle){
        //this.hitPoints -= 0.7*castle.attackPower;
        setHitPoints(getHitPoints()-0.7*castle.getAttackPower());
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        //this.hitPoints -= 0.7*archer.attackPower;
        setHitPoints(getHitPoints()-0.7*archer.getAttackPower());
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        //this.hitPoints -= 0.7*cavalry.attackPower;
        setHitPoints(getHitPoints()-0.7*cavalry.getAttackPower());
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        //this.hitPoints -= 2.0*siege.attackPower;
        setHitPoints(getHitPoints()-2.0*siege.getAttackPower());
    }

    @Override
    public void attackByVillager(Villager villager){
        //this.hitPoints += 0.7*villager.attackPower;
        setHitPoints(getHitPoints()+0.7*villager.getAttackPower());
    }

    @Override
    public void attackByMonk(Monk monk){
        //this.hitPoints += 0;
        setHitPoints(getHitPoints());
    }
}

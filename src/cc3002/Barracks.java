package cc3002;

public class Barracks extends Building {

    public Barracks(double hitPoints){
        super(hitPoints);
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry){
        this.hitPoints -= 0.7*infantry.attackPower;
    }

    @Override
    public void attackByCastle(Castle castle){
        this.hitPoints -= 0.7*castle.attackPower;
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        this.hitPoints -= 0.7*archer.attackPower;
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        this.hitPoints -= 0.7*cavalry.attackPower;
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        this.hitPoints -= 2.0*siege.attackPower;
    }

    @Override
    public void attackByVillager(Villager villager){
        this.hitPoints += 0.7*villager.attackPower;
    }

    @Override
    public void attackByMonk(Monk monk){
        this.hitPoints += 0;
    }
}

package cc3002;

public class ArcherUnit extends Unit {
    public ArcherUnit(double hitPoints, double attackPower) {
        super(hitPoints, attackPower);
    }

    @Override
    public void attack(Attackable opponent) {
        opponent.attackByArcherUnit(this);
    }

    @Override
    public void attackByInfantryUnit(InfantryUnit infantry){
        this.hitPoints -= 1.2*infantry.attackPower;
    }

    @Override
    public void attackByCastle(Castle castle){
        this.hitPoints -= 1.2*castle.attackPower;
    }

    @Override
    public void attackByArcherUnit(ArcherUnit archer) {
        this.hitPoints -= 1.2*archer.attackPower;
    }

    @Override
    public void attackByCavalryUnit(CavalryUnit cavalry) {
        this.hitPoints -= 1.5*cavalry.attackPower;
    }

    @Override
    public void attackBySiegeUnit(SiegeUnit siege) {
        this.hitPoints -= 1.5*siege.attackPower;
    }

    @Override
    public void attackByVillager(Villager villager){
        this.hitPoints -= 1.0*villager.attackPower;
    }

    @Override
    public void attackByMonk(Monk monk){
        this.hitPoints += 0.5*monk.attackPower;
    }

}

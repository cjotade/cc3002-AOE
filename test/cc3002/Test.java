package cc3002;

import org.junit.Before;

public class Test {
    protected ArcherUnit defaultArcherUnit;
    protected InfantryUnit defaultInfantryUnit;
    protected CavalryUnit defaultCavalryUnit;
    protected SiegeUnit defaultSiegeUnit;
    protected Villager defaultVillager;
    protected Monk defaultMonk;
    protected Castle defaultCastle;
    protected Barracks defaultBarracks;
    protected ArcherUnit archerUnit;
    protected InfantryUnit infantryUnit;
    protected CavalryUnit cavalryUnit;
    protected SiegeUnit siegeUnit;
    protected Villager villager;
    protected Monk monk;
    protected Castle castle;
    protected Barracks barracks;

    @Before
    public void setUp() throws Exception{
        defaultArcherUnit = new ArcherUnit();
        defaultInfantryUnit = new InfantryUnit();
        defaultCavalryUnit = new CavalryUnit();
        defaultSiegeUnit = new SiegeUnit();
        defaultVillager = new Villager();
        defaultMonk = new Monk();
        defaultCastle = new Castle();
        defaultBarracks = new Barracks();
        archerUnit = new ArcherUnit(100,10);
        infantryUnit = new InfantryUnit(100,10);
        cavalryUnit = new CavalryUnit(100,10);
        siegeUnit = new SiegeUnit(100,10);
        villager = new Villager(100,10);
        monk = new Monk(100,10);
        castle = new Castle(100,10);
        barracks = new Barracks(100);
    }
}

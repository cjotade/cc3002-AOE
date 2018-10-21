package cc3002;

import org.junit.Test;

import static org.junit.Assert.*;

public class InfantryUnitTest extends cc3002.Test {

    @Test
    public void testAttacks() {
        defaultInfantryUnit.attack(defaultArcherUnit);
        defaultInfantryUnit.attack(defaultInfantryUnit);
        defaultInfantryUnit.attack(defaultCavalryUnit);
        defaultInfantryUnit.attack(defaultSiegeUnit);
        defaultInfantryUnit.attack(defaultVillager);
        defaultInfantryUnit.attack(defaultMonk);
        defaultInfantryUnit.attack(defaultCastle);
        defaultInfantryUnit.attack(defaultBarracks);
        infantryUnit.attack(archerUnit);
        infantryUnit.attack(infantryUnit);
        infantryUnit.attack(cavalryUnit);
        infantryUnit.attack(siegeUnit);
        infantryUnit.attack(villager);
        infantryUnit.attack(monk);
        infantryUnit.attack(castle);
        infantryUnit.attack(barracks);
        assertEquals(defaultArcherUnit.getHitPoints(),22.8,0.01);
        assertEquals(defaultInfantryUnit.getHitPoints(),39,0.01);
        assertEquals(defaultCavalryUnit.getHitPoints(),92.8,0.01);
        assertEquals(defaultSiegeUnit.getHitPoints(),51,0.01);
        assertEquals(defaultVillager.getHitPoints(),16,0.01);
        assertEquals(defaultMonk.getHitPoints(),0,0.01);
        assertEquals(defaultCastle.getHitPoints(),4798.2,0.01);
        assertEquals(defaultBarracks.getHitPoints(),1495.8,0.01);
        assertEquals(archerUnit.getHitPoints(),88,0.01);
        assertEquals(infantryUnit.getHitPoints(),90,0.01);
        assertEquals(cavalryUnit.getHitPoints(),88,0.01);
        assertEquals(siegeUnit.getHitPoints(),85,0.01);
        assertEquals(villager.getHitPoints(),85,0.01);
        assertEquals(monk.getHitPoints(),0,0.01);
        assertEquals(castle.getHitPoints(),97,0.01);
        assertEquals(barracks.getHitPoints(),93,0.01);
    }

}
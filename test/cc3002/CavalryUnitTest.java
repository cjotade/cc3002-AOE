package cc3002;

import org.junit.Test;

import static org.junit.Assert.*;

public class CavalryUnitTest extends cc3002.Test {
    @Test
    public void testAttacks() {
        defaultCavalryUnit.attack(defaultArcherUnit);
        defaultCavalryUnit.attack(defaultInfantryUnit);
        defaultCavalryUnit.attack(defaultCavalryUnit);
        defaultCavalryUnit.attack(defaultSiegeUnit);
        defaultCavalryUnit.attack(defaultVillager);
        defaultCavalryUnit.attack(defaultMonk);
        defaultCavalryUnit.attack(defaultCastle);
        defaultCavalryUnit.attack(defaultBarracks);
        cavalryUnit.attack(archerUnit);
        cavalryUnit.attack(infantryUnit);
        cavalryUnit.attack(cavalryUnit);
        cavalryUnit.attack(siegeUnit);
        cavalryUnit.attack(villager);
        cavalryUnit.attack(monk);
        cavalryUnit.attack(castle);
        cavalryUnit.attack(barracks);
        assertEquals(defaultArcherUnit.getHitPoints(),15,0.01);
        assertEquals(defaultInfantryUnit.getHitPoints(),35,0.01);
        assertEquals(defaultCavalryUnit.getHitPoints(),90,0.01);
        assertEquals(defaultSiegeUnit.getHitPoints(),48,0.01);
        assertEquals(defaultVillager.getHitPoints(),10,0.01);
        assertEquals(defaultMonk.getHitPoints(),0,0.01);
        assertEquals(defaultCastle.getHitPoints(),4788,0.01);
        assertEquals(defaultBarracks.getHitPoints(),1493,0.01);
        assertEquals(archerUnit.getHitPoints(),85,0.01);
        assertEquals(infantryUnit.getHitPoints(),90,0.01);
        assertEquals(cavalryUnit.getHitPoints(),90,0.01);
        assertEquals(siegeUnit.getHitPoints(),88,0.01);
        assertEquals(villager.getHitPoints(),85,0.01);
        assertEquals(monk.getHitPoints(),0,0.01);
        assertEquals(castle.getHitPoints(),88,0.01);
        assertEquals(barracks.getHitPoints(),93,0.01);
    }

}
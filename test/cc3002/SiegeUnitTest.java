package cc3002;

import org.junit.Test;

import static org.junit.Assert.*;

public class SiegeUnitTest extends cc3002.Test {
    @Test
    public void testAttacks() {
        defaultSiegeUnit.attack(defaultArcherUnit);
        defaultSiegeUnit.attack(defaultInfantryUnit);
        defaultSiegeUnit.attack(defaultCavalryUnit);
        defaultSiegeUnit.attack(defaultVillager);
        defaultSiegeUnit.attack(defaultMonk);
        defaultSiegeUnit.attack(defaultCastle);
        defaultSiegeUnit.attack(defaultBarracks);
        defaultSiegeUnit.attack(defaultSiegeUnit);
        siegeUnit.attack(archerUnit);
        siegeUnit.attack(infantryUnit);
        siegeUnit.attack(cavalryUnit);
        siegeUnit.attack(siegeUnit);
        siegeUnit.attack(villager);
        siegeUnit.attack(monk);
        siegeUnit.attack(castle);
        siegeUnit.attack(barracks);
        assertEquals(defaultArcherUnit.getHitPoints(),0,0.01);
        assertEquals(defaultInfantryUnit.getHitPoints(),0,0.01);
        assertEquals(defaultCavalryUnit.getHitPoints(),50,0.01);
        assertEquals(defaultSiegeUnit.getHitPoints(),0,0.01);
        assertEquals(defaultVillager.getHitPoints(),0,0.01);
        assertEquals(defaultMonk.getHitPoints(),0,0.01);
        assertEquals(defaultCastle.getHitPoints(),4700,0.01);
        assertEquals(defaultBarracks.getHitPoints(),1400,0.01);
        assertEquals(archerUnit.getHitPoints(),85,0.01);
        assertEquals(infantryUnit.getHitPoints(),85,0.01);
        assertEquals(cavalryUnit.getHitPoints(),90,0.01);
        assertEquals(siegeUnit.getHitPoints(),85,0.01);
        assertEquals(villager.getHitPoints(),85,0.01);
        assertEquals(monk.getHitPoints(),0,0.01);
        assertEquals(castle.getHitPoints(),80,0.01);
        assertEquals(barracks.getHitPoints(),80,0.01);
    }

}
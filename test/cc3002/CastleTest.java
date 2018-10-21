package cc3002;

import org.junit.Test;

import static org.junit.Assert.*;

public class CastleTest extends cc3002.Test {

    @Test
    public void testAttacks() {
        defaultCastle.attack(defaultArcherUnit);
        defaultCastle.attack(defaultInfantryUnit);
        defaultCastle.attack(defaultCavalryUnit);
        defaultCastle.attack(defaultSiegeUnit);
        defaultCastle.attack(defaultVillager);
        defaultCastle.attack(defaultMonk);
        defaultCastle.attack(defaultCastle);
        defaultCastle.attack(defaultBarracks);
        castle.attack(archerUnit);
        castle.attack(infantryUnit);
        castle.attack(cavalryUnit);
        castle.attack(siegeUnit);
        castle.attack(villager);
        castle.attack(monk);
        castle.attack(castle);
        castle.attack(barracks);
        assertEquals(defaultArcherUnit.getHitPoints(),16.8,0.01);
        assertEquals(defaultInfantryUnit.getHitPoints(),31.8,0.01);
        assertEquals(defaultCavalryUnit.getHitPoints(),86.8,0.01);
        assertEquals(defaultSiegeUnit.getHitPoints(),46.8,0.01);
        assertEquals(defaultVillager.getHitPoints(),11.8,0.01);
        assertEquals(defaultMonk.getHitPoints(),0,0.01);
        assertEquals(defaultCastle.getHitPoints(),4798.9,0.01);
        assertEquals(defaultBarracks.getHitPoints(),1492.3,0.01);
        assertEquals(archerUnit.getHitPoints(),88,0.01);
        assertEquals(infantryUnit.getHitPoints(),88,0.01);
        assertEquals(cavalryUnit.getHitPoints(),88,0.01);
        assertEquals(siegeUnit.getHitPoints(),88,0.01);
        assertEquals(villager.getHitPoints(),88,0.01);
        assertEquals(monk.getHitPoints(),0,0.01);
        assertEquals(castle.getHitPoints(),99,0.01);
        assertEquals(barracks.getHitPoints(),93,0.01);
    }

}
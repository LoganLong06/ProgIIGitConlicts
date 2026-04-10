package ca.qc.cegepheritage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HerbTest {
    @Test
    public void testConstructorSetsAllAttributesCorrectly() {
        Herb herb = new Herb("Herb",2,2);
        assertEquals("Herb",herb.getPlantName());
        assertEquals(2,herb.getDaysInGarden());
        assertEquals(2,herb.getHoursOfSunlightPerDay());
    }
    @Test
    public void testGetInfoReturnsCorrectString() {
        Herb herb = new Herb("Herb",2,2);
        assertEquals("Herb has been in the garden for 2 days and gets 2 hours of sunlight per day.",herb.getInfo());
    }

    @Test
    public void testGetDailyGrowthReturnsTheCorrectDailyGrowth() {
        Herb herb = new Herb("Herb",2,2);
        assertEquals((2 * 0.5) + (2 * 0.1),herb.getDailyGrowth());
    }

    @Test
    public void testApplyMagicBoostIncreasesTheHoursOfSunlightBy2AndReturnsTheCorrectString() {
        Herb herb = new Herb("Herb",2,2);
        assertEquals("The sun energy of this plant has been increased by two hours!",herb.applyMagicBoost());
        assertEquals(4,herb.getHoursOfSunlightPerDay());
    }
}
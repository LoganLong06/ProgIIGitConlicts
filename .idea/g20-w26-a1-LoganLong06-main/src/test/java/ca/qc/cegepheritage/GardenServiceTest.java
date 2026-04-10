package ca.qc.cegepheritage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GardenServiceTest {
    @Test
    public void testCalculateAverageDailyGrowthReturnsTheCorrectDailyGrowth() {
        Garden garden = new Garden(2);
        Herb herb = new Herb("Herb",2,12);
        Herb herb2 = new Herb("Herb",2,2);
        garden.addPlant(herb);
        garden.addPlant(herb2);
        assertEquals((herb.getDailyGrowth() + herb2.getDailyGrowth()) /2,GardenService.calculateAverageDailyGrowth(garden));
    }
    @Test
    public void testCalculateAverageDailyGrowthWithNullGardenReturns0() {
        Garden garden = null;
        assertEquals(0,GardenService.calculateAverageDailyGrowth(garden));
    }
    @Test
    public void testCalculateAverageDailyGrowthWithPlantArrayReturnsTheCorrectDailyGrowth() {
        Herb herb = new Herb("Herb",2,12);
        Herb herb2 = new Herb("Herb",2,2);
        Plant[] plants = {herb, herb2};
        assertEquals((herb.getDailyGrowth() + herb2.getDailyGrowth()) /2, GardenService.calculateAverageDailyGrowth(plants));
    }
    @Test
    public void testCalculateAverageDailyGrowthWithNullPlantArrayGardenReturns0() {
        Plant[] plants = null;
        assertEquals(0,GardenService.calculateAverageDailyGrowth(plants));
    }
    @Test
    public void testApplyMagicAndRecalculateGrowthReturnsCorrectGrowth() {
        Garden garden = new Garden(2);
        Herb herb = new Herb("Herb",2,12);
        Herb herb2 = new Herb("Herb",2,2);
        Herb herb3 = new Herb("Herb",2,12);
        Herb herb4 = new Herb("Herb",2,2);
        garden.addPlant(herb);
        garden.addPlant(herb2);
        double actualDailyGrowth = GardenService.applyMagicAndRecalculateGrowth(garden);
        herb3.applyMagicBoost();
        herb4.applyMagicBoost();
        double expectedDailyGrowth =(herb3.getDailyGrowth() + herb4.getDailyGrowth());
        assertEquals(expectedDailyGrowth,actualDailyGrowth);
    }
    @Test
    public void testApplyMagicAndRecalculateGrowthWithPlantArrayReturnsCorrectGrowth() {
        Herb herb = new Herb("Herb",2,12);
        Herb herb2 = new Herb("Herb",2,2);
        Herb herb3 = new Herb("Herb",2,12);
        Herb herb4 = new Herb("Herb",2,2);
        Plant[] plants = {herb,herb2};
        double actualDailyGrowth = GardenService.applyMagicAndRecalculateGrowth(plants);
        herb3.applyMagicBoost();
        herb4.applyMagicBoost();
        double expectedDailyGrowth =(herb3.getDailyGrowth() + herb4.getDailyGrowth());
        assertEquals(expectedDailyGrowth,actualDailyGrowth);
    }
    @Test
    public void testApplyMagicAndRecalculateGrowthWithNullPlantArrayReturns0() {
        Plant[] plants = null;
        assertEquals(0,GardenService.applyMagicAndRecalculateGrowth(plants));
    }
    @Test
    public void testApplyMagicAndRecalculateGrowthWithNullGardenReturns0() {
        Garden garden = null;
        assertEquals(0,GardenService.applyMagicAndRecalculateGrowth(garden));
    }
}
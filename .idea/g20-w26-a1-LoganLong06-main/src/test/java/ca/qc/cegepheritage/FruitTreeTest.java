package ca.qc.cegepheritage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitTreeTest {
    @Test
    public void testConstructorSetsAllAttributesCorrectly() {
        FruitTree tree = new FruitTree("tree",2,2,2,2.0);
        assertEquals("tree",tree.getPlantName());
        assertEquals(2,tree.getDaysInGarden());
        assertEquals(2,tree.getAge());
        assertEquals(2,tree.getNumberOfFruit());
        assertEquals(2,tree.getMagicFertilizerLevel());
    }
    @Test
    public void testGetInfoReturnsTheCorrectString() {
        FruitTree tree = new FruitTree("tree",2,2,2,2.0);
        assertEquals("tree has been in the garden for 2 days and is 2 years old, it has 2 fruits and a magic fertilizer level of 2.0.",tree.getInfo());
    }
    @Test
    public void testGetDailyGrowthReturnsCorrectDailyGrowth() {
        FruitTree tree = new FruitTree("tree",2,2,2,2.0);
        assertEquals((2 * 0.2) + (2 * 0.05) + (2.0 * 0.5),tree.getDailyGrowth());
    }
    @Test
    public void testApplyMagicBoostDoublesTheNumberOfFruitAndReturnsTheCorrect() {
        FruitTree tree = new FruitTree("tree",2,2,2,2.0);
        assertEquals("The fruit on this tree has been doubled!",tree.applyMagicBoost());
        assertEquals(4,tree.getNumberOfFruit());
    }

}
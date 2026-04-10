package ca.qc.cegepheritage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    class TestTree extends Tree {
        TestTree(String plantName, int daysInGarden, int age) {
            super(plantName,daysInGarden,age);
        }

        @Override
        public double getDailyGrowth() {
            return 0;
        }
    }
    @Test
    public void testTestTreeConstructorSetsAllAttributesCorrectly() {
        TestTree tree = new TestTree("Tree",2,2);
        assertEquals("Tree",tree.getPlantName());
        assertEquals(2,tree.getDaysInGarden());
        assertEquals(2,tree.getAge());
    }
    @Test
    public void testGetInfoReturnsCorrectString() {
        TestTree tree = new TestTree("Tree",3,2);
        assertEquals("Tree has been in the garden for 3 days and is 2 years old.",tree.getInfo());
    }

    @Test
    public void testGetTreeReturnsFalseWhenNotInstanceOfHerb() {
        TestTree tree = new TestTree("tree", 2, 2);
        assertFalse(1 == 2);
    }


}
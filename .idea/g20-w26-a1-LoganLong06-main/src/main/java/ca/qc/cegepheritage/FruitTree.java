package ca.qc.cegepheritage;

public class FruitTree extends Tree {
    private int numberOfFruit;
    private double magicFertilizerLevel;

    public FruitTree(String plantName, int daysInGarden,int age, int numberOfFruit, double magicFertilizerLevel) {
        super(plantName, daysInGarden, age);
        this.numberOfFruit = numberOfFruit;
        this.magicFertilizerLevel = magicFertilizerLevel;
    }

    @Override
    public double getDailyGrowth() {
        return (this.getAge() * 0.2) + (this.numberOfFruit * 0.05) + (this.magicFertilizerLevel * 0.5);
    }

    @Override
    public String applyMagicBoost() {
        this.numberOfFruit = this.numberOfFruit * 2;
        return "The fruit on this tree has been doubled!";
    }

    public int getNumberOfFruit() {
        return this.numberOfFruit;
    }
    public double getMagicFertilizerLevel() {
        return this.magicFertilizerLevel;
    }

    @Override
    public String getInfo() {
        return getPlantName() + " has been in the garden for " + getDaysInGarden() + " days and is " + getAge() + " years old, it has " + numberOfFruit + " fruits and a magic fertilizer level of " + magicFertilizerLevel + ".";
    }
}

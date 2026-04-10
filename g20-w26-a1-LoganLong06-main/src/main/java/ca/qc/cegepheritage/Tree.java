package ca.qc.cegepheritage;

public abstract class Tree extends Plant {
    private int age;

    public Tree(String plantName, int daysInGarden, int age ) {
        super(plantName, daysInGarden);
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String getInfo() {
        return getPlantName() + " has been in the garden for " + getDaysInGarden() + " days and is " + getAge() + " years old.";
    }
}

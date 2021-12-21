package projectsHandsOn.AdvancedOOP.animals.bikes;

public abstract class Bike {
    private int wheels;
    private int pedals = 2;
    private int wheelSize;
    private int sumOfSizes;

    public int getSumOfSizes() {
        return sumOfSizes;
    }

    public void setSumOfSizes(int sumOfSizes) {
        this.sumOfSizes += sumOfSizes;
    }

    public int getWheels() {
        return wheels;
    }

    public Bike(int wheels, int wheelSize) {
        this.wheels = wheels;
        this.wheelSize = wheelSize;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    abstract public void repairBike();
    abstract public void useBike();
    abstract public void assembleBike();

    public void buyBike(){
        System.out.println("buying bike");
    }

}

package projectsHandsOn.AdvancedOOP.animals.bikes;

public abstract class Bike{
    private int wheels;
    private int wheelSize;

    public Bike(int wheels, int wheelSize) {
        this.wheels = wheels;
        this.wheelSize = wheelSize;
    }

    public int getWheels() {
        return wheels;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    abstract public void repairBike();
    abstract public void useBike();
    abstract public void repairAnyBike();

    public void buyBike(){
        System.out.println("Buying a bike");
    }

}

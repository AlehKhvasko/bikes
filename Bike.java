package projectsHandsOn.AdvancedOOP.animals.bikes;

public abstract class Bike {
    private int wheels;
    private int pedals = 2;
    private int wheelSize;


    public Bike(int wheels, int wheelSize) {
        this.wheels = wheels;
        this.wheelSize = wheelSize;
    }


    abstract public void repairBike();
    abstract public void useBike();
    abstract public void assembleBike();

    public void buyBike(){
        System.out.println("buying bike");
    }

}

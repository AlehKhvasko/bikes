package projectsHandsOn.AdvancedOOP.animals.bikes;

public class TwoWheel extends Bike{

    public TwoWheel(int wheels, int wheelSize) {
        super(wheels, wheelSize);
    }

    @Override
    public void repairBike() {
        System.out.println("Repair two wheel bike");
    }

    @Override
    public void useBike() {
        System.out.println("Use two wheel bike");
    }

    @Override
    public void repairAnyBike() {
        System.out.println("Assemble two wheel bike");
    }
}

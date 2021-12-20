package projectsHandsOn.AdvancedOOP.animals.bikes;

public class TwoWheel extends Bike{

    public TwoWheel(int wheels, int wheelSize) {
        super(wheels, wheelSize);
    }

    @Override
    public void repairBike() {
        System.out.println("Repair one wheel bike");
    }

    @Override
    public void useBike() {
        System.out.println("Use one wheel bike");
    }

    @Override
    public void assembleBike() {
        System.out.println("Assemble one wheel bike");
    }
}

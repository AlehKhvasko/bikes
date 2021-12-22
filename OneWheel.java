package projectsHandsOn.AdvancedOOP.animals.bikes;

public class OneWheel extends Bike {

    public OneWheel(int wheels, int wheelSize) {
        super(wheels, wheelSize);
    }

    @Override
    public void repairBike() { System.out.println("Repair one wheel bike");}

    @Override
    public void useBike() { System.out.println("Use one wheel bike");}

    @Override
    public void repairAnyBike() { System.out.println("Assemble one wheel bike");}
}

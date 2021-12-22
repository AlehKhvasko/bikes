package projectsHandsOn.AdvancedOOP.animals.bikes;

public class ThreeWheel extends Bike {

    public ThreeWheel(int wheels, int wheelSize) {
        super(wheels, wheelSize);
    }

    @Override
    public void repairBike() { System.out.println("Repair three wheel bike");}

    @Override
    public void useBike() { System.out.println("Use three wheel bike");}

    @Override
    public void repairAnyBike() { System.out.println("Assemble three wheel bike");}
}

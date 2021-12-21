package projectsHandsOn.AdvancedOOP.animals.bikes;

public class ThreeWheel extends Bike {
    private int sumOfSizes = 0;

    public ThreeWheel(int wheels, int wheelSize,  String name) {
        super(wheels, wheelSize, name);
    }

    @Override
    public void repairBike() { System.out.println("Repair one wheel bike");}

    @Override
    public void useBike() { System.out.println("Use one wheel bike");}

    @Override
    public void assembleBike() { System.out.println("Assemble one wheel bike");}
}

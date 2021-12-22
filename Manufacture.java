package projectsHandsOn.AdvancedOOP.animals.bikes;

public class Manufacture {
    public static void repairBike(Bike anyBike){
        System.out.println(anyBike.getClass().getSimpleName()  + " bike repaired");
    }
}

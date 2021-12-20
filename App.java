package projectsHandsOn.AdvancedOOP.animals.bikes;

public class App {
    public static void main(String[] args) {
        Bike[] bikePark = new Bike[5];
        int[] wheelSize = {20, 24, 26};
        for (int i = 0; i < bikePark.length; i++) {
           int randomWheels = ((int) (Math.random() * 3 + 1));
           switch (randomWheels){
               //objects are not created
               case 1:
                   bikePark[i] = new OneWheel( randomWheels, wheelSize[1]);
               case 2:
                   bikePark[i] = new TwoWheel( randomWheels, wheelSize[1]);
               case 3:
                   bikePark[i] = new ThreeWheel( randomWheels, wheelSize[1]);
               default:
                   System.out.println("Something went wrong.");
           }
        }
    }
}
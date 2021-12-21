package projectsHandsOn.AdvancedOOP.animals.bikes;

public class App {
    public static void main(String[] args) {
        //fill up with random Objects
        Bike[] bikePark = fillUpArr();
        for (int i = 0; i < bikePark.length ; i++) {
            if (bikePark[i].getWheelSize() == 1){
                System.out.println("Assembling bike number " + ((i) + 1));
                bikePark[i].assembleBike();
            }
        }
        //sort by lowest size of the wheel
        sortByWheelSize(bikePark);
        //sort by sum of sizes
        //----
        //repair bikes
        Manufacture.repairBike(bikePark[1]);
    }

    public static Bike[] fillUpArr(){
        Bike[] bikePark = new Bike[5];
        int[] wheelSize = {20, 24, 26};
        for (int i = 0; i < bikePark.length; i++) {
            int randomWheels = ((int) (Math.random() * 3 + 1));
            switch (randomWheels){
                //objects are not created
                case 1:
                    bikePark[i] = new OneWheel( randomWheels, wheelSize[randomWheels - 1], "One Wheel");
                    break;
                case 2:
                    bikePark[i] = new TwoWheel( randomWheels, wheelSize[randomWheels - 1], "Two Wheel");
                    break;
                case 3:
                    bikePark[i] = new ThreeWheel( randomWheels, wheelSize[randomWheels - 1], "Three wheel");
                    break;
                default:
                    System.out.println("Something went wrong.");
            }
        }
        return bikePark;
    }

    public static Bike[] sortByWheelSize(Bike[] bikePark){
        for (Bike el:bikePark) {
            System.out.print(el.getWheelSize() + " ");

        }System.out.println();
        for (int i = 0; i < bikePark.length - 1; i++) {
            for (int j = i; j < bikePark.length; j++) {
                if (bikePark[i].getWheelSize() > bikePark[j].getWheelSize()){
                    Bike temp = bikePark[i];
                    bikePark[i] = bikePark[j];
                    bikePark[j] = temp;
                }
            }
        }
        for (Bike el:bikePark) {
            System.out.print(el.getWheelSize() + " ");
        }
        return bikePark;
    }

   public static Bike[] sortBySumOfWheelSizes(Bike[] bikePark){
        for (int i = 0; i < bikePark.length; i++) {
            for (int j = 0; j < bikePark.length; j++) {
                if (bikePark[i].getClass().isInstance(bikePark[j])) {
                   bikePark[i].setSumOfSizes(bikePark[j].getWheelSize());
                }
            }
        }

        return bikePark;
    }
}
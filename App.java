package projectsHandsOn.AdvancedOOP.animals.bikes;

public class App {
    public static void main(String[] args) {
        //fill up with random Objects
        Bike[] bikePark = fillUpArr();
        //fix one wheel bikes
        for (int i = 0; i < bikePark.length ; i++) {
            if (bikePark[i].getWheelSize() == 1){
                System.out.println("Repairing bike number " + ((i) + 1));
                bikePark[i].repairBike();
            }
        }
        //sort by lowest size of the wheel
        sortByWheelSize(bikePark);
        //sort by sum of sizes
        sumOfSizes(bikePark);
        //repair bikes
        Manufacture.repairBike(bikePark[1]);
    }

    public static Bike[] fillUpArr(){
        Bike[] bikePark = new Bike[5];
        int[] wheelSize = {20, 24, 26};
        for (int i = 0; i < bikePark.length; i++) {
            int randomWheels = ((int) (Math.random() * 3 + 1));
            switch (randomWheels){
                case 1:
                    bikePark[i] = new OneWheel( 1, wheelSize[randomWheels - 1]);
                    break;
                case 2:
                    bikePark[i] = new TwoWheel( 2, wheelSize[randomWheels - 1]);
                    break;
                case 3:
                    bikePark[i] = new ThreeWheel(3, wheelSize[randomWheels - 1]);
                    break;
                default:
                    System.out.println("Error");
            }
        }
        return bikePark;
    }

    public static Bike[] sortByWheelSize(Bike[] bikePark){
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
        }System.out.println();
        return bikePark;
    }

    public static Bike[] sumOfSizes(Bike[] bikePark){
        for (int i = 0; i < bikePark.length; i++) {
            for (int j = i; j < bikePark.length; j++) {
                if (compareSizes(bikePark[i], bikePark[j])){
                    Bike temp = bikePark[j];
                    bikePark[j] = bikePark[i];
                    bikePark[j] = temp;
                }
            }
        }
        for (Bike bike:bikePark) {
            System.out.print(bike.getClass().getSimpleName() + ">: ");
            System.out.print(bike.getWheelSize() * bike.getWheels() + " ");
        }
        System.out.println();
        return bikePark;
    }

    public static boolean compareSizes(Bike first, Bike second){
        return first.getWheels()*first.getWheelSize() > second.getWheels()*second.getWheelSize();
    }


}
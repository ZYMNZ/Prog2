//import java.util.Scanner;
//
//class Cube {
//     int length;
//     int width;
//     int depth;
//    int volume;
//     public int Volume() {
//         volume = length * width * depth;
//            return volume;
//     }
//     public Cube(){
//
//     }
//}
//
//class swimmingPool extends Cube {
//    int rateFill;
//    int rateDrain;
//    int water = 0;
//
//    public swimmingPool(){
//
//    }
//    Scanner sc1 = new Scanner(System.in);
//
//    public void addedWaterVolume() {
//        System.out.println("Enter the water (cubic meters) you want to add: ");
//        water += sc1.nextInt();
//
//        System.out.println("Water added.");
//    }
//    int minutes = 0;
//    public void addedWaterTime () {
//        System.out.println("Enter the minutes you want to add the water: ");
//        minutes = sc1.nextInt();
//        water += minutes * rateFill;
//        System.out.println("Water added.");
//    }
///// minutes 10 * rate draining 2 = 20 ; 20 / in water volume ; NUM 5
//    int remainingWater = 0;
//    public void waterNeeded(){
//       remainingWater = this.volume - this.water;
//        System.out.println("We need " + remainingWater + " cubic meters of water to fill the pool.");
//    }
//
//    public void minutesNeeded(){
//         int minutesNeeded = remainingWater / this.rateFill;
//        System.out.println("We need " + minutesNeeded + " minutes to fill the pool.");
//    }
//
//    int minutesD = 0;
//    public void waterDrained(){
//        System.out.println("Enter the minutes you want to drain the water: ");
//        minutesD = sc1.nextInt();
//        int minutesDrained = (this.minutesD * this.rateDrain) / this.remainingWater;
//
//    }
//
//    //public
//
//
//}
//
//public class Assignment2 {
//    public static void main(String[] args) {
//        swimmingPool sp = new swimmingPool();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the length of the pool: ");
//        sp.length = sc.nextInt();
//        while(sp.length <= 0) {
//            System.out.println("Invalid input. Please enter a positive number.");
//            sp.length = sc.nextInt();
//        }
//        System.out.print("Enter the width of the pool: ");
//        sp.width = sc.nextInt();
//        while(sp.width <= 0) {
//            System.out.println("Invalid input. Please enter a positive number.");
//            sp.width = sc.nextInt();
//        }
//        System.out.print("Enter the depth of the pool: ");
//        sp.depth = sc.nextInt();
//        while(sp.depth <= 0) {
//            System.out.println("Invalid input. Please enter a positive number.");
//            sp.depth = sc.nextInt();
//        }
//        System.out.print("Enter the rate of filling the pool per minute: ");
//        sp.rateFill = sc.nextInt();
//        while(sp.rateFill <= 0) {
//            System.out.println("Invalid rate, try again");
//            sp.rateFill = sc.nextInt();
//            if (sp.rateFill > 0) break;
//        }
//        System.out.print("Enter the rate of draining the pool per minute: ");
//        sp.rateDrain = sc.nextInt();
//        while(sp.rateDrain <= 0) {
//            System.out.println("Invalid rate, try again");
//            sp.rateDrain = sc.nextInt();
//            if (sp.rateDrain > 0) break;
//        }
//
//        boolean flag = true;
//        while(flag){
//            System.out.println("Menu: ");
//            System.out.println("1. Add water based on volume.");
//            System.out.println("2. Add water based on minutes.");
//            System.out.println("3. How much water is needed to fill the pool?");
//            System.out.println("4. How much minutes does it take to fill the pool?");
//            System.out.println("5. Want to drain the water? Enter the minutes:");
//            System.out.println("6. How many minutes to empty the pool?");
//            System.out.println("7. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = sc.nextInt();
//            switch (choice){
//                case 1:
//                    sp.addedWaterVolume();
//                    break;
//                case 2:
//                    sp.addedWaterTime();
//                    break;
//                case 3:
//                    sp.waterNeeded();
//                    break;
//                case 4:
//                    sp.minutesNeeded();
//                    break;
//                case 5:
//
//
//                    break;
//                case 6:
//                    System.out.println("Enter the minutes to empty the pool: ");
//
//                    break;
//                case 7:
//                    flag = false;
//                    break;
//                default:
//                    System.out.println("Invalid choice");
//            }
//        }
//
//    }
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

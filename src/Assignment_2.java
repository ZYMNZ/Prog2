import java.util.Scanner;

    class Cube {
        int length;
        int width;
        int depth;
        int volume;
        public int Volume() {
            volume = length * width * depth;
            return volume;
        }
        public Cube(){

        }
    }

    class swimmingPool extends Cube {
        int volume;
        int rateFill;
        int rateDrain;
        int water = 0;
        int minutesNeeded;
        int minutesDrained;
        int waterAdd;
        int waterDrain;

        public swimmingPool(){

        }



          //NUM2
        public int addedWaterTime (int minutes) {
            water += minutes * rateFill;
            return water;
        }
        //NUM3

        public int waterNeeded(){
            waterAdd = Volume() - this.water;
            return waterAdd;
        }
        //NUM4
        public int minutesNeeded(){
            minutesNeeded = waterAdd / this.rateFill;
            return minutesNeeded;
        }
        //NUM5

        public int waterDrained(int minutesD){
            water -= minutesD * this.rateDrain;
            return water;
        }
        //NUM6
        public int minutesDrained(){
             minutesDrained = water/this.rateDrain;
            return minutesDrained;
        }


    }

    public class Assignment_2 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Cube c = new Cube();
            swimmingPool sp = new swimmingPool();

            System.out.print("Enter the length of the pool: ");
            sp.length = sc.nextInt();
            while(sp.length <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                sp.length = sc.nextInt();
            }
            System.out.print("Enter the width of the pool: ");
            sp.width = sc.nextInt();
            while(sp.width <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                sp.width = sc.nextInt();
            }
            System.out.print("Enter the depth of the pool: ");
            sp.depth = sc.nextInt();
            while(sp.depth <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
                sp.depth = sc.nextInt();
            }
            System.out.print("Enter the rate of filling the pool per minute: ");
            sp.rateFill = sc.nextInt();
            while(sp.rateFill <= 0) {
                System.out.println("Invalid rate, try again");
                sp.rateFill = sc.nextInt();
                if (sp.rateFill > 0) break;
            }
            System.out.print("Enter the rate of draining the pool per minute: ");
            sp.rateDrain = sc.nextInt();
            while(sp.rateDrain <= 0) {
                System.out.println("Invalid rate, try again");
                sp.rateDrain = sc.nextInt();
                if (sp.rateDrain > 0) break;
            }



            boolean flag = true;
            while(flag){
                System.out.println("Menu: ");
                System.out.println("1. Add water based on volume.");
                System.out.println("2. Add water based on minutes.");
                System.out.println("3. How much water is needed to fill the pool?");
                System.out.println("4. How much minutes does it take to fill the pool?");
                System.out.println("5. Want to drain the water? Enter the minutes:");
                System.out.println("6. How many minutes to empty the pool?");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Enter the water (cubic meters) you want to add: ");
                        sp.water += sc.nextInt();
                        System.out.println("Water added.");
                        if(sp.water > sp.volume){
                        sp.water = sp.volume;
                         }
                        break;
                    case 2:
                        System.out.println("Enter the minutes you want to add the water: ");
                        sp.addedWaterTime(sc.nextInt());
                        System.out.println("Water added.");

                        break;
                    case 3:
                        System.out.println("We need " + sp.waterNeeded() + " cubic meters of water to fill the pool.");

                        break;
                    case 4:
                        System.out.println("We need " + sp.minutesNeeded() + " minutes to fill the pool.");

                        break;
                    case 5:
                        System.out.println("Enter the minutes you want to drain the water: ");
                        sp.waterDrained(sc.nextInt());
                        System.out.println("Water drained. Existing water is " + sp.water + " cubic meters.");
                        break;
                    case 6:
                        System.out.println("We need " + sp.minutesDrained() + " minutes to drain the pool.");

                        break;
                    case 7:
                        System.out.println("Thank you for using our program. Goodbye!");
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }

        }

    }


















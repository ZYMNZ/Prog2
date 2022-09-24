import java.util.Scanner;

class Cube {
     int length;
     int width;
     int depth;

     public int Volume() {
         return length * width * depth;
     }

}

class swimmingPool extends Cube {
    int rateFill;
    int rateDrain;



//    public int amountofWaterneeded() {
//        return Volume() * 1000;
//    }

    public swimmingPool(){

    }

    public swimmingPool(int g){}

    public int timeToFill() {
        return Volume() / rateFill;
    }

    public int timeToDrain() {
        return Volume() / rateDrain;
    }



}

public class Assignment2 {
    public static void main(String[] args) {
        swimmingPool sp = new swimmingPool();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the pool: ");
        sp.length = sc.nextInt();
        System.out.print("Enter the width of the pool: ");
        sp.width = sc.nextInt();
        System.out.print("Enter the depth of the pool: ");
        sp.depth = sc.nextInt();
        System.out.print("Enter the rate of filling the pool per minute: ");
        sp.rateFill = sc.nextInt();
        System.out.print("Enter the rate of draining the pool per minute: ");
        sp.rateDrain = sc.nextInt();

        boolean flag = true;
        while(flag){
            System.out.println("1. Menu");
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
                    System.out.println("Volume of the pool is: " + sp.Volume());
                    break;
                case 2:
                    System.out.println("Time to fill the pool is: " + sp.timeToFill());
                    break;
                case 3:
                    System.out.println("Time to drain the pool is: " + sp.timeToDrain());
                    break;
                case 4:
                    System.out.println("Amount of water needed to fill the pool is: " + sp.Volume() * 1000);
                    break;
                case 5:
                    System.out.println("Enter the minutes to drain the pool: ");
                    int minutes = sc.nextInt();
                    System.out.println("Amount of water drained is: " + (sp.Volume() * 1000) / minutes);
                    break;
                case 6:
                    System.out.println("Enter the minutes to empty the pool: ");
                    int minutes2 = sc.nextInt();
                    System.out.println("Amount of water drained is: " + (sp.Volume() * 1000) / minutes2);
                    break;
                case 7:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }

}
















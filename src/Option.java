import java.util.Scanner;

public class Option {


    public int Option(int factorial) {
        int fact = 1;
        for (int i = 1; i <= factorial; i++) {
            fact *= i;
        }
        return fact;
    }
    public int Option(int base, int power) {
        int pow = 1;
        for (int i = 1; i <= power; i++) {
            pow *= base;
        }
        return pow;
    }
    public int Option(int sun1, int sum2, int sum3) {
        int sum = sun1 + sum2 + sum3;
       return sum;

    }

    public static void main(String[] args) {
        Option obj = new Option();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int count = 0;
        System.out.println("Do you want to enter a num? (1/0)");
        int choice = sc.nextInt();
        int arr[] = new int[3];
        while(flag){

            if(choice == 0){
                flag = false;
            }
            else {
                System.out.println("Enter a num: ");
                int option = sc.nextInt();
                //////////////
                count++;
            }
        }
        switch (count) {
            case 1:
                if(count == 1){
                    System.out.println("Factorial: " + obj.Option(arr[0]));
                }
                break;
            case 2:
                if(count == 2){
                    System.out.println("Power: " + obj.Option(arr[0], arr[1]));
                }
//                System.out.println("Enter a number: ");
//                int base = sc.nextInt();
//                System.out.println("Enter a power: ");
//                int power = sc.nextInt();
//                System.out.println("The power of " + base + " is: " + obj.Option(base, power));
                break;
            case 3:
                if(count == 3){
                    System.out.println("Sum: " + obj.Option(arr[0], arr[1], arr[2]));
                }
//                System.out.println("Enter a number: ");
//                int sun1 = sc.nextInt();
//                System.out.println("Enter a number: ");
//                int sum2 = sc.nextInt();
//                System.out.println("Enter a number: ");
//                int sum3 = sc.nextInt();
//                System.out.println("The sum of " + sun1 + " and " + sum2 + " and " + sum3 + " is: " + obj.Option(sun1, sum2, sum3));
                break;
            default:
                System.out.println("Invalid option");
        }

    }

}

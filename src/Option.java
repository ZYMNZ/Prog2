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


        int arr[] = new int[3];
        while(count<3 && flag){
            System.out.println("Do you want to enter a num? (1/0)");
            int choice = sc.nextInt();
            if(choice == 0){
                flag = false;
            }
            else {
                System.out.println("Enter a num: ");
                arr[count++] = sc.nextInt();

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
                    System.out.println("Power is: " + obj.Option(arr[0], arr[1]));
                }
                break;
            case 3:
                if(count == 3){
                    System.out.println("Sum: " + obj.Option(arr[0], arr[1], arr[2]));
                }

                break;
            default:
                System.out.println("Invalid option");
        }




    }

}

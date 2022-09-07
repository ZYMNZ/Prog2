import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //number 1
        int i;
        int arr[] = new int[10];
        for ( i = 0; i < arr.length; i++) {
            System.out.println("please enter a number: ");
            arr[i] = sc.nextInt();
        }

        int flag = 0;
        int sum = 0;
        for ( i = 0; i < arr.length; i++) {
            flag = 0;
            if(arr[i] % 2 !=0){
                flag = 1;
                break;
            }
            sum+=arr[i];
            if (sum == arr[i]) System.out.println("Perfect num: " + arr[i]);
        }
        if(flag ==0) System.out.println("Not a prime number: ");
        else System.out.println("prime number" + arr[i]);

        for (int j = 0; j < arr.length; j++) {

        }





















    }

}

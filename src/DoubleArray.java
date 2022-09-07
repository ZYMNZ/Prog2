import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {

//        int arr[][] = new int[3][3];
//        int n = 10;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr[i][j]= n++;
//            }
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j] + " , ");
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[2][5];
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j]= sc.nextInt();
                sum+= arr[i][j];
                System.out.println(sum);
            }
            sum = 0;
        }
        System.out.println(sum);

    }
}

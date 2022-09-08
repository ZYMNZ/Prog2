import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //NUMBER 1

//        int arr[] = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter a num: ");
//            arr[i] = sc.nextInt();
//        }
//        int i =0;
//        for(int j= 0; j<arr.length; j++) {
//            for (i = 0; i < 9; i++) {
//                if (arr[i] > 0) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//
//        for(i=0;i<arr.length;i++) System.out.print(arr[i] + ",");

        //NUMBER 2
        System.out.println("How many numbers do you want to enter? (array size)  ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i+1) + " number: ");
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("- Cycle " + (i+1) + ": ");
            for (int j = 0; j <= arr.length; j++) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        }
        for(int i=0;i<arr.length;i++) System.out.print(arr[i] + ",");


        //NUMBER 3
//        int arr[][] = new int[3][5];
//        int sum = 0;
//        int i,j;
//        System.out.println("Enter your numbers: ");
//        for ( i = 0; i < 3 ; i++) {
//            for (j = 0; j < 5 ; j++) {
//                arr[i][j] = sc.nextInt();
//
//            }
//        }
//        for(i=0;i<3;i++) {
//            sum = 0;
//            for(j=0;j<5;j++){
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("-------------------");



    }
}

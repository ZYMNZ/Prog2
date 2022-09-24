import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {


//        int num[] = new int[10];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < num.length; i++) {
//            System.out.println("num plz: ");
//           num[i] = sc.nextInt();
//
//        }
//        System.out.println(num);
        ////---------------------------------////

//        int[] arr = new int[10];
//        Scanner sc = new Scanner(System.in);
//        int i, temp;
//        System.out.println("Please enter 10 nums: ");
//        for ( i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for(int p=0; p<10; p++) {
//            for (int j = 0; j < 9; j++) {
//                if (arr[i] > arr[i + 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }

////----------------------------------------/////

//        int[] arr = new int[10];
//        Scanner sc = new Scanner(System.in);
//        int i;
//        for ( i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int flag = 0;
//        for (int j = 0; j < 9; j++) {
//            flag=0;
//            for (int k = 2; k < arr[j]; k++) {
//                if(arr[k] % arr[j]==0){
//                    flag = 1;
//                    break;
//                }
//                if (flag == 0)
//                System.out.println(arr[k] + " is prime.");
//            else
//                System.out.println(arr[k] + " is not a prime");
//            }
//        }
//
        ///-------------------------------///

//

//        int [] arr= new int[10];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Plz enter 10 nums: ");
//        int i,avg =0,sum = 0;
//
//        for ( i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//            sum+=arr[i];
//            avg =sum/ arr.length;
//            System.out.println(arr[i]);
//        }
//        System.out.println(sum + avg);

        ///-----------------------------------------///


//        Scanner sc = new Scanner(System.in);
//        System.out.println("plz enter ur 10 number ya 3amo");
//        int arr[] = new int[10];
//
//        int min = sc.nextInt();
//        int max = min;
//        for (int j = 1; j < arr.length; j++) {
//            arr[j] = sc.nextInt();
//            if (arr[j] < min) arr[j] = min;
//            if (arr[j] > max) arr[j] = max;
//        }
//        System.out.println(max + "\n" + min);
        //WHY DOESNT WORK?


//----------------------------------------------------//


//        Scanner sc = new Scanner(System.in);
//        System.out.println("plz enter numbers: ");
//        int arr[][] = new int[sc.nextInt()][sc.nextInt()];
//        int flagUP=0;
//        int flagDOWN=0;
//        int flagRIGHT=0;
//        int flagLEFT=0;
//
//
//        for (int j = 1; j < arr.length; j++) {
//            arr[][] = sc.nextInt();
//            System.out.println(arr[][]);
//        }
        //-------------------------------------------//

//        Scanner sc = new Scanner(System.in);
//
//
//        int arr[] = new int[10];
//        int flag = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("plz enter numbers: ");
//            arr[i]= sc.nextInt();
//        }
//        System.out.println("ENTER ANOTHER NUM: ");
//        int num = sc.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//           if (num == arr[i]){
//               flag=1;
//               System.out.println(num);
//               break;
//           }
//
//            else {
//                System.out.println("Didnt find your num!!");
//            }
        //       }

        //--------------------------------------------------------//

        Scanner sc = new Scanner(System.in);
//
//        int arr[] = new int[10];
//        int temp;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("plz enter numbers: ");
//            arr[i]= sc.nextInt();
//        }
//        int i;
//        for (i = 0; i < arr.length; i++) {
//            temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//            i++;
//        }
//        System.out.println(arr[i]);

        //....................................................//

//        System.out.println("enter the size of ur array: ");
//        int num = sc.nextInt();
//        int arr[] = new int[num];
//        int flag = 0 ;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("enter ur num: ");
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("enter the num u need to find");
//        int numTofind = sc.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            flag = 0;
//            if(numTofind == arr[i]){
//                flag = 1;
//                break;
//            }
//        }
//        if(flag == 0) System.out.println("not found");
//        else System.out.println("found it: " + numTofind);

//        //WEIRD
//        int arr[] = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("enter ur num: ");
//            arr[i] = sc.nextInt();
//        }
//        int temp;
//        for (int i = 0; i < arr.length; i=+2) {
//            temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//        for(int i=0;i<arr.length;i++) System.out.print(arr[i] + ",");

        //.............................................................//

//         int arr[][] = new int[3][4];
//         int sum = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.println("Enter a num: ");
//               arr[i][j] = sc.nextInt();
//               sum += arr[i][j];
//            }
//        }
//        System.out.println("The sum: " + sum);

        //-------------------------------------//


//            int arr[][] = new int[3][4];
//            int sum = 0;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.println("Enter a num: ");
//                arr[i][j] = sc.nextInt();
//                sum+= arr[i][j];
//            }
//            System.out.println("The sum by row: " + sum);
//        }

//-------------------------------------//


//            int arr[][] = new int[3][4];
//            int sum = 0;
//            int i,j;
//        for ( i = 0; i < 4; i++) {
//            sum = 0;
//            for ( j = 0; j < 3; j++) {
//                System.out.println("Enter a num: ");
//                arr[j][i] = sc.nextInt();
//                sum+= arr[j][i];
//
//            }
//            System.out.println("The sum by colomn: " + sum);
//        }
//        for(i=0;i<3;i++) {
//            for(j=0;j<4;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        //-------------------------------------//
//
//        int arr[][] = new int[3][4];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.println("Enter a num: ");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        int i = 0,j = 0;
//        System.out.println( "Enter the num u need to find: ");
//        int num = sc.nextInt();
//        int flag = 0;
//        for ( i = 0; i < 3; i++) {
//            for (j = 0; j < 4; j++) {
//                if(num == arr[i][j]){
//                    flag ++;
//                    break;
//                }
//            }
//        }
//        if(flag == 0) System.out.println("not found");
//        else System.out.println("Occurence " + flag + " found it: " + num + " in row " + (i+1) +" in colomn " + (j+1));


        //-------------------------------------//

//        int arr[][] = new int[4][4];
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.println("Enter a num: ");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length - 1; j++) {
//                if (arr[i][j] < arr[i][j]) {
//                    int temp = arr[i][j];
//                    arr[i][j] = arr[i][j];
//                    arr[i][j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }





    }

}

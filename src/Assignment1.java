import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //NUMBER 1
//
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
//        System.out.println("How many numbers do you want to enter? (array size)  ");
//        int num = sc.nextInt();
//        int arr[] = new int[num];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Enter the " + (i+1) + " number: ");
//            arr[i] = sc.nextInt();
//        }
//        int temp = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print("- Cycle " + (i+1) + ": ");
//            for (int j = 1; j < arr.length; j++) {
//                if(i==0)break;
//                else {
//                    temp = arr[arr.length - j];
//                    arr[arr.length - j] = arr[(arr.length - j) - 1];
//                    arr[(arr.length - j) - 1] = temp;
//
//                }
//            }
//            for(int k=0;k<arr.length;k++) {
//                System.out.print(arr[k] + ",");
//
//            }
//            System.out.println();
//        }



        //NUMBER 3

//        int arr[][] = new int[3][5];
//        int sum=0,i,j;
//        System.out.println("Enter your numbers: ");
//        for (i=0;i<3;i++){
//            sum = 0;
//            for (j=0;j<5;j++){
//                arr[i][j] = sc.nextInt();
//                sum += arr[i][j];
//            }
//        }
//        for (i=0;i<3;i++){
//            for (j=0;j<5;j++){
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("-------------------------------------");
//        int sumarr[] = new int [5];
//        for (i=0;i<5;i++) {
//            sum = 0;
//            for (j=0;j<3;j++) {
//                sum += arr[j][i];
//            }
//            sumarr[i]=sum;
//            System.out.print(sum + "\t");
//        }
//        System.out.println("");
//        int min=sumarr[0];
//        int max=min;
//        int temp;
//        for (int k=1;k<5;k++){
//            if(sumarr[k]<min)min=sumarr[k];
//            if(sumarr[k]>max)max=sumarr[k];
//        }
//        for(i=0;i<4;i++){
//            for (j=0;j<4;j++){
//                if(sumarr[j]==min){
//                    for (int c1=0;c1<3;c1++) {
//                        temp=arr[c1][j];
//                        arr[c1][j]=arr[c1][j+1];
//                        arr[c1][j+1]=temp;
//                    }
//                    temp=sumarr[j];
//                    sumarr[j]=sumarr[j+1];
//                    sumarr[j+1]=temp;
//                }
//            }
//        }
//        for(i=4;i>0;i--){
//            for (j=4;j>0;j--){
//                if(sumarr[j]==max){
//                    for (int c1=2;c1>-1;c1--) {
//                        temp=arr[c1][j];
//                        arr[c1][j]=arr[c1][j-1];
//                        arr[c1][j-1]=temp;
//                    }
//                    temp=sumarr[j];
//                    sumarr[j]=sumarr[j-1];
//                    sumarr[j-1]=temp;
//                }
//            }
//        }
//        for (i=0;i<3;i++){
//            System.out.println("");
//            for (j=0;j<5;j++){
//                System.out.print(arr[i][j] + "\t");
//            }
//        }
//        System.out.println();
//        System.out.println("-------------------------------------");
//        for (i = 0; i < 5; i++) {
//            sum = 0;
//            for (j = 0; j < 3; j++) {
//                sum += arr[j][i];
//            }
//            sumarr[i]=sum;
//            System.out.print(sum + "\t");
//        }

    }
}


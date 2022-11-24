import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter 1st num");
//        int num1 = sc.nextInt();
//        System.out.println("enter 2nd num");
//        int num2 = sc.nextInt();
//        System.out.println(recursive(num1, num2));
//    }
//    public static int recursive(int num1, int num2){
//        if (num2 == 0){
//            return 1;
//        }
//        else {
//            return num1 * recursive(num1, num2-1);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();
        System.out.println(recursive2(num));
    }


    public static int recursive2 (int num){
        if (num == 0){
            return 0;
        }
        return num + recursive2(num -1 );

    }

}











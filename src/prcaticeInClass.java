//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class prcaticeInClass {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//
//        Scanner input = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter a string (write quit to exit): ");
//            String str = input.nextLine();
//            if (str.equals("quit")) {
//                break;
//            }
//            list.add(str);
//        }
//
//
//
//        //check if the list is a palindrome
//        boolean isPalindrome = true;
//        for (int i = 0; i < list.size() / 2; i++) {
//            if (!list.get(i).equalsIgnoreCase(list.get(list.size() - 1 - i))) {
//                isPalindrome = false;
//                break;
//            }
//        }
//        System.out.println("The list is a palindrome: " + isPalindrome);
//    }
//}

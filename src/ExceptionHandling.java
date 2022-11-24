//import java.util.*;
//
//public class ExceptionHandling {
//    int roll, age, course;
//    String name;
//
//    public ExceptionHandling(int roll, int age, int course, String name){
//        this.age = age;
//        this.roll = roll;
//        this.course = course;
//        this.name = name;
//    }
//
//
////    int a = 0;
////    int b = 0;
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        ExceptionHandling eh = new ExceptionHandling(0, 0, 0, null);
//
//
//
////        Exception e = new Exception();
////        boolean f = true;
////        while(f){
////            try {
////                System.out.println("Write 'exit' to end");
////                System.out.println("enter ur 1st num");
////                e.a = sc.nextInt();
////                System.out.println("enter ur 2nd num");
////                e.b = sc.nextInt();
////                System.out.println("the devision of the 2 nums: ");
////                double div = (e.a % e.b);
////                System.out.println(div);
////                if(sc.next().equalsIgnoreCase("exit")){
////                    f = false;
////                }
////            }catch (ArithmeticException a){
////                System.out.println("you cant devied by a 0 ");
////            }
////
////        }
//
//
//
////        String[] str = new String[10];
////
////        System.out.println("Enter 10 names");
////        try {
////            for (int i = 0; i < str.length; i++) {
////                System.out.println("enter ur " + i + 1 + " word:");
////                str[i] = sc.next();
////                str[i] = Integer.parseInt(str[i]);
////                System.out.println();
////            }
////        }catch(NumberFormatException e){
////            System.out.println("");
////        }
//
//        String [] str = new String[10];
//        int sum = 0;
//        System.out.println("Enter 10 strings");
//
//            for (int i = 0; i < str.length; i++) {
//                System.out.println("enter ur " + (i+1) + " string");
//                try{
//                    if (sc.hasNextInt()) {
//                        str[i] = sc.next();
//                        str[i] = Integer.parseInt(str[i]);
//                        sum += Integer.parseInt(str[i]);
//                    }
//                        else{
//                            throw new Exception(" Number not accepted, why above 100 u bloody basterd!! ");
//
//
//                    }
//
//
//                      }catch(Exception ee){
//                    System.out.println(ee);
//                }
//
//            }
//        for (int i = 0; i < str.length; i++) {
//            try{
//                System.out.println(Integer.parseInt(str[i]));
//            }catch (NumberFormatException e){
//                System.out.println("Number invalide");
//            }
//        }
//
//
//
//
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

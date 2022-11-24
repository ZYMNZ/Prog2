//import java.util.Scanner;
//
//class Calculate{
//    //area and perimeter methods for different shapes like rectangle, square, circle
//
//    //area and parameter of rectangle
//    public void area(int length, int width){
//        System.out.println("Area of rectangle is: "+(length*width));
//        System.out.println("Perimeter of rectangle is: "+(2*(length+width)));
//    }
//
//    //area and parameter of square
//    public void area(int side){
//        System.out.println("Area of square is: "+(side*side));
//        System.out.println("Perimeter of square is: "+(4*side));
//    }
//
//    //area and parameter of circle
//    public void area(double radius){
//        System.out.println("Area of circle is: "+(3.14*radius*radius));
//        System.out.println("Perimeter of circle is: "+(2*3.14*radius));
//    }
//
//
//}
//
//public class PracticeOverLoading {
//    public static void main(String[] args) {
//
//        boolean flag = true;
//        Calculate cal = new Calculate();
//        while(flag){
//            System.out.println("1. Area and perimeter of rectangle");
//            System.out.println("2. Area and perimeter of square");
//            System.out.println("3. Area and perimeter of circle");
//            System.out.println("4. Exit");
//            System.out.println("Enter your choice: ");
//            Scanner sc = new Scanner(System.in);
//            int choice = sc.nextInt();
//            switch(choice){
//                case 1:
//                    System.out.println("Enter length and width of rectangle: ");
//                    int length = sc.nextInt();
//                    int width = sc.nextInt();
//                    cal.area(length, width);
//                    break;
//                case 2:
//                    System.out.println("Enter side of square: ");
//                    int side = sc.nextInt();
//                    cal.area(side);
//                    break;
//                case 3:
//                    System.out.println("Enter radius of circle: ");
//                    double radius = sc.nextDouble();
//                    cal.area(radius);
//                    break;
//                case 4:
//                    flag = false;
//                    break;
//                default:
//                    System.out.println("Invalid choice");
//            }
//        }
//
//    }
//}

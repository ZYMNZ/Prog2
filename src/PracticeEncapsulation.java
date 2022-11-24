//import java.util.Scanner;
//
////class Store{
////    public final double SALES_TAX_RATE = 0.06;
////    String name;
////    public Store(String name){
////        this.name = name;
////    }
////    public String toString(){
////        return "Store name: " + name;
////    }
////}
//
////class fastFood extends Store{
////    int numCustomer;
////    int avgPricePerCustomer;
////    public fastFood(String name, int numCustomer, int avgPricePerCustomer){
////        super(name);
////        this.numCustomer = numCustomer;
////        this.avgPricePerCustomer = avgPricePerCustomer;
////    }
////
////    //returns average sales per year
////    public double avgSales(){
////        return numCustomer * avgPricePerCustomer;
////    }
////
////}
//
////class groceryStore{
////    double annualRevenue;
////    String independentOrChain;
////
////    public groceryStore (double annualRevenue, String independentOrChain){
////        this.annualRevenue = annualRevenue;
////        this.independentOrChain = independentOrChain;
////    }
////    public String toString(){
////        return "Annual Revenue: " + annualRevenue + " Independent or Chain: " + independentOrChain;
////    }
////}
//
//class University{
//    String name;
//    int establishedYear;
//    int NumOfPrograms;
//
//    public University(String name, int establishedYear, int NumOfPrograms){
//        this.name = name;
//        this.establishedYear = establishedYear;
//        this.NumOfPrograms = NumOfPrograms;
//    }
//    public String toString(){
//        return "Name: " + name + " Established Year: " + establishedYear + " Number of Programs: " + NumOfPrograms;
//    }
//}
//class College extends University{
//    String collegeName = "";
//    int CestablishedYear;
//    int NumOfPrograms;
//    int numOfStudents;
//    int yearlyTurnover;
//
//    public College(String name, int establishedYear, int NumOfPrograms, String collegeName, int CestablishedYear, int numOfStudents, int yearlyTurnover){
//        super(name, establishedYear, NumOfPrograms);
//        this.collegeName = collegeName;
//        this.CestablishedYear = CestablishedYear;
//        this.numOfStudents = numOfStudents;
//        this.yearlyTurnover = yearlyTurnover;
//    }
//    public String toString(){
//        return super.toString() + " College Name: " + collegeName + " College Established Year: " + CestablishedYear + " Number of Students: " + numOfStudents + " Yearly Turnover: " + yearlyTurnover;
//    }
//
//}
////finding who has more turnover
//
//
//
//
//public class PracticeEncapsulation {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        College c = new College("Amogus", 2021, 10,"Vanier" , 1000, 1000, 1000);
//        System.out.println("Enter the name of the university: ");
//        c.name = sc.nextLine();
//        System.out.println("Enter the year the university was established: ");
//        c.establishedYear = sc.nextInt();
//
//
//    }
//}

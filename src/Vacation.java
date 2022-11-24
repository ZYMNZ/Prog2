//import java.util.*;
//abstract class vacation{
//    int budget;
//    int destination;
//
//    public vacation(int budget, int destination){
//        this.budget = budget;
//        this.destination = destination;
//    }
//
//    abstract int vacationOver(double budget);
//
//}
//
//class all_inclusive extends vacation{
//    String brand;
//    int rating;
//    double price;
//
//    public all_inclusive(int budget, int destination, String brand, int rating, double price){
//        super(budget, destination);
//        this.brand = brand;
//        this.rating = rating;
//        this.price = price;
//    }
//
//    @Override
//    int vacationOver(double budget) {
//        return super.budget - (int)price;
//    }
//}
//
//class piecemeal extends vacation{
//    String[] items;
//    double[] costs;
//
//    public piecemeal(int budget, int destination, String[] items, double[] costs){
//        super(budget, destination);
//        this.items = items;
//        this.costs = costs;
//    }
//
//    @Override
//    int vacationOver() {
//        return 0;
//    }
//}
//
//public class Vacation {
//    public static void main(String[] args) {
//        all_inclusive a = new all_inclusive(1000, 3, "ClubMed", 4, 860.52);
//        piecemeal p = new piecemeal(1000, 3, new String[]{"Hotel", "meal", "pool"}, new double[]{300, 50, 20});
//
//
//
//
//    }
//}

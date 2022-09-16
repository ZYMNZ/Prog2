import java.util.Scanner;

public class Store1{
    public final double SALES_TAX_RATE = 0.06;
    public String name;
    public Store1(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Store name: " + name;
    }
}
class BikeStore extends Store1{
    int numBikes;
    boolean sponsor;
    public BikeStore(String name, int numBikes, boolean sponsor){
        super(name);
    }
    public String toString(){
        return super.toString() + " Bike Store";
    }
}
class GroceryStore extends Store1{
    int annualRevenue;
    String chainORind;
    public GroceryStore(String name, int numGroceries, boolean sponsor){
        super(name);
    }
    public String toString(){
        return super.toString() + " Grocery Store";
    }
}

class client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BikeStore bs = new BikeStore("Amogus", 10, true);
        System.out.println(bs.name + " " + bs.numBikes + " " + bs.sponsor);

    }
}
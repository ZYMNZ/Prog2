//public interface Regularpolygon {
//    abstract int getNumSides();
//    abstract int getSideLength();
//}
//
//class EquilateralTriangle implements Regularpolygon{
//    int sideLength;
//    public EquilateralTriangle(int sideLength){
//        this.sideLength = sideLength;
//    }
//    @Override
//    public int getNumSides() {
//        return 3;
//    }
//    @Override
//    public int getSideLength() {
//        return sideLength;
//    }
//
//    void getPerimeter(){
//        System.out.println("Perimeter of the Equilateral Triangle is: " + (3 * sideLength));
//    }
//    void getInteriorAngle(){
//        System.out.println("Interior angle of the Equilateral Triangle is: " + (180 * (getNumSides() - 2) / getNumSides()));
//    }
//
//}
//class Square implements Regularpolygon{
//    int sideLength;
//
//    public Square(int sideLength) {
//        this.sideLength = sideLength;
//    }
//    @Override
//    public int getNumSides(){
//        return 4;
//    }
//    @Override
//    public int getSideLength(){
//        return sideLength;
//    }
//    void getPerimeter(){
//        System.out.println("Perimeter of the Square is: " + (4 * sideLength));
//    }
//    void getInteriorAngle(){
//        System.out.println("Interior angle of the Square is: " + (180 * (getNumSides() - 2) / getNumSides()));
//    }
//
//}
//
//
//    class dirver{
//        public static void main(String[] args) {
//            EquilateralTriangle e = new EquilateralTriangle(5);
//            e.getPerimeter();
//            e.getInteriorAngle();
//            Square s = new Square(5);
//            s.getPerimeter();
//            s.getInteriorAngle();
//        }
//    }
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
//
//
//
//
//
//

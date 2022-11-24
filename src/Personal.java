////Create 3 interfaces for a personnel, and in each one make an abstract method. First interface for his personal info having its abstract method to accept 3 parameters: name, age, location, and returning these info through an string array. Second interface for his educational info having its abstract method to accept 3 parameters: last degree, field of study, graduation year, and returning these info through an string array. Third interface for his employment info having its abstract method to accept 2 parameters: position, salary and returning these info through an string array.
////        Create a class employee that implements all 3 interfaces; and has a method, promotion, to check if personnel is eligible for promotion or not. Create another class family having 2 attributes: number of family members, and whether family is low-income or not; this class has its own constructor and also a method show() to display family information. Class employee has its own constructor and extends the class family as well.
////        Promotion criteria: (age>45 and family members>=2 and position is manager) or (age>50 and degree=Ph.D. and salary<5000)
////        Create your client class to test all above-mentioned interfaces and classes.
//
//        import java.util.Arrays;
//        import java.util.Scanner;
//interface personal_info{
//    abstract String [] p_info(String name,int age,String location);
//}
//interface edu_info{
//    abstract String [] e_info(String degree,String course,int grad_year);
//}
//interface work_info {
//    abstract String [] w_info(String position,double sal);
//}
//class personal {
//    int f_membe_no;
//    String income;
//    personal(int fm,String i){
//        this.f_membe_no=fm;
//        this.income=i;
//    }
//    void show() {
//        System.out.println("Personnel family members: " + this.f_membe_no);
//        if("yes".equalsIgnoreCase(this.income))
//            System.out.println("PERSONNEL FAMILY IS LOW-INCOME");
//        else System.out.println("PERSONNEL FAMILY IS NOT LOW-INCOME");
//    }
//}
//class emp extends personal implements personal_info,edu_info,work_info {
//    String []str1=new String[3];
//    String []str2=new String[3];
//    String []str3=new String[2];
//    public emp(String name,int age,String location,String degree,String course,int grad_year,String position,Double sal,int fm,String i) {
//        super(fm, i);
//        this.str1 = p_info(name,age,location);
//        this.str2 = e_info(degree,course,grad_year);
//        this.str3 = w_info(position,sal);
//    }
//    public String [] p_info(String name,int age,String location) {
//        String str[] = {name,String.valueOf(age),location};
//        return str;
//    }
//    public String [] e_info(String degree,String course,int grad_year) {
//        String str[] = {degree,course,String.valueOf(grad_year)};
//        return str;
//    }
//    public String [] w_info(String position,double sal) {
//        String str[] = {position,String.valueOf(sal)};
//        return str;
//    }
//    public void promotion() {
//        if((Integer.parseInt(str1[1])>45 && super.f_membe_no>=2 && str3[0].equalsIgnoreCase("manager"))||(Integer.parseInt(str1[1])>50 && str2[0].equalsIgnoreCase("Ph.D.") && Double.parseDouble(str3[1])<5000))
//            System.out.println("Personnel is eligible for promotion.");
//    }
//    public String toString() {
//        return "Personnel [Personal info: " + Arrays.toString(str1) + ", Educational info:" + Arrays.toString(str2) + ", Work info:" + Arrays.toString(str3) + "]";
//    }
//}
// class B {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.print("Enter the personnel name: ");
//        String name=in.next();
//        System.out.print("Enter the personnel age: ");
//        int age=in.nextInt();
//        System.out.print("Enter the personnel city: ");
//        String location=in.next();
//        System.out.print("Enter the personnel last degree: ");
//        String degree=in.next();
//        System.out.print("Enter the personnel course studied: ");
//        String course=in.next();
//        System.out.print("Enter the personnel graduation year: ");
//        int grad_year=in.nextInt();
//        System.out.print("Enter the personnel position: ");
//        String pos=in.next();
//        System.out.print("Enter the personnel salary: ");
//        Double sal=in.nextDouble();
//        System.out.print("Enter the number of personnel family members: ");
//        int m=in.nextInt();
//        System.out.print("Personnel family is low-income or not? (yes or no) ");
//        String income=in.next();
//        emp e=new emp(name,age,location,degree,course,grad_year,pos,sal,m,income);
//        System.out.println("\nOutput:");
//        System.out.println(e.toString());
//        e.show();
//        e.promotion();
//    }
//}

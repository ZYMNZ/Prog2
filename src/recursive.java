public class recursive {

    //Calculate the power for 2 inputted integer recursively.
//    public static void main(String[] args) {
//        System.out.println(power(3, 2));
//    }
//
//    public static int power(int base, int power) {
//        if (power == 1) {
//            return base;
//        }
//
//        return base * power(base, power - 1);
//
//    }

    //Using recursive method, write a program to accept a number from the user and print the sum of all numbers between 1 and n.

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a num");
//        int num = sc.nextInt();
//        System.out.println(sumNum(num));
//
//    }
//    public static int sumNum(int num){
//        if (num <= 0 ){
//            return 0 ;
//        }
//
//        return num + sumNum(num -1);
//
//    }

    //Using recursive method, write a program to print all prime numbers between 3 and 100.

//    public static void main(String[] args) {
//        for (int i = 3; i <=100 ; i++) {
//            System.out.println( i + "is prime: " + prime(i, 2));
//        }
//    }
//    public static boolean prime(int num, int num2){
//        if (num == num2){
//            return true;
//        }
//        if (num % num2 == 0){
//            return false;
//        }
//        return prime(num, num2 + 1);
//    }


    //WAP to reverse inputted integer.

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a num");
//        int num = sc.nextInt();
//        reverse(num);
//    }
//    public static void reverse(int num){
//        if (num < 10){
//            System.out.println(num);
//            return;
//        }
//        else {
//            System.out.print(num%10);
//            reverse(num/10);
//        }
//    }



//    WAP to convert a number into words.


//        public static void main(String args[]) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("enter the num u want to print in words");
//            int num = sc.nextInt();
//            String no=change(num);
//            System.out.println(no);
//        }
//        static String change(int no) {
//            if(no==0) return "zero";
//            if(no<0) return "minus " + change(-no);
//            String str = "";
//            if((no/1000000)>0) {
//                str += change(no/1000000) + " million ";
//                no%=1000000;
//            }
//            if((no/1000)>0) {
//                str += change(no/1000) + " thousand ";
//                no%=1000;
//            }
//            if((no/100)>0) {
//                str += change(no/100) + " hundred ";
//                no%=100;
//            }
//            if(no>0) {
//                String units[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
//                String tens[]={"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
//                if(no<20)str += units[no];
//                else  {
//                    str += tens[no/10];
//                    if((no%10)>0) str += " " + units[no%10];
//                }
//            }
//            return str;
//        }

//    WAP to list the names of all the files, folders, sub-folders … recursively

//    public static void main(String[] args) {
//        File file = new File("C:\\Users\\yaman\\OneDrive\\Documents");
//        filere(file);
//    }
//    public static void filere(File f){
//        File list[] = f.listFiles();
//        for (int i = 0; i < list.length; i++) {
//            if (list[i].isFile()){
//                System.out.println(list[i].getName());
//            }
//            else {
//                filere(list[i]);
//            }
//        }
//
//    }



//  Using recursive method, write a program to accept and then convert a positive decimal number to its binary equivalent.

//    public static void main(String[] args) {
//        decToBin(999999999);
//    }
//    public static void decToBin(int num){
//        if (num == 0){
//            return;
//        }
//        else {
//            decToBin(num / 2);
//            System.out.print(num % 2);
//        }
//    }


//Using recursive method, write a program to convert and print all octal and hexadecimal equivalents for numbers between 1 and 32.
// (Do not use any String or Char variables – use just integers)

//    public static void main(String[] args){
//        int base1=8,base2=16;
//        for(int n=1;n<=32;n++) {
//            System.out.print("\nDecimal " + n + " -> Octal: ");
//            convert(n,base1);
//            System.out.print(" and Hexadecimal: ");
//            convert(n,base2);
//        }
//    }
//    public static void convert(int n,int base){
//        if(n==0) System.out.print("");
//        else if(n>0){
//            convert(n/base,base);
//            if(n%base<10)System.out.print(n%base);
//            else {
//                switch(n%base) {
//                    case 10:System.out.print("A");break;
//                    case 11:System.out.print("B");break;
//                    case 12:System.out.print("C");break;
//                    case 13:System.out.print("D");break;
//                    case 14:System.out.print("E");break;
//                    case 15:System.out.print("F");break;
//                }
//            }
//        }
//    }



//    Using recursive method, write a program to print Fibonacci series till n number of times (n accepted from the user).

//    public static void main(String[] args) {
//        System.out.println(fibonacciIndex(6));
//    }
//    static int fibonacciIndex( int num){
//        if (num == 0){
//            return 0;
//        }
//        if (num == 1){
//            return 1;
//        }
//        return fibonacciIndex(num - 1) + fibonacciIndex(num - 2);
//    }





    public static void main(String[] args) {
//        printnum(5);

//        System.out.println(cateyes(5));

//        System.out.println(power(5, 2));

//        System.out.println(factorial(5));

//        System.out.println(phones(4));

    }


//    static void printnum(int num){
//        if (num<=0){
//            return;
//        }
//        printnum(num-1);
//        System.out.println(num);
//    }


//    static int cateyes(int cats){
//        if (cats <=0){
//            return 0;
//        }
//       return 2 + cateyes(cats - 1 );
//    }


//        static int power (int base, int power){
//            if(power ==1){
//                return base;
//            }
//            return power(base*base, power - 1);
//        }
//        static int factorial(int num){
//            if(num <=1){
//                return 1;
//            }
//            return  num * factorial(num - 1);
//        }


//            static int phones(int phone){
//                if(phone<=0){
//                    return 0;
//                }else{
//                    if(phone%2 == 0) return 2 + phones(phone - 1);
//                    else return 1 + phones(phone - 1);
//                }
//            }














//// reverse any String using recursion
//    public static void main(String[] args) {
//       strreverse("meow");
//    }
//    static void strreverse(String str){
//        if(str ==null || str.length() < 1){
//            return;
//        }
//        System.out.print(str.charAt(str.length()-1));
//        strreverse(str.substring(0,str.length() - 1));
//
//    }










//============================================================================
    //created smth cool lmao

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a num");
//        int num = sc.nextInt();
//        reverse(num);
//    }
//    public static void reverse(int num){
//        if (num < 10){
//            System.out.println(num);
//            return;
//        }
//        else {
//            System.out.println(num);
//            reverse(num/10);
//            System.out.println(num);
//        }
//
//
//    }
//==========================================================================


//=============================================================-------------------==========================================================


//    public static void main(String[] args) {
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
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a num");
//        int num = sc.nextInt();
//        System.out.println(recursive2(num));
//    }
//
//    public static int recursive2 (int num){
//        if (num == 0){
//            return 0;
//        }
//        return num + recursive2(num - 1 );
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a num");
//        int num = sc.nextInt();
//    }
//    public static int recursive3(int num){
//        if(num == 0){
//            return 0;
//        }
//        for (int i = 3; i < 100 ; i++) {
//            for (int j = 0; j < num; j++) {
//                if (num)
//            }
//        }
//    }

//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      System.out.println("enter a num");
//      int num = sc.nextInt();
//    }
//    public static int recursive_reverse(int num) {
//        if (num == 0) return 0;
//
//        int num1 = 0;
//        while (num > 0) {
//            num1 = num % 10;
//            return num1 /= 10;
//        }
//        return num1;
//    }

//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n ,base = 2;
//        System.out.println("Enter a positive integer: ");
//        n = sc.nextInt();
//        System.out.println("The binary value of " + n + " is " );
//        toBinary(n, base);
//
//    }
//    public static void toBinary(int n, int base){
//        if (n == 0) System.out.println(0);
//        else if (n>0) {
//            toBinary(n/base,base);
//            System.out.println(n%base);
//        }
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n ;
//        System.out.println("Enter how many times u want it to repeat: ");
//        n = sc.nextInt();
//        System.out.print("0,1,");
//        Fibonacci(0,1,n);
//
//
//
//
//
//    }
//    public static void Fibonacci(int fnum, int snum, int ctr){
//
//            if(ctr==0) {
//
//            }else {
//                    int sum;
//                    sum = fnum + snum;
//                    System.out.print(sum + ", ");
//                    ctr--;
//                    Fibonacci(snum, sum, ctr);
//            }
//
//
//    }

//    UNCOMPLETE
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the num u want to convert");
//        int num = sc.nextInt();
//
//        recursiveNumToStr(num);
//        String[] ZeroTONine = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        String[] ZeroTOtwenty = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
//        String[] BigNum = {"hundred", "thousand", "million", "billion", "trillion"};
//
//        for ()
//
//    }
//
//    public static void recursiveNumToStr(int num){
//        int no;
//        if(num == 0){
//            System.err.println("NUM CANT BE ZERO MAN");
//        }
//
//        else {
//            no = num/1000;
//            System.out.println();
//
//        }
//    }

//    public static void main(String[] args) throws IOException {
//        File root = new File("C:");
//        File[] file = root.listFiles();
//
//        if (root.isFile()){
//            System.out.println( root.getName());
//        }
//
//    }
//    public static void recursive(File ){
//
//    }


}











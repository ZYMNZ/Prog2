//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ArrayLists {
//    public static void main(String[] args) {
//        ArrayList<String> al = new ArrayList<String>();
//
//        al.add("meow");
//        al.add("m");
//        al.add("e");
//        al.add("o");
//        al.add("w");
//
//        al.add(1,"meow");
//        al.remove(2);
//        al.add("meow");
//        al.size();
//
//        ArrayList<Integer> al1 = new ArrayList<Integer>();
//
//        al1.add(23);
//        al1.add(1,23);
//        al1.remove(Integer.valueOf(23));
//
//
//        al1.ensureCapacity(400);
//        al1.trimToSize();
//
//
//        ArrayList<String> st = new ArrayList<String>();
//
//        ArrayList<Integer> in = new ArrayList<Integer>();
//
//        st.add("AB");
//        st.add("CD");
//        st.add("EF");
//        st.add("GH");
//        st.add("IJ");
//        st.add("KL");
//        st.add("MN");
//        st.add("OP");
//        st.add("QR");
//        st.add("ST");
//
//        System.out.println("size: " + st.size());
//        System.out.println(st);
//        for (int i = 0; i < st.size(); i++) {
//            if(i % 2 == 0){
//                st.remove(i);
//            }
//        }
//        System.out.println("size: " + st.size());
//        System.out.println("new list: " + st);
//
//        in.add(1);
//        in.add(2);
//        in.add(3);
//        in.add(4);
//        in.add(5);
//        in.add(6);
//        in.add(7);
//        in.add(8);
//        in.add(9);
//        in.add(10);
//
//        int flag =0;
//
//        System.out.println("size: " + in.size());
//        System.out.println(in);
//        for (int i = 0; i < in.size(); i++) {
//
//            if(i % 2 != 0){
//                in.remove(i);
//                flag = 1;
//            }
//            if(i % 2 == 0){
//                in.remove(i);
//                flag = 1;
//            }
//
//
//        }
//        System.out.println("size: " + in.size());
//        System.out.println("new list: " + in);
//
////--------------------------------------------------------------------------------------------------------------------------//
////
////    a2.add(2, -52); // adding a number base on the position of the index 2, thus making -52 the 3rd number
////
////	System.out.println("The different numbers are : " + a2);
////	System.out.println("\nThe size of the array is : " + a2.size());
////
////	a2.remove(Integer.valueof(745)); // removing based on value
////	a2.remove(2); // at the index of 2 from the array thus the 3rd element
////
////
//////	(Your array list).trimToSize(); # This trims the size for your array to its current content amount
//////	(Your array list).ensureCapacity(int cap); # This ensures an initial size for your array
////
//////  Using this to change your arraylist to an array
//////  int s = a2.size();
//////  String a3[] = a2.toArray(new String[s]);
////
////
////	Arraylist<String> S = new Arraylist<String>(10);
////
////	Scanner sc = new Scanner(System.in);
////
////  int num = 0;
////
////	for (int i = 0; i < S.size(); i++ ) {
////		  System.out.println("Enter string " + (num + 1) + " : " );
////		    S<i> = sc.nextString;
////	}
////
////	boolean isConan = false;
////
////	for (int i = 0; i < S.length; i++) {
////	if ( isConan == false ) {
////	S.remove(0);
////	isConan = true;
////	} else if ( isConan == true) {
////	S.remove(1);
////	isConan = false;
////	     }
////	   }
////
////
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
//    }
//}

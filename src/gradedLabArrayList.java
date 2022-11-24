//import java.util.ArrayList;
//import java.util.*;
//public class gradedLabArrayList {
//
//
//
//    class A {
//        public static void main(String args[]) {
//            ArrayList<Integer> al = new ArrayList<Integer>();
//            boolean flag=true;
//            Scanner in=new Scanner(System.in);
//            while(flag) {
//                System.out.print("Wish to enter number?(yes or no)");
//                String choice=in.next();
//                if(choice.equalsIgnoreCase("no"))flag=false;
//                else {
//                    System.out.print("Enter the number: ");
//                    al.add(in.nextInt());
//                }
//            }
//            ArrayList<String> al1 = new ArrayList<String>();
//            int z=al.size();
//            for(int i=0;i<z;i++) {
//                String str="";
//                int f=0,j=0,sum=0;
//                if(al.get(i)%2==0) str= str + " is even, ";
//                else str= str + " is odd, ";
//                for(j=2;j<al.get(i);j++) if(al.get(i)%j==0) {f=1;break;}
//                if(f==0)str= str + " prime, ";
//                else str= str + " not prime, ";
//                for(j=1,sum=0;j<al.get(i);j++) {if(al.get(i)%j==0)sum=sum+j;}
//                if(sum==al.get(i))str= str + " and perfect.";
//                else str= str + " and not perfect.";
//                al1.add(str);
//                System.out.print("Number " + al.get(i));
//                System.out.println(al1.get(i));
//            }
//        }
//    }
//    class B {
//        public static void main(String args[]) {
//            ArrayList<String> al = new ArrayList<String>();
//            boolean flag=true;
//            Scanner in=new Scanner(System.in);
//		while(flag) {
//			System.out.print("Wish to enter a word?(yes or no)");
//			String choice=in.next();
//			if(choice.equalsIgnoreCase("no"))flag=false;
//			else {
//				System.out.print("Enter the word: ");
//				al.add(in.next());
//			}
//		}
//            al.add("aa");al.add("bb");al.add("cc");al.add("e");al.add("bb");al.add("cc");al.add("w");
//            al.add("aa");al.add("bb");al.add("cc");al.add("aa");al.add("bb");al.add("cc");al.add("aa");
//            al.add("aa");al.add("f");al.add("cc");al.add("aa");al.add("v");al.add("cc");al.add("aa");
//            System.out.println(al);
//            int z=al.size();
//            for(int i=0;i<z;i++) {
//                flag = true;
//                int ctr = 1, p = i;
//                String str=al.get(i);
//                for(int j=0;j<i;j++) if(str.equalsIgnoreCase(al.get(j))) flag = false;
//                if(flag) {
//                    System.out.print(str + " in index " + p + " ");
//                    for(int j=i+1;j<z;j++) if(str.equalsIgnoreCase(al.get(j))) {
//                        System.out.print(j + " ");
//                        ctr++;
//                    }
//                    System.out.println(" repeated for " + ctr + " times.");
//                }
//            }
//        }
//    }
//
//
//}
//

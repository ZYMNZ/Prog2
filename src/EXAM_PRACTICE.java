import java.util.ArrayList;
import java.util.Scanner;

public class EXAM_PRACTICE {
    public static void main(String[] args) {

        //checking for duplicates names in an arraylist from user input and delete them if found
        ArrayList<String> al = new ArrayList<String>();
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        while(flag) {
            System.out.print("Wish to enter a word?(yes or no)");
            String choice=in.next();
            if(choice.equalsIgnoreCase("no"))flag=false;
            else {
                System.out.print("Enter the word: ");
                al.add(in.next());
            }
        }
        System.out.println(al);
        int z=al.size();
        for(int i=0;i<z;i++) {
            flag = true;
            for(int j=i+1;j<z;j++) {
                if(al.get(i).equals(al.get(j))) {
                    al.remove(j);
                    z--;
                    j--;
                    flag = false;
                }
            }
            if(flag) {
                System.out.println("No duplicates found for " + al.get(i));
            }
            else {
                System.out.println("Duplicates found for " + al.get(i));
            }
        }
        System.out.println(al);

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        flag=true;
        while(flag) {
            System.out.print("Wish to enter number?(yes or no)");
            String choice=in.next();
            if(choice.equalsIgnoreCase("no"))flag=false;
            else {
                System.out.print("Enter the number: ");
                al1.add(in.nextInt());
            }
        }
        System.out.println(al1);
        int z1=al1.size();
        z1=al1.size();
       //multiplies even numbers by 2 and odd numbers by 3 and replaces them in the ArrayList. Print the result.
        for(int i=0;i<z;i++) {
            if(al1.get(i)%2==0) al1.set(i,al1.get(i)*2);
            else al1.set(i,al1.get(i)*3);
        }
        System.out.println(al1);

//        teams t1=new teams("India");
//        while(flag){
//            System.out.println("choose an option: ");
//            System.out.println("1. to see the word");
//            System.out.println("2. update the word");
//            System.out.println("3. exit");
//            int choice=in.nextInt();
//
//            switch(choice){
//                case 1:
//
//                    t1.getName();
//                    break;
//                case 2:
//                    System.out.println("enter the new word: ");
//                    t1.setName(in.next());
//                    break;
//                case 3:
//                    flag=false;
//                    break;
//                default:
//                    System.out.println("invalid choice");
//            }
//
//        }
//
//    }

//        Child c=new Child();
//        System.out.println(c.b);
//        c.b = 20;
//        System.out.println(c.b);
//        System.out.println(c.a);
//        c.a = 20;
//        System.out.println(c.a);

        //Child2 c=new Child2();
        //System.out.println(c.a + " and " + c.b);
        //c.show();
       // c.name

        titz t=new titz();
        t.uncommmon("ertrtyuiruse","tfsdertsfts");

    }
}

class titz{
    void uncommmon(String str, String str1) {
        System.out.println("printing uncommon characters from two strings Ignore repeated characters in every single word.");
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str1.indexOf(str.charAt(i)) == -1) {
                if (str2.indexOf(str.charAt(i)) == -1) {
                    str2 += str.charAt(i);
                }
            }
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str.indexOf(str1.charAt(i)) == -1) {
                if (str2.indexOf(str1.charAt(i)) == -1) {
                    str2 += str1.charAt(i);
                }
            }
        }
        System.out.println(str2);







    }
}
class Child2 extends Parent2{
    int a=70;
    Child2(){//no change in execution when in child class, you have or not have any constructor
        super("hello");
        System.out.println("hi from child constructor");
        System.out.println(name);
    }
    void show() {
        System.out.println("inside the child class");
        System.out.println(a);
        System.out.println(super.a);
        super.show();
    }
}
class Parent2{
    String name;
    int a=50;
    int b=20;
    Parent2(String name){
        this.name=name;
        System.out.println("hi from parent constructor");
    }
    void show() {
        System.out.println("inside the parent class");
    }
}

class Parent{
    int a=5;
    void show() {
        System.out.println("inside the parent class");
    }
}
class Child extends Parent{
    int b=7;
    void display() {
        System.out.println("inside the child class");
    }
}

class teams{
    private String name;

    public teams(String n){
        this.name = n;
    }

    void getName() {
        System.out.println("this is the name of the team: " + this.name);
    }

    void setName(String name) {
        if (name.matches("[A-Za-z]+") == true && name !=null){
            this.name = name;
            System.out.println("info updated");
        }

    }
}











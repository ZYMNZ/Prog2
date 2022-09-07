import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p[] = new Person[3];
        for (int i = 0; i < p.length; i++) {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            p[i] = new Person();
            p[i].setName(name);
            p[i].setAge(age);
            //p[i] = new Person(name,age);
        }

        int max = 0, j = 0;

        for (int i = 0; i < p.length; i++) {

           System.out.println("");
            if (p[i].age > max) {
                max = p[i].age;
                j = i;
            }
        }
        System.out.println("\nThe oldest berson is: " +
                p[j].getName() + " with the age of " + p[j].age);




    }
}

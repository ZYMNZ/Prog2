import java.util.ArrayList;
import java.util.Scanner;

class school{
    String name;
    int numOfStudents;
    int accademicYear;

    school(String name, int numOfStudents, int accademicYear){
        this.name = name;
        this.numOfStudents = numOfStudents;
        this.accademicYear = accademicYear;
    }
}



public class arraylist {
    public static void main(String[] args) {
        ArrayList<school> skl = new ArrayList<school>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("menu");
            System.out.println("1. add school");
            System.out.println("2. search school by name");
            System.out.println("3. exit");
            System.out.println("enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter school name");
                    String name = sc.next();
                    System.out.println("enter number of students");
                    int numOfStudents = sc.nextInt();
                    System.out.println("enter accademic year");
                    int accademicYear = sc.nextInt();
                    school s = new school(name, numOfStudents, accademicYear);
                    skl.add(s);
                    break;
                case 2:
                    System.out.println("enter school name");
                    String name1 = sc.next();
                    for (school school : skl) {
                        if(school.name.equals(name1)){
                            System.out.println("school name: "+school.name);
                            System.out.println("number of students: "+school.numOfStudents);
                            System.out.println("accademic year: "+school.accademicYear);
                        }
                    }
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }

        }

    }
}

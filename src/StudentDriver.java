import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[5];
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Enter your rank: ");
            int rank = sc.nextInt();
            arr[i] = new Student(name, rank);
        }
        String temp1 = "";
        int temp2 = 0;
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 ; j++) {
                if(arr[i].rank > arr[i+1].rank){
                    temp1 = arr[j].name;
                    temp2 = arr[j].rank;
                    arr[j].name = arr[j+1].name;
                    arr[j].rank= arr[j+1].rank;
                    temp1 = arr[j+1].name;
                    temp2 = arr[j+1].rank;
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "");
        }

    }
}

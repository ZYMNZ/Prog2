import java.util.Scanner;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String feet() {
        return "I have 4 feet";
    }
}

class Kangaroo extends Animal {
    public Kangaroo(String name) {
        super(name);
    }

    public String feet() {
       return  "I have 2 feet";
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    public String feet() {
       return "I have 4 feet";
    }
}

class Snake extends Animal {
    public Snake(String name) {
        super(name);
    }

    public String feet() {
       return "I have 0 feet";
    }
}




public class OverWriting {
    public static void main(String[] args) {
        Animal a = new Animal("Animal");
        Kangaroo k = new Kangaroo("Kangaroo");
        Horse h = new Horse("Horse");
        Snake s = new Snake("Snake");

//        System.out.println( a.name + " "+ a.feet());
//        System.out.println( k.name + " " + k.feet());
//        System.out.println( h.name + " " + h.feet());
//        System.out.println( s.name + " " + s.feet());


    Scanner sc = new Scanner(System.in);

    System.out.println("Enter num 1 for Animal, 2 for Kangaroo, 3 for Horse, 4 for Snake: ");

    System.out.println("Enter a choice: ");
    int choice = sc.nextInt();

    switch (choice) {
        case 1:
            System.out.println(a.name + " " + a.feet());
            break;
        case 2:
            System.out.println(k.name + " " + k.feet());
            break;
        case 3:
            System.out.println(h.name + " " + h.feet());
            break;
        case 4:
            System.out.println(s.name + " " + s.feet());
            break;
        default:
            System.out.println("Invalid choice");
            break;
    }


    }
}

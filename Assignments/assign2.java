import java.util.*;

class Person {
    protected String name;
    protected int age;
    protected int cur_id;
    private static int idCounter = 1;  // Shared among all Person objects

    public Person() {
        cur_id = idCounter++;
    }

    public void getData(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    public void putData() {
        System.out.print("Name: " + name + ", Age: " + age + ", ");
    }
}

class Professor extends Person {
    private int publications;

    public Professor() {
        super();
    }
  
    public void getData(Scanner sc) {
        super.getData(sc);
        System.out.print("Enter number of publications: ");
        publications = sc.nextInt();
    }

    
    public void putData() {
        super.putData();
        System.out.println("Publications: " + publications + ", ID: " + cur_id);
    }
}

class Student extends Person {
    private int[] marks = new int[6];

    public Student() {
        super();
    }

 
    public void getData(Scanner sc) {
        super.getData(sc);
        System.out.println("Enter marks in 6 subjects: ");
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

 
    public void putData() {
        super.putData();
        int sum = 0;
        for (int m : marks) sum += m;
        System.out.println("Total Marks: " + sum + ", ID: " + cur_id);
    }
}

public class assign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people (Professor/Student): ");
        int n = sc.nextInt();

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter 1 for Professor or 2 for Student for person " + (i + 1) + ": ");
            int type = sc.nextInt();
            if (type == 1) {
                persons[i] = new Professor();
            } else if (type == 2) {
                persons[i] = new Student();
            } else {
                System.out.println("Invalid type! Skipping this entry.");
                continue;
            }
            persons[i].getData(sc);
        }

        System.out.println("\n----- OUTPUT -----\n");
        for (Person person : persons) {
            if (person != null) {
                person.putData();
            }
        }

        sc.close();
    }
}

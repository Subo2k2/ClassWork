//Variables & Data Types
public class Main {
    public static void main(String[] args) {
        int age = 23;
        double gpa = 3.5;
        char grade = 'A';
        boolean passed = true;
        String name = "Subhan";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);
    }
}

//Basic Input / Output
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Welcome " + name + "! You are " + age + " years old.");
    }
}

//Conditional Statements
public class Main {
    public static void main(String[] args) {
        int num = 7;

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

//Loops
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}

//Arrays
public class Main {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        double average = (double) sum / marks.length;
        System.out.println("Average Marks = " + average);
    }
}

//Functions (Methods)
public class Main {
    public static void main(String[] args) {
        int result = addNumbers(5, 10);
        System.out.println("Sum = " + result);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}

//Basics of OOP
class Student {
    String name;
    int rollNo;

    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", 101);
        s1.displayInfo();
    }
}
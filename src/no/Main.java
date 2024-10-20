package no;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(10, "Alice", "123 Main St"));
        students.add(new Student(5, "Bob", "456 Maple Ave"));
        students.add(new Student(3, "Charlie", "789 Oak St"));
        students.add(new Student(8, "David", "321 Elm St"));
        students.add(new Student(1, "Eve", "654 Pine St"));
        students.add(new Student(7, "Frank", "987 Cedar St"));
        students.add(new Student(2, "Grace", "111 Birch St"));
        students.add(new Student(9, "Hannah", "222 Spruce St"));
        students.add(new Student(4, "Isaac", "333 Redwood St"));
        students.add(new Student(6, "Jack", "444 Cypress St"));

        System.out.println("Original List:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by Name
        SelectionSort.selectionSort(students, new NameComparer());
        System.out.println("\nSorted by Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by Roll Number
        SelectionSort.selectionSort(students, new RollNoComparer());
        System.out.println("\nSorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
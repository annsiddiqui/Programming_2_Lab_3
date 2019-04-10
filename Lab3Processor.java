import java.util.Scanner;
import java.io.*;
public class Lab3Processor
{
    public static final int MAX_STUDENTS = 30;

    public void run() throws FileNotFoundException
    {
        
        Scanner keyBoard = new Scanner(System.in);      // allows input from the keyboard
        Student[] comp1502 = new Student[MAX_STUDENTS]; // stores all the students in the system
        int numStudents;    // number of students currently store in array
        String id;          // id of student (input by user
        
        Lab3Helper2 students = new Lab3Helper2();
        System.out.print("enter the name of the file: ");
        comp1502 = in.nextInt();
        numStudents = students.loadArray(comp1502);

        // Step 1 - print id & balance for all students with print balance more than $10
        System.out.println("Step 1: Students with balances over $10.00:");

        
        // Step 2 - read an id, and print message if this student in the array (or not)
        System.out.println("\nStep 2: Check if a student is in the system:");
        System.out.print("Enter id of student you're looking for: ");
        id = keyBoard.nextLine();

        
        
        
        
        
        // Step 3 - print all the info of all the students, 1 per line
        System.out.println("\nStep 3: Current info on all students:");

        
        
        
        
        
        
        
        
        // Step 4 - read an id and balance for a new student, and add to the array
        System.out.println("\nStep 4: Add a new student to the system:");

        
        
        
        
        
       

        // Step 5 - write the code to load the array from file (if time)
    }
}



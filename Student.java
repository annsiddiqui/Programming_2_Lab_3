/**
 * In one sentence, give the overall purpose Student here.
 * 
 * @author  Qurrat-al-Ain Siddiqui
 */
public class Student
{
    public static final int MAX_COURSES = 20;    
    private String id;        // student id
    private double printBalance; // $ in print account
    private int numCompleted;   // # courses completed (have a grade)
    private int[]finalGrades; //% in each course

    /**
     * Constructor for objects of class Student
     */
    public Student(String id)
    {
        this.id = id;
        printBalance = 0;
        numCompleted = 0;
        finalGrades = new int[MAX_COURSES];
    }

    public String getId()
    {
        return id;
    }
    public double getPrintBalance()
    {
        return printBalance;
    }
    public int getNumCompleted()
    {
        return numCompleted;
    }
    public void setPrintBalance(double balance)
    {
         printBalance = balance;
    }
    public void setNumCompleted(int completed)
    {
        numCompleted = completed;
    }
    public void addGrade(int mark)
    {
        //!!! no error checking for array overflow - OK for lab, not for robust class
        finalGrades[numCompleted]  = mark; 
        numCompleted++;
    }
    public int[] getGrades()
    {
        //!!!NOTE - this is bad code - you should never return a reference to an instance variable
        return finalGrades; 
    }
    public String toString()
    {
        String result;
        
        result = "Id: " + id  + ", balance: " + printBalance + ", courses completed: " + numCompleted;
        result = result + ", Grades:";
        for (int i = 0; i < numCompleted; i++)
        {
            result = result + " " + finalGrades[i];
        }
        return result;
    }
}

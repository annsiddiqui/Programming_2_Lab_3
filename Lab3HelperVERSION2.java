import java.util.*;
import java.io.*;
public class Lab3HelperVERSION2
{
    private int iD;
    private double balance;
    
    private double [] studentGrade;

    public Lab3HelperVERSION2() {
        this.iD = 0;
        this.balance = 0.0;
        this.studentGrade = new double [100];
    }


    public void loadArray(String filename) throws FileNotFoundException {
        
        Scanner Filein = new Scanner(new File(filename));
        int i = 0;
        while (Filein.hasNext()) {
            
            iD = Filein.nextInt();
            balance = Filein.nextDouble();
            studentGrade [i] = Filein.nextDouble();
            i++;
        }

    }
}


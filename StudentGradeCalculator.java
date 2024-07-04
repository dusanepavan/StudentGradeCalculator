
import java.util.Scanner;
public class StudentGradeCalculator 
{

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("Enter the number of subjects:");
        int nS= sc.nextInt();

        int totalMarks = 0;
        
        for (int i = 1; i <= nS; i++) 
        {
            System.out.println("Enter marks for subject " + i + ":");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double averP=(double)totalMarks/nS;
        
        char Grade;
      
        if (averP >= 90) 
        {
        	Grade='O';
        }
        else if (averP >= 80) 
        {
        	Grade='A';
        } 
        else if (averP >= 70)
        {
        	Grade='B';
        }
        else if (averP >= 60) 
        {
        	Grade='C';
        } 
        else if (averP >= 50) 
        {
        	Grade='D';
        } 
        else
        {
        	Grade='F';
        }
        System.out.println("Total Marks Score is "+totalMarks);
        System.out.println("Average Percentage Gained is "+averP+"%");
        System.out.println("Grade :"+Grade);
    
    }
}

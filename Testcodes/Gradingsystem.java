import java.util.Scanner;

public class Gradingsystem {
    public static void main(String[] args)
   {
      float[] marks = new float[6];
      float sum=0;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter Total Number of Subjects: ");
      int tot = sc.nextInt();
      System.out.print("Enter Marks Obtained in " +tot+ " Subjects: ");
      for(int i=0; i<tot; i++)
      {
         marks[i] = sc.nextFloat();
         sum += marks[i];
      }
	  
      float avg = sum/tot;
      String grade = "";
      
      if(avg>100)
         grade = "Invalid input";    
      else if(avg>=90 && avg<=99)
         grade = "A";
      else if(avg>=80 && avg<=89)
         grade = "B";
      else if(avg>=70 && avg<=79)
         grade = "C";
      else if(avg>=60 && avg<=69)
         grade = "D";
      else if(avg>=50 && avg<=59)
         grade = "E";
      else if(avg<50)
         grade = "F";
      else
         grade = "Invalid Input!";
		 
      if(grade.equals("Invalid Input!"))
         System.out.println("\nInvalid Input!");
      else
         System.out.println("\nGrade = " +grade);
   }
}

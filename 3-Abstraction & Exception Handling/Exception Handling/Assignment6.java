import java.util.Scanner;
import java.util.InputMismatchException;
class InvalidMarksException extends Exception{
	InvalidMarksException(String S){
		super(S);
	}
}



public class Assignment6{
	static void validate(int marks) throws InvalidMarksException	{
	if (marks<0){
		throw new InvalidMarksException("Marks cannot be negative");
	}
	else if(marks>100){
		throw new InvalidMarksException("Invalid Marks");
	}
}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int stud1_sub1_marks,stud1_sub2_marks,stud1_sub3_marks,stud2_sub1_marks,stud2_sub2_marks,stud2_sub3_marks;
		String stud1_name,stud2_name,round;
		Assignment6 obj = new Assignment6();
		try{	
			
			System.out.print("Enter the name of First Student : ");
			stud1_name=in.nextLine();
			System.out.println("Enter the marks of "+stud1_name);
			System.out.print("Marks in First Subject : ");
			stud1_sub1_marks=in.nextInt();
			validate(stud1_sub1_marks);
			System.out.print("\nMarks in Second Subject : ");
			stud1_sub2_marks=in.nextInt();
			validate(stud1_sub2_marks);
			System.out.print("\nMarks in Third Subject : ");
			stud1_sub3_marks=in.nextInt();
			validate(stud1_sub3_marks);
			System.out.print("Enter the name of Second Student : ");
			if (in.hasNextLine()) {
           			 round = in.nextLine();
        		}
			
			stud2_name=in.nextLine();
			System.out.println("Enter the marks of "+stud2_name);
			System.out.print("Marks in First Subject : ");
			stud2_sub1_marks=in.nextInt();
			validate(stud2_sub1_marks);
			System.out.print("\nMarks in Second Subject : ");
			stud2_sub2_marks=in.nextInt();
			validate(stud2_sub2_marks);
			System.out.print("\nMarks in Third Subject : ");
			stud2_sub3_marks=in.nextInt();
			validate(stud2_sub3_marks);
			System.out.println("Record has been saved sucessfully");
		}
		catch(InputMismatchException e){
			System.out.println(e);
		}
		catch(InvalidMarksException e){
			System.out.println(e);
		}
		

	}
}

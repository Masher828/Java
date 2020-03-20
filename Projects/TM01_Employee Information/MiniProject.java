public class MiniProject{
	public static void main(String[] args){
		int[] Emp_no = {1001,1002,1003,1004,1005,1006,1007};
		String[] Emp_name={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String[] Join_date={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
		Character[] Designation_Code={'e','c','k','r','m','e','c'};
		String[] Department={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int[] Basic ={20000,30000,10000,12000,50000,23000,29000};
		int[] HRA={8000,12000,8000,6000,20000,9000,12000};
		int[] IT={3000,9000,1000,2000,20000,4400,10000};
		String Designation="";
		int salary=0;
		try{
			int id = Integer.parseInt(args[0]);
			for (int i =0;i<7;i++){
				if (Emp_no[i]==id){
					switch(Designation_Code[i]){
						case 'e' : 
							Designation = "Engineer";
							salary = Basic[i]+HRA[i]+20000-IT[i];
							break;
						case 'c' :
							Designation = "Consultant";
							salary = Basic[i]+HRA[i]+32000-IT[i];
							break;
						case 'k' : 
							Designation = "Clerk";
							salary = Basic[i]+HRA[i]+12000-IT[i];
							break;
						case 'r' :
							Designation = "Receptionist";
							salary = Basic[i]+HRA[i]+15000-IT[i];
							break;
						case 'm' :
							Designation = "Manager";
							salary = Basic[i]+HRA[i]+40000-IT[i];
							break;
					}
					System.out.println("Emp No.  EmpName     Department     Designation     Salary");
					System.out.println(Emp_no[i]+"     "+Emp_name[i]+"     "+Department[i]+"\t\t"+Designation+"   \t"+salary);
					System.exit(0);
				}
			}
			System.out.println("There is no employee with empid : "+args[0]);
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}
							
							
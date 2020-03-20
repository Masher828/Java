import java.util.*;
class Employee{
	int empId;
	String empName="";
	String email="";
	String gender="";
	double salary=0.0;
	void getEmployeeDetails(){
		System.out.println("Name : "+this.empName+"\nEmail : "+this.email+"\nGender : "+this.gender+"\nSalary : "+this.salary);
	}
}

class EmployeeDB{
	ArrayList<Employee> list= new ArrayList<Employee>();
	boolean addEmployee(Employee e){
		list.add(e);
		return true;
	}
	boolean deleteEmployee(int empId){
		for(Employee emp : list){
			
			if (emp.empId==empId){	
				list.remove(emp);			
				return true;
			}
		}
		return false;
	}
	String showPaySlip(int empId){
		Iterator it = list.iterator();
		for (Employee emp : list){
			if (emp.empId==empId){
				return ("Name : "+emp.empName+"\nEmail : "+emp.email+"\nSalary : "+emp.salary);
			}
		}
		return "";
	}
}

public class Assignment2{
	public static void main(String[] args){
		Employee emp = new Employee();
		EmployeeDB empdb = new EmployeeDB();
		emp.empId=11046;
		emp.empName ="Manish";
		emp.email ="Manish@gmail.com";
		emp.gender ="Male";
		emp.salary=2000000;
		empdb.addEmployee(emp);
		Employee emp1 = new Employee();
		emp1.empId=11047;
		emp1.empName ="Masher";
		emp1.email ="Masher@gmail.com";
		emp1.gender ="Male";
		emp1.salary=300000;
		empdb.addEmployee(emp1);
		Employee emp2 = new Employee();
		emp2.empId=11048;
		emp2.empName ="Meenakshi";
		emp2.email ="Meenakshi@gmail.com";
		emp2.gender ="Female";
		emp2.salary=9000000;
		empdb.addEmployee(emp2);
		Employee emp3 = new Employee();
		emp3.empId=11049;
		emp3.empName ="Mohit";
		emp3.email ="Mohit@gmail.com";
		emp3.gender ="Male";
		emp3.salary=980000;
		empdb.addEmployee(emp3);
		Employee emp4 = new Employee();
		emp4.empId=11050;
		emp4.empName ="Nikhil";
		emp4.email ="Nikhil@gmail.com";
		emp4.gender ="Male";
		emp4.salary=700000;
		empdb.addEmployee(emp4);
		Employee emp5 = new Employee();
		emp5.empId=11051;
		emp5.empName ="Nisha";
		emp5.email ="Nisha@gmail.com";
		emp5.gender ="Female";
		emp5.salary=9760000;
		empdb.addEmployee(emp5);
		System.out.println(empdb.showPaySlip(11046));
		System.out.println(empdb.showPaySlip(11047));
		System.out.println(empdb.showPaySlip(11048));
		System.out.println(empdb.showPaySlip(11049));
		System.out.println(empdb.showPaySlip(11050));
		System.out.println(empdb.showPaySlip(11051));
		System.out.println(empdb.list.size());
		System.out.println(empdb.deleteEmployee(11050));
		System.out.println(empdb.list.size());
	}
}
		
		
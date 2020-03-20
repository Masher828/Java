import java.util.*;
class Employee{
	int empId;
	String empName;
	Employee(int empId, String empName){
		this.empId=empId;
		this.empName=empName;
	}
	String getEmpName(){
		return this.empName;
	}
	int getEmpId(){
		return this.empId;
	}
}

public class Assignment7{
	public static void main(String[] args){
		Vector<Employee> vec = new Vector<Employee>();
		Enumeration enu;
		Iterator itr;
		Employee ele;
		String[] empName={"Manish","Masher","Rahul","Rajesh","Ramesh","Suresh"};
		int[] empId={11046,11047,11048,11049,11050,11051};
		for (int i=0;i<empName.length ; i++){
			Employee emp = new Employee(empId[i],empName[i]);
			vec.add(emp);
		}
		System.out.println("Displaying Id of Employee using Iterator : ");
		itr=vec.iterator();
		while(itr.hasNext()){		
			ele= (Employee)itr.next();
			System.out.println(ele.getEmpId());
		}
		System.out.println("Displaying Names of Employee using Enumerator : ");
		enu=vec.elements();
		while(enu.hasMoreElements()){		
			ele= (Employee)enu.nextElement();
			System.out.println(ele.getEmpName());
		}
		
			
	}
}
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;	
import java.text.ParseException;

class Employee implements Serializable{
	String name;
	String department;
	String designation;
	double salary;
	Date dateOfBirth;
	Employee(){
		System.out.println("Constructor has been called ");
	}
	public String getName(){
		return this.name;
	}
	public String getDepartment(){
		return this.department;
	}
	public String getDesignation(){
		return this.designation;
	}
	public double getSalary(){
		return this.salary;
	}
	public Date getDateOfBirth(){
		return this.dateOfBirth;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setDepartment(String department){
		this.department=department;
	}
	public void setDesignation(String designation){
		this.designation = designation;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setDateOfBirth(Date dob){
		this.dateOfBirth=dob;
	}
}

class Assignment1{
	public static void main(String[] args){
		
		Employee emp= new Employee();		
		Employee emp2=null;
		emp.setName("Rajesh");
		emp.setDesignation("Computer administrator");
		emp.setDepartment("IT");
		emp.setSalary(300000);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			emp.setDateOfBirth(dateFormat.parse("12-9-1999"));
		} 
		catch (ParseException e) {
    
    			e.printStackTrace();
		}
		System.out.println("Deatils before Deserialization : ");
		System.out.println("Name : "+emp.getName()+"\nDesignation : "+emp.getDesignation()+"\nDepartment : "+emp.getDepartment()+"\nSalary : "+emp.getSalary()+"\nDate of Birth : "+emp.getDateOfBirth()); 
		
		try{
			FileOutputStream fos = new FileOutputStream("data");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.flush();
			oos.close();
		}
		catch(Exception e){
			System.out.println("Exception during Serialization");
			System.exit(0);
		}
		
		try{
			FileInputStream fis = new FileInputStream("data");
			ObjectInputStream ois = new ObjectInputStream(fis);
			emp2=(Employee)ois.readObject();
			System.out.println("Deatils after Deserialization : ");
			System.out.println("Name : "+emp2.getName()+"\nDesignation : "+emp2.getDesignation()+"\nDepartment : "+emp2.getDepartment()+"\nSalary : "+emp2.getSalary()+"\nDate of Birth : "+emp2.getDateOfBirth());
			ois.close();
		}
		catch(Exception e){
			System.out.println("Exception duriung Deserialization ");
			System.exit(0);
		}
	}
}
			
		
		
	
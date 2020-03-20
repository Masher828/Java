class Employee implements Cloneable{
	public int a;
	public double b;
	public Employee cloneTest(){
		try{
		return (Employee)super.clone();
	}
	catch (CloneNotSupportedException e) {
System.out.println("Cloning Not Allowed");
return this;
}
}
}
public class Assignment4{
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.a=10;
		emp.b=20;
		Employee emp2=emp.cloneTest();
		System.out.println("emp : "+emp.a+"  "+emp.b);
		System.out.println("emp2 : "+emp2.a+"  "+emp2.b);
		emp2.a=100;
		emp2.b=200;
		System.out.println("emp : "+emp.a+"  "+emp.b);
		System.out.println("emp2 : "+emp2.a+"  "+emp2.b);
	}
}
		
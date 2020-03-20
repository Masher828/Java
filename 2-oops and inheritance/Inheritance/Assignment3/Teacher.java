class Teacher extends Person{
	double salary;
	String subject;
	Teacher(double salary, String subject, String name, String DOB){
		super(name,DOB);
		this.salary=salary;
		this.subject=subject;
	}
	double getSalary(){
		return salary;
	}
	String getSubject(){
		return subject;
	}
}
	
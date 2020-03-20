class CollegeStudent extends Student{
	static String collegeName,student_year;
	CollegeStudent(String name, String dob, int id, String collegeName, String year){
		super(id,name,dob);
		this.collegeName=collegeName;
		student_year=year;
	}
	
	public static void main(String[] args){
		CollegeStudent college = new CollegeStudent("Manish","9-12-1998", 11046, "DGI", "fourth");
		Student stud = new Student(121,"Masher","16-01-1999");
		Person per = new Person("xyz","1-02-2001");
		Teacher teach= new Teacher(9000,"CS","Ruchi","21-2-2001");
		System.out.println("All the details of CollegeStudent Class \n");
		System.out.println("Name : "+college.getName()+" \nDOB : "+college.getDOB()+"\n Student id : "+college.getStudentId()+"\nYear : "+CollegeStudent.student_year);
		System.out.println("All the details of Student Class\n");
		System.out.println("\nId : "+stud.getStudentId()+"\nName : "+stud.getName()+"\n DOB : "+stud.getDOB());
		System.out.println("All the details of Teacher class \n");
		System.out.println("Name : "+teach.getName()+"\n DOB: "+teach.getDOB()+"\nSalary : "+teach.getSalary());
		System.out.println("All the details of Person Class \n");
		System.out.println("Name : "+per.getName()+"\nDOB: "+per.getDOB());
	}
}
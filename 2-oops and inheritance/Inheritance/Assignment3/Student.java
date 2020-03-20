class Student extends Person{
	int studentId;
	Student(int studentId,String name, String DOB){
		super(name,DOB);
		this.studentId=studentId;
	}
	int getStudentId(){
		return studentId;
	}
}
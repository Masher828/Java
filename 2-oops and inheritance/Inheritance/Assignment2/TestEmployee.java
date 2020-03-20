class TestEmployee{
	public static void main(String[] args){
		Employee emp =new Employee();
		Person per = new Person();
		
		emp.setAnnualSalary(32.0);
		emp.setJoiningYear(2019);
		emp.setNationalInsuranceNumber("56658775463");
		emp.setName("Manish");
		System.out.println(emp.getAnnualSalary()+"\n"+emp.getJoiningYear()+"\n"+emp.getNationalInsuranceNumber()+"\n"+emp.getName());
	}
}
		
class Employee extends Person{
	double annual_salary;
	int Joining_year;
	String NationalInsuranceNumber;
	void setAnnualSalary(double AnnualSalary){
		this.annual_salary=AnnualSalary;
	}
	void setJoiningYear(int JoiningYear){
		this.Joining_year=JoiningYear;
	}
	void setNationalInsuranceNumber(String NIN){
		this.NationalInsuranceNumber=NIN;
	}
	double getAnnualSalary(){
		return annual_salary;
	}
	int getJoiningYear(){
		return Joining_year;
	}
	String getNationalInsuranceNumber(){
		return NationalInsuranceNumber;
	}	
}
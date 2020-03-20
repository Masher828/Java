class Patient{
	String patientName;
	double height, weight;
	Patient(String patientName,double height,double weight){
		this.patientName=patientName;
		this.height=height;
		this.weight=weight;
	}
	double ComputeBMI(){
		double bmi;
		bmi=weight/(height*height);
		return bmi;
	}
}
class Assignment3{
	public static void main(String[] args){
		if (args.length<3){
			System.out.println("Please Enter the details through command line");
		}	
		else{
			double weight = Double.parseDouble(args[1]);
			double height = Double.parseDouble(args[2]);
			Patient obj = new Patient(args[0], height, weight);
			double bmi=obj.ComputeBMI();
			System.out.println(bmi);
		}
	}
}
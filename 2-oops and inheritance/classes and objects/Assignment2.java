import java.lang.*;
class Calculator{
	public static int powerInt(int num1, int num2){
		int power=1;
		for (int i=0;i<num2;i++){
			power=power*num1;
		}
		return power;
	}
	
	public static double powerInt(double num1, int num2){
		double power;
		power=Math.pow(num1,num2);
		return power;
	}
}

class Assignment2{
	public static void main(String[] args){
		if (args.length<3){
			System.out.println("Please enter intNum1, intNum2, doubleNum1");
		}
		else{
		Calculator obj = new Calculator();
		int num2;
		num2=Integer.parseInt(args[1]);
		int power,num1;
		num1=Integer.parseInt(args[0]);
		power=obj.powerInt(num1,num2);
		System.out.println(power);	
		double dpower,dnum1;
		dnum1=Double.parseDouble(args[2]);
		dpower=obj.powerInt(dnum1,num2);
		System.out.println(dpower);
		}
	}
}
abstract class GeneralBank{
	double SavingInterestRate, FixedDepositRate;
	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
	abstract void setSavingsInterestRate(double SavingInterestRate);
	abstract void setFixedDepositInterestRate(double FixedDepositRate);
	}

class ICICIBank extends GeneralBank{
	double getSavingsInterestRate(){
		return this.SavingInterestRate;
		}
	void setSavingsInterestRate(double SavingInterestRate){
		this.SavingInterestRate=SavingInterestRate;
		}
	double getFixedDepositInterestRate(){
		return FixedDepositRate;
		}
	void setFixedDepositInterestRate(double FixedDepositRate){
		this.FixedDepositRate=FixedDepositRate;
	}
}
class KotMBank extends GeneralBank{
	double getSavingsInterestRate(){
		return this.SavingInterestRate;
		}
	void setSavingsInterestRate(double SavingInterestRate){
		this.SavingInterestRate=SavingInterestRate;
		}
	double getFixedDepositInterestRate(){
		return FixedDepositRate;
		}
	void setFixedDepositInterestRate(double FixedDepositRate){
		this.FixedDepositRate=FixedDepositRate;
	}
}
public class Assignment1{
	public static void main(String[] args){
		System.out.println("ICICI Bank using ICICIBank as reference ");
		ICICIBank i=new ICICIBank();
		i.setSavingsInterestRate(4);
		i.setFixedDepositInterestRate(8.5);
		System.out.println("Savings "+i.getSavingsInterestRate()+"% , Fixed "+i.getFixedDepositInterestRate()+"%");

		System.out.println("Kot M Bank using KotMBank as reference ");
		KotMBank k=new KotMBank();
		k.setSavingsInterestRate(6);
		k.setFixedDepositInterestRate(9);
		System.out.println("Savings "+k.getSavingsInterestRate()+"% , Fixed "+k.getFixedDepositInterestRate()+"%");

		System.out.println("Kot M Bank using GeneralBank as reference ");
		GeneralBank g=new KotMBank();
		g.setSavingsInterestRate(6);
		g.setFixedDepositInterestRate(9);
		System.out.println("Savings "+g.getSavingsInterestRate()+"% , Fixed "+g.getFixedDepositInterestRate()+"%");

		System.out.println("ICICI Bank using GeneralBank as reference ");
		GeneralBank g1=new ICICIBank();
		g1.setSavingsInterestRate(4);
		g1.setFixedDepositInterestRate(8.5);
		System.out.println("Savings "+g1.getSavingsInterestRate()+"% , Fixed "+g1.getFixedDepositInterestRate()+"%");
	}
}
		
		
		
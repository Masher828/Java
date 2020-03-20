package service;

import exception.NegativeValueException;
import exception.TypeOfAccountException;
public class SBAccount extends Account {
    double interestRate;
    double amount;
    String typeOfAccount;

    public void setAmount(double amount) throws NegativeValueException {
        if(amount<0){
            throw  new NegativeValueException("Invalid amount. Please enter non-negative value");
        }
        this.amount = amount;
    }
    public void setTypeOfAccount(String typeOfAccount) throws TypeOfAccountException{
        if (!(typeOfAccount.equalsIgnoreCase("nri")|| typeOfAccount.equalsIgnoreCase("normal"))){
            throw  new TypeOfAccountException("Not a Valid type of account, please enter either NRI or Normal account");
        }
        this.typeOfAccount=typeOfAccount;
    }

    public double calculateInterest(){
        if (typeOfAccount.equalsIgnoreCase("NRI")){
            interestRate=6;
        }
        else if (typeOfAccount.equalsIgnoreCase("normal")){
            interestRate=4;
        }

        return (amount * interestRate)/100;
    }
}

package service;

import exception.NegativeValueException;

public class RDAccount extends Account {
    double interestRate;
    double amount;
    int noOfMonths;
    double monthlyAmount;
    int ageOfACHolder;

    public void setAmount(double amount) throws NegativeValueException {
        if (amount<0){
            throw new NegativeValueException("Invalid amount. Please enter non-negative value");
        }
        this.amount=amount;
    }
    public void setNoOfMonths(int noOfMonths) throws NegativeValueException{
        if(noOfMonths<0){
            throw new NegativeValueException("Invalid Month. Please enter non-negative value");
        }
        this.noOfMonths=noOfMonths;
    }
    public void setAgeOfACHolder(int ageOfACHolder) throws NegativeValueException{
        if(ageOfACHolder<0){
            throw new NegativeValueException("Invalid Age. Please enter non-negative value");
        }
        this.ageOfACHolder=ageOfACHolder;
    }
    public double calculateInterest(){
        if (ageOfACHolder < 60) {
            if (noOfMonths == 6) {
                interestRate = 7.50;
            } else if (noOfMonths == 9) {
                interestRate = 7.75;
            } else if (noOfMonths == 12) {
                interestRate = 8.00;
            } else if (noOfMonths == 15) {
                interestRate = 8.25;
            } else if (noOfMonths == 18) {
                interestRate = 8.50;
            } else if (noOfMonths == 21) {
                interestRate = 8.75;
            }
        } else {
            if (noOfMonths == 6) {
                interestRate = 8.00;
            } else if (noOfMonths == 9) {
                interestRate = 8.25;
            } else if (noOfMonths == 12) {
                interestRate = 8.50;
            } else if (noOfMonths == 15) {
                interestRate = 8.75;
            } else if (noOfMonths == 18) {
                interestRate = 9.00;
            } else if (noOfMonths == 21) {
                interestRate = 9.25;
            }
        }
        return (amount * interestRate)/100;
    }

}

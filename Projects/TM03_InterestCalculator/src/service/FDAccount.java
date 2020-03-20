package service;
import exception.NegativeValueException;

public class FDAccount extends Account{
    double interestRate;
    double amount;
    int noOfDays;
    int ageOfACHolder;

    public void setAmount (double amount) throws NegativeValueException {
        if(amount<0){
            throw new NegativeValueException("Invalid amount. Please enter non-negative values");
        }
            this.amount =amount;
    }
    public void setNoOfDays(int noOfDays) throws NegativeValueException {
        if (noOfDays<0){
            throw new NegativeValueException("Invalid Number of days. Please enter non-negative values");
        }
        this.noOfDays=noOfDays;
    }
    public void setAgeOfACHolder(int ageOfACHolder) throws NegativeValueException {
        if (ageOfACHolder<0){
            throw new NegativeValueException("Invalid Age. Please enter non-negative value");
        }
        this.ageOfACHolder=ageOfACHolder;
    }
    @Override
    public double calculateInterest() {
        if (amount<10000000) {
            if (ageOfACHolder < 60) {
                if (noOfDays >= 7 && noOfDays <= 14) {
                    interestRate = 4.50;
                } else if (noOfDays >= 15 && noOfDays <= 29) {
                    interestRate = 4.75;
                } else if (noOfDays >= 30 && noOfDays <= 45) {
                    interestRate = 5.50;
                } else if (noOfDays >= 45 && noOfDays <= 60) {
                    interestRate = 7;
                } else if (noOfDays >= 61 && noOfDays <= 184) {
                    interestRate = 7.50;
                } else if (noOfDays >= 185 && noOfDays <= 365) {
                    interestRate = 8.00;
                }
            }
            else {
                if (noOfDays >= 7 && noOfDays <= 14) {
                    interestRate = 5.00;
                } else if (noOfDays >= 15 && noOfDays <= 29) {
                    interestRate = 5.25;
                } else if (noOfDays >= 30 && noOfDays <= 45) {
                    interestRate = 6.00;
                } else if (noOfDays >= 45 && noOfDays <= 60) {
                    interestRate = 7.50;
                } else if (noOfDays >= 61 && noOfDays <= 184) {
                    interestRate = 8.00;
                } else if (noOfDays >= 185 && noOfDays <= 365) {
                    interestRate = 8.50;
                }
            }
        }
        else{
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = 6.50;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate = 6.75;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                interestRate = 6.75;
            } else if (noOfDays >= 45 && noOfDays <= 60) {
                interestRate = 8;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate = 8.50;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = 10.00;
            }
        }
        return (amount * interestRate)/100 ;
    }
}

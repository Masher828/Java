package service;

import exception.NegativeValueException;
import exception.TypeOfAccountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterestCalculatorTest {
    FDAccount FD = new FDAccount();
    RDAccount RD = new RDAccount();
    SBAccount SB = new SBAccount();
    @Test
    void FDAccountTest() throws NegativeValueException {
        FD.setAgeOfACHolder(63);
        FD.setAmount(10000);
        FD.setNoOfDays(91);
        assertEquals(800,FD.calculateInterest());
        FD.setAgeOfACHolder(13);
        FD.setAmount(10000);
        FD.setNoOfDays(13);
        assertEquals(450,FD.calculateInterest());
        FD.setAgeOfACHolder(80);
        FD.setAmount(10000);
        FD.setNoOfDays(186);
        assertEquals(850,FD.calculateInterest());
        FD.setAgeOfACHolder(50);
        FD.setAmount(10000);
        FD.setNoOfDays(50);
        assertEquals(700,FD.calculateInterest());
    }

    @Test
    void RDAccountTest() throws NegativeValueException {
        RD.setAmount(10000);
        RD.setAgeOfACHolder(11);
        RD.setNoOfMonths(6);
        assertEquals(750,RD.calculateInterest());
        RD.setAmount(20000);
        RD.setAgeOfACHolder(64);
        RD.setNoOfMonths(18);
        assertEquals(1800,RD.calculateInterest());
    }

    @Test
    void SBAccountTest() throws NegativeValueException, TypeOfAccountException {
        SB.setAmount(60000);
        SB.setTypeOfAccount("NRI");
        assertEquals(3600,SB.calculateInterest());
        SB.setAmount(10000);
        SB.setTypeOfAccount("NORMAL");
        assertEquals(400, SB.calculateInterest());
    }


}
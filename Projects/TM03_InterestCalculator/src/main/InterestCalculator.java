package main;
import exception.NegativeValueException;
import exception.TypeOfAccountException;
import service.FDAccount;
import service.RDAccount;
import service.SBAccount;
import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) throws NegativeValueException, TypeOfAccountException {
        int choice;
        Scanner in = new Scanner(System.in);
        SBAccount SB = new SBAccount();
        FDAccount FD = new FDAccount();
        RDAccount RD = new RDAccount();
        double amount=0;
        int days,age;
        do{
            System.out.println("MAIN MENU\n" +
                    "---------\n" +
                    "1. Interest Calculator – SB\n" +
                    "2. Interest Calculator – FD\n" +
                    "3. Interest Calculator – RD\n" +
                    "4. Exit\n" +
                    "Enter your option (1..4):");
            choice = in.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter the Average amount in your account: ");
                        amount = in.nextDouble();
                        SB.setAmount(amount);
                        System.out.println("\nEnter Type of Account: ");
                        String type = in.next();
                        SB.setTypeOfAccount(type);
                        System.out.println("Interest gained: " + SB.calculateInterest());
                        break;

                    case 2:
                        System.out.print("\nEnter the FD amount: ");
                        amount = in.nextDouble();
                        FD.setAmount(amount);
                        System.out.print("\nEnter the number of days: ");
                        days = in.nextInt();
                        FD.setNoOfDays(days);
                        System.out.println("\nEnter your age: ");
                        age = in.nextInt();
                        FD.setAgeOfACHolder(age);
                        System.out.println("Interest gained is: " + FD.calculateInterest());
                        break;

                    case 3:
                        System.out.print("\nEnter the RD amount: ");
                        amount = in.nextDouble();
                        RD.setAmount(amount);
                        System.out.print("\nEnter the number of months: ");
                        int months = in.nextInt();
                        RD.setNoOfMonths(months);
                        System.out.println("\nEnter your age: ");
                        age = in.nextInt();
                        RD.setAgeOfACHolder(age);
                        System.out.println("Interest gained is: " + RD.calculateInterest());
                        break;

                    case 4:
                        System.out.println("Exiting...!! Thanks for using the application.\n");
                        choice = -1;
                        break;

                    default:
                        System.out.println("Wrong choice...\n Try again\n");
                        break;
                }
            }
            catch(NegativeValueException e){
                System.out.println(e);
            }
            catch(TypeOfAccountException e){
                System.out.println(e);
            }
            catch (Exception e){
                System.out.println(e);
            }
            }while(choice>0);
        }
    }


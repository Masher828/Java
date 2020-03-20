import java.util.*;
public class FlowControlStatements14{
    public static void main(String args[])
    {   if (args.length ==0){
        System.out.println("Please enter an integer number");
        }
        else{
            int a = Integer.parseInt(args[0]);

        if (a==1){
            System.out.println("1 is neither prime nor composite");
        }
        else if (a==0){
            System.out.println("0 is neither prime nor composite");
        }
        else{
            int temp=1;
        for(int i =2;i<a;i++){
            if (a%i==0){
                temp=0;
                break;
            }

        }
        if(temp==1){
            System.out.println(a+" is a prime");
        }
        else{
            System.out.println(a+" is not a prime");
        }
    }}
    }
}
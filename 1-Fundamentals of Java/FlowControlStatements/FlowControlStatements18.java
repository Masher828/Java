import java.util.*;
public class FlowControlStatements18{
    public static void main(String args[]){
       int num = Integer.parseInt(args[0]);
       int num_temp=num;
        int rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        if(num_temp==rev_num){
            System.out.println(num_temp+" is a palindrome");
        }
        else{
            System.out.println(num_temp+" is not a palindrome");
        }
    }
}
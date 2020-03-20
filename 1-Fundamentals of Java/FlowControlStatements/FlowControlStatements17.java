import java.util.*;
public class FlowControlStatements17{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();
        int rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev_num);
    }
}
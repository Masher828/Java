import java.util.*;
public class FlowControlStatements15{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum;
        for (sum = 0; a > 0; sum += a % 10,
                a /= 10);
        System.out.println(sum);
    }
}
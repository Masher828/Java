import java.util.*;
public class FlowControlStatements2 {
    public  static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if ((a&1)==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
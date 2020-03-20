import java.util.*;
public class FlowControlStatements7{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        int b= (int) a;
        if(b>=97 && b<=122){
            b=b-32;
            a= (char) b;
            System.out.println(a);
        }
        else if (b>=65 && b<=90){
            b=b+32;
            a= (char) b;
            System.out.println(a);
        }
        else{
            System.out.println("invalid input");
        }

    }
}
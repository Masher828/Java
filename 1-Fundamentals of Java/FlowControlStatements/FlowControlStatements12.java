import java.util.*;
public class FlowControlStatements12{
    public static void main(String args[])
    {   Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int temp=1;
        for(int i =2;i<a;i++){
            if (a%i==0){
                temp=0;
                break;
            }

        }
        if(temp==1){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
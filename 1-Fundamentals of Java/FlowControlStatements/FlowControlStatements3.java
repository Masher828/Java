import java.util.*;
public class FlowControlStatements3{
    public  static void main(String args[]){
        int a = args.length;
        if (a==0){
            System.out.println("No values");
        }
        else{
            for(String i:args){
            System.out.print(i);
            if(a>1){
                System.out.print(",");
                a--;
            }
        }}
    }
}
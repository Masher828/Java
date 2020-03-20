import java.util.*;
public class FlowControlStatements13{
    public static void main(String args[])
    {
        for(int i =10;i<=99;i++){
            int temp=1;
            for(int j =2;j<i;j++){
                if (i%j==0){
                temp=0;
                break;
            }}

        if(temp==1){
            System.out.println(i);
        }

    }
    }
}
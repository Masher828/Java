public class FlowControlStatements19{
    public static void main(String args[]){
       int i=1,f=0;
       while(i>0){
           if (f==5){
               break;
           }
           if(i%2==0&&i%3==0&&i%5==0){
               System.out.println(i);
               f++;
           }
           i++;
       }
        }
    }

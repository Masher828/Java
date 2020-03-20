import java.util.*;
public class FlowControlStatements8{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        switch (a){
            case 'R': System.out.println("Red");
                        break;
            case 'W': System.out.println("White");
                break;
            case 'B': System.out.println("Blue");
                break;
            case 'G': System.out.println("Green");
                break;
            case 'Y': System.out.println("Yellow");
                break;
            case 'O': System.out.println("Orange");
                break;
            default:System.out.println("Invalid Code");
                break;


        }
    }
}
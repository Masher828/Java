import java.util.*;
public class Array8{
    public static int sum(int[] a){
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 6) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] == 7) {
                        i = j+1;
                        break;
                    }
                }
            }
            sum1 += a[i];
        }


        return sum1;
    }
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int sum1=sum(a);
        System.out.println(sum1);
        }
    }

import java.util.Scanner;
public class Array3
{
    public static void main(String[] args)
    {
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
        System.out.println("Enter the element you want to find:");
        int find = s.nextInt();
        int temp=0;
        for(int i=0;i<n;i++){
            if(a[i]==find){
                System.out.println(i);
                temp=1;
                break;
            }
        }
        if(temp==0){
            System.out.println(-1);
        }

    }
}
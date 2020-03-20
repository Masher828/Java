import java.util.Arrays;
public class Array7 {
    public static void main(String args[]) {
        int[] arr = {11, 22, 33, 545, 44, 33, 55, 22};
        int n = arr.length;
        int[] b=new int[n];
        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                b[j++] = arr[i];
            }
        }
        b[j++] = arr[n - 1];
        for (int i=0;i<j;i++) {
            System.out.println(b[i] + " ");
        }
    }
}
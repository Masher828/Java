public class Array6{
    public static void main(String[] args){
        int[] a = {44,55,2,26,11,222,54};
        int temp;
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
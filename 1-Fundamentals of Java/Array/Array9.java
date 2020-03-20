public class Array9{
    public static void main(String args[])
    {   int fir=0,sec=0;
        int [][] a={{1,2},{3,4}};
        int [][] b = new int[2][2];
        for(int i=1;i>=0;i--)
        {
            for (int j=1;j>=0;j--){

                b[fir][sec]=a[i][j];
                sec++;
            }
            sec=0;
            fir++;
        }
        for(int i=0;i<b.length;i++){
            for (int j=0;j<b.length;j++) {
                System.out.print(b[i][j]);
            }System.out.println("");
        }

    }

}
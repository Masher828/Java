public class Array2{
    public static void main(String args[]) {
        int[] arr = {22,33,11,4,2,444,99,1};
        int min=arr[0];
        int max = arr[0];
        for(int i: arr){
            if (i<min){
                min=i;
            }
            else if (i>max){
                max=i;
            }
        }
        System.out.println("max: "+max+" and "+"min:"+min);

    }
}
public class Array1{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        int avg = sum/arr.length;
        System.out.println("The sum and average of the array are:"+sum+" and "+avg);
    }
}
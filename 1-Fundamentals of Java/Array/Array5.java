public class Array5{
    public static void min2num(int[] arr){
        int min1=arr[0];
        int min2=arr[1];
        for(int i =2;i<arr.length;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2 && arr[i]!=min1 )
                min2=arr[i];
        }
        System.out.println("the smallest and secodn smallest elements are:"+min1+" and "+min2);
    }
    public static void max2num(int[] arr){
        int max1=arr[0];
        int max2=arr[1];
        for(int i =2;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max1 )
                max2=arr[i];
        }
        System.out.println("the largest and second largest elements are:"+max1+" and "+max2);
    }
    public static void main(String args[]) {
        int[] arr = {22,33,11,4,7,444,99,1};
        min2num(arr);
        max2num(arr);

    }
}
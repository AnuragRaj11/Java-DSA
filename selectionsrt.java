import java.util.Arrays;

public class selectionsrt {
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getmax(int[]arr,int s,int e){
        int max=s;
        for(int i=s;i<=e;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void selection(int[] arr){
        for (int i=0;i<arr.length;i++){
            int last=arr.length-1-i;
            int maxi=getmax(arr, 0, last);
            swap(arr,maxi,last);
    }
}
    public static void main(String[] args) {
        int []arr={51,2,8,4,9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class bubblesrt {
    static void bubble(int[] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(Stringg[] args) {
        int []arr={5,2,8,4,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class insetionsrt {
    static void insertion(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(Stringg[] args) {
        int []arr={5,-2,8,3,9};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}

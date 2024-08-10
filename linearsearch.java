import java.util.*;

public class linearsearch {
    public static void main(String args[]) {
        int [] arr={1,6,5,4,7};
        int target=6;
        int ans= ls(arr, target);
        System.out.println(ans);

    }
    static int ls(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            int e=arr[i];
            if(e==target){
                 return i;}   
        }
        return -1;
    }
}
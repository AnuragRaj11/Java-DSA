public class binearsearch {
    public static void main(String args[]) {
        int [] arr={2,6,5,4,7,8,9,77,88,32,22};
        int target=88;
        int ans= bss(arr, target);
        System.out.println(ans);

    }
    static int bss(int[] arr,int target){
       int s=0;
       int e=arr.length-1;
       while(s<=e){
        int mid=s+(e-s)/2;
        if(target<arr[mid]){
            e=mid-1;
        }
        else if (target>arr[mid]){
            s=mid+1;
        }
        else{
            return mid;
        }
       }
       return -1;
    }
}

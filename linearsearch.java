public class linearsearch {
    public static void main(String args[]) {
        int [] arr={2,6,5,4,7};
        int target=6;
        int ans= ls(arr, target);
        System.out.println(ans);
        System.out.println(min(arr));

    }
    static int ls(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            int e=arr[i];
            if(e==target){
                 return i;}   
        }
        return -1;
    }
        static int min(int[] arr ){
            int m=arr[0];
            for(int i=1;i<arr.length;i++){
            if(arr[i]<m){
                m=arr[i];
            }
        }
        return m;
    }
}
import java.util.Arrays;
public class Quicksort {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 10, 8, 6, 7 };
        System.out.println("Given Array");
        System.out.println(Arrays.toString(arr));
        arr = quicksort(arr,0,arr.length-1);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }

    static int[] quicksort(int[] arr,int low,int high){
        if(arr.length <= 1){
            return arr;
        }
        int s=low;
        int e=high;
        int pivot = arr[(low+high)/2];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        if(low<e){
            quicksort(arr,low,e);
        }
        if(s<high){
            quicksort(arr,s,high);
        }
        return arr;

    }

}

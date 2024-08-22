import java.util.Arrays;

public class bs2D {
    public static void main(Stringg args[]) {
        int [][] arr={
            {2,6,5,4},
            {7,8,9,77},
            {88,32,22,72},
            {23,55,89,64}
        };
        System.out.println(Arrays.toString(bs2d(arr, 55)));

    }
    static int[] bs2d(int[] []matrix,int target){
       int r=0;
       int c=matrix[0].length-1;
       while(r<matrix.length && c>=0){
        if(matrix [r][c]==target){
            return new int[]{r,c};
        }
        else if (matrix[r][c]<target){
            r++;
        }
        else{
            c--;
        }
       }
       return new int []{-1,-1};
    }
}

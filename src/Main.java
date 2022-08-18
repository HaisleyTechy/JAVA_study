import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] output = Solution.bubbleSort(new int[]{5,4,3,2,1});
        System.out.println(Arrays.toString(output));
    }
   public static class Solution {
        public static int[] bubbleSort(int[] arr) {
            int count = 0 ;
            int YoN = 1 ;
            return Solution.swap(count,YoN,arr);
        }
        public static int[] swap (int count, int YoN, int[]arr){

            if (YoN ==0||arr.length==0) return arr ;

            for(int i=0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    int a = arr[i] ;
                    arr[i] = arr [i+1];
                    arr[i+1] = a ;
                    count ++;
                }
            }
            if(count>0) YoN = 1;
            if(count==0) YoN = 0;
            count = 0;
            return swap(count,YoN,arr) ;
        }
    }
}



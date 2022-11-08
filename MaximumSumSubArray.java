package Array;

public class MaximumSumSubArray {

    static int maximumSumSubArray(int arr[]){
        /*
         * //time complexity = O(n2);
         * int result = arr[0];
         * int n = arr.length;
         * for(int i=0;i<n;i++){
         * int current =0;
         * for(int j=i;j<n;j++){
         * current = current+arr[j];
         * result = Math.max(current,result);
         * }
         * }
         * return result;
         */

        int n = arr.length;
        int result = arr[0];
        int maxEnd = arr[0];
        for(int j=1;j<n;j++){
            maxEnd = Math.max(maxEnd+arr[j], arr[j]);
            result = Math.max(result, maxEnd);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,-8,7,-1,2,3};
        System.out.println(maximumSumSubArray(arr));
        
    }
    
}

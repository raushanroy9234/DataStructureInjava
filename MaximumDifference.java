package Array;

public class MaximumDifference {

   static int maximumDifference(int arr[]){
    int n = arr.length;
    int result = arr[1]-arr[0];
    int minDiff = arr[0];
    for(int i=1;i<n;i++){
        result = Math.max(result, arr[i]-minDiff);
        minDiff = Math.min(minDiff,arr[i]);
    }
    return result;
   }

    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        System.out.println(maximumDifference(arr));
    }
    
}

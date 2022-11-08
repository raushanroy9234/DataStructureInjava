package Array;

public class LongestEvenOddSubArray {

    static int longestEvenoddSubArray(int arr[])
    {
       
      int n = arr.length;
      int count = 1;
      int result = 1;
      for(int j=1;j<n;j++)
      {
        if((arr[j]%2 == 0 && arr[j-1]%2 != 0) || (arr[j]%2 != 0 && arr[j-1]%2 == 0))
        {
            count++;
            result = Math.max(result, count);
        }
        else
        {
            count = 1;
        }
      }
      return result;
         
    }
    
    public static void main(String[] args) {
        int arr[] = {5,10,11,20,3,6,8};
        System.out.println(longestEvenoddSubArray(arr));
    }
}

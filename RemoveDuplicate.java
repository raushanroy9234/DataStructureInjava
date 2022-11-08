package Array;

public class RemoveDuplicate {

    static int[] removeDuplicate(int arr[]){
     /*
      * int result = 1;
      * for(int i=1;i<arr.length;i++){
      * if(arr[i] != arr[result-1]){
      * arr[result] = arr[i];
      * result++;
      * }
      * }
      * return result;
      */

      int count = 1;
      int n = arr.length;
      int temp[]  = new int[n];
      temp[0] =arr[0];
      for(int i=1;i<n;i++){
        if(arr[i] != arr[i-1]){
          temp[count] = arr[i];
          count++;
        }
      }
      return temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,3,8,8};
        int arr1[] = removeDuplicate(arr);
        for(int a:arr1)System.out.print(a+" ");
       
    }
    
}

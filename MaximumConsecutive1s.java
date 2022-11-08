package Array;

public class MaximumConsecutive1s {

   
        /*
         * //time complexity is O(n2)
         * int result = 0;
         * int n = arr.length;
         * for(int i=0;i<n;i++){
         * int current = 0;
         * for(int j=i;j<n;j++){
         * if(arr[j] == 1){
         * current += 1;
         * }
         * else{
         * break;
         * }
         * }
         * result = Math.max(current, result);
         * }
         * return result;
         */

         static int  max1s(int arr[])
         {
            int n = arr.length;
            int count = 0;
            int result = 0;
            for(int i=0;i<n;i++){
                if(arr[i] == 0){
                    count=0;
                }
                else{
                    count++;
                    result = Math.max(result, count);
                }
            }
         return result;
        }

    public static void main(String[] args) {
        int arr[] = {0,1,0,0,1,1,1,0};
        System.out.println(max1s(arr));

    }
    
}

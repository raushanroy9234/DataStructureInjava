package Array;

public class MoveAllZeroToEnd {

    static void moveZero(int arr[]){

        //this is quadratic time complexity
        /*
         * int n = arr.length;
         * for(int i=0;i<n;i++){
         * if(arr[i] == 0){
         * for(int j=i+1;j<n;j++){
         * if(arr[j] != 0){
         * int temp = arr[i];
         * arr[i] = arr[j];
         * arr[j] = temp;
         * }
         * }
         * }
         * }
         */
        
         int count = 0;
         for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
         }
    }

    public static void main(String[] args) {
        int arr[] = {0,0,5,0,9,0}; 
        moveZero(arr); 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
       
    
}

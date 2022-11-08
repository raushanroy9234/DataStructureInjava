package Array;

public class LargestElement {

    static int largest(int arr[]){
        int largest = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[largest]){
                largest = i;
            }
        }
        return largest;
    }

    static int getSecondLargest(int arr[]){
        int largest = largest(arr);
        int result = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[largest]){
                if(result == -1){
                    result = i;
                }
                else if(arr[i] > arr[result]){
                    result = i;
                }
            }
        }
        return result;
    }
    //time complexity O(n)

    public static void main(String[] args) {
        int arr [] = {190,20,890,40,50};
        System.out.println(getSecondLargest(arr));
    }
    
}



package Array;

public class SecondLargest {

    static int getSecondLargest(int arr[]){
       
        int largest = arr[0];
        int secondLargest = 0;
        int thirdLargest = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                //thirdLargest = secondLargest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else if(arr[i] > thirdLargest){
                thirdLargest = arr[i];
            }
        }
        return thirdLargest;
    }

    public static void main(String[] args) {
        
        int arr [] = {2 ,13, 4,12,11,6};
        //int arr1 [] = {10,10,10};
        System.out.println(getSecondLargest(arr));
    }
    
}

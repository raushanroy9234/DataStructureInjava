package Array;

public class FrequenciesSortedArray {

    static void frequenciesSortedArray(int arr[]){
        int start = 1;
        int end = arr.length-1;
        int freq = 1;
        while(start < end){
            while(start < end && arr[start] == arr[start-1]){
                start++;
                freq++;
            }
            System.out.println(arr[start-1]+ "   " + freq);
            start++;
            freq=1;
        }
        if(end == 0 || arr[end] != arr[end-1]){
            System.out.println(arr[end] + "   "+ 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,10,10,20,20,30,30,30,40};
        frequenciesSortedArray(arr);
    }
    
}

package Array;

public class Reverse {

    static void reverse(int arr[]){
        int start = 0;
        int end   = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        reverse(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    
}

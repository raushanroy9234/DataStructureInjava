package Array;

//it means move element left side by one in clockWise manner

public class LeftRotateArrayByOne {
    static void leftRotate(int arr[]){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        leftRotate(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    
}

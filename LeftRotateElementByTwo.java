package Array;

public class LeftRotateElementByTwo {

    static void LeftRotateByD(int arr[],int d){
        int temp[] = new int[d];
        for(int i=0;i<d;i++)
               temp[i] = arr[i];

        for(int i=d;i<arr.length;i++)
               arr[i-d] = arr[i];

        for(int i=0;i<d;i++)
               arr[arr.length-d+i] = temp[i];

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        LeftRotateByD(arr,2);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    
}

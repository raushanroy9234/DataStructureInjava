package Array;

public class LeftRotationByK {

    static void leftRotate(char arr[],int k)
    {
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
    }

    static void reverse(char arr[],int start,int end){
        while(start <end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) 
    {
        //int arr[] = {1,2,3,4,5};
        char str[] = {'g','e','e','k','s'};
        int k =1;
        leftRotate(str, k);
        for(char a:str)
        {
            System.out.print(a+" ");
        }
    }
    
}

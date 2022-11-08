package Array;

public class RigthRotateByK {
    static void rightRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n -1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4,5};
        int k = 4;
        rightRotate(arr, k);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
    
}

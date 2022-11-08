package Array;

public class Delete {

    static int delteElement(int arr[],int x ,int n){
        int i;
        for(i=0;i<n;i++){
            if(arr[i] == x){
                break;
            }
        }
        if(i==n)return n;
        for(int j=i+1;j<n;j++){
            arr[j-1] = arr[j];
        }
        return n-1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int x = 2;
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        n =delteElement(arr, x, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

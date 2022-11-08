package Array;

public class Search {

    static int search(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr [] = {10,70,68,76};
        int n = arr.length;
        int x = 76;
        System.out.println(search(arr, n, x));
    }
    
}

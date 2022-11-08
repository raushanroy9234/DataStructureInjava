package Array;

// leader element = a element is called leader when there is no element greater than it on right side
public class LeaderElement {

   static void leaderElement(int arr[]){
    int n = arr.length;
    int currentLeader = arr[n-1];
    System.out.print(currentLeader+" ");
    for(int i=n-2;i>=0;i--){
        if(arr[i] > currentLeader){
            currentLeader = arr[i];
            System.out.print(currentLeader + " ");
        }
           
    }
   }

    public static void main(String[] args) {
        int arr[] = {9,8,4,2,7};
        leaderElement(arr);
    }
    
}

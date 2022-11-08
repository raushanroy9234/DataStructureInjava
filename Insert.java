package Array;

class Insert{
    static int insert(int arr[],int size,int capacity,int element,int position){
        if(size == capacity)return size;

        for(int i=size-1;i>=position-1;i--){
            arr[i+1] = arr[i];
        }
        arr[position-1] = element;
        return size+1; 
    }

    public static void main(String args[]) 
    { 
       int arr[] = new int[5], capacity = 5, size = 3, position =1 ,element = 110;

       arr[0] = 5; arr[1] = 10; arr[2] = 20;
       System.out.println(insert(arr, size, capacity, element, position));
       for(int a:arr){
        System.out.print(a+" ");
       }

    }
}
// https://github.com/geeksterin/July-22KS

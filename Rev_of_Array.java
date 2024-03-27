import java.util.Arrays;

public class Rev_of_Array {
    public static int[] rev(int[] arr , int s, int e){
        if(s == e)
        return arr;
    
    if(s < e){
        int temp = arr[s];
        arr[s] = arr [e];
        arr[e] = temp; 
    }
    return rev(arr, s+1, e -1);


    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = rev(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
}

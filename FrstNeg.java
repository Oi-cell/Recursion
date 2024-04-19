import java.util.Deque;
import java.util.LinkedList;

public class FrstNeg {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>(); 
        int arr[] = {-2,1,-3,4,-5,-6,-7,8};
        int k = 3;
        //int ans[]  = new int[arr.length - k + 1];
        int i = 0, j = 0;
        int m = 0;
        while(j < arr.length){
            if(arr[j] < 0){
                q.add(arr[j]);
            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                System.out.print(q.peekFirst());
                if(arr[i] < 0){
                    q.removeFirst();
                }
                i++;
                j++; 
               
            }
        }
       // System.out.print(max);
    }
}

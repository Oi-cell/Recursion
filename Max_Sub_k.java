import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
public class Max_Sub_k {
public void find_max(int[] arr, int k){
    int i = 0, j = 0;
    Deque<Integer> st = new LinkedList<>();
    int[] ans = new int[arr.length - k + 1];
    while(j < arr.length){
        if(st.size() == 0){
            st.add(arr[j]);
        }
        else if(arr[j] > st.peekLast()){
            while(arr[j] > st.peekLast() && !st.isEmpty()){
                st.removeLast();
            }
            st.push(arr[j]);

        }
        else if((j-i+1) < k){
            j++;
        }
        else if((j-i+1) == k){
            ans[i] = st.peek();
            if(arr[i] == st.peek()){
                st.removeFirst();
            }
            i++;
            j++;
        }
    }
    System.out.print(Arrays.toString(ans));

} 
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,3,9,0,2};
        int k = 3;
        Max_Sub_k obj = new Max_Sub_k();
        int[] ans = new int[arr.length - k + 1];
        obj.find_max(arr, k);
        //System.out.println(Arrays.toString(ans));
        
    }
}

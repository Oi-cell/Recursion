public class SumOfArray {
    public static int sum(int[] arr , int s, int sum){
        if(arr.length == 1){
            sum = arr[s];
            return sum;

        }
        sum += arr[s];
        if(s>0)
        return sum(arr, s - 1, sum);

        return sum;
        
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int ans = sum(arr,arr.length -1 ,0);
        System.out.println(ans);
    }
}

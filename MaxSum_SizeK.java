public class MaxSum_SizeK {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5,6,7,8};
        int k = 3;
        //int ans[]  = new int[arr.length - k + 1];
        int i = 0, j = 0;
        int max = 0, sum = 0;
        while(j < arr.length){
            //int sum = 0;
            sum += arr[j];
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
                j++; 
               
            }
        }
        System.out.print(max);
    }
}

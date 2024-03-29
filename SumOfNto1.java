public class SumOfNto1 {
   public static void sum(int n, int s){
    if(n == 1){
        System.out.println(s);
        return;
    }
    
   
   s += n;
   sum( n-1 , s);
   }
   public static void main(String[] args) {
      sum(10,0);
   }

}

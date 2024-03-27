public class fibonaci {
    public static int fib(int n){
        if(n<2){
            return 1;
        }
        return fib(n-1) + fib (n-2);
    }
    public static void main(String[] args) {
         int n =  fib(5);
         System.out.println(n);
    }
}

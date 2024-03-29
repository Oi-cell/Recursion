public class Cnt_0 {
    public static int cnt(int n , int c){
        if(n == 0){
            //System.out.println(c);
            return c;
            
        }
        if(n > 0){
            if(n % 10 == 0){
            return cnt(n/10, c +1);

            }
            return cnt(n/10, c);

        }
        return c;
    }
    public static void main(String[] args) {
        int ans = cnt(10001,0);
        System.out.println(ans);
    }
}

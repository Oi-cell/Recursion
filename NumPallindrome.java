public class NumPallindrome {
    public static int check(int n, int temp) {
        if (n == 0) {
            return temp;
        }
        temp = temp * 10 + (n % 10);
        return check(n / 10, temp);

    }

    public static void main(String[] args) {
        int n = 121;
         int t = check(n,0);
         if(t == n)
         System.out.println("yes");
         else
         System.out.println("N0");
    }
}

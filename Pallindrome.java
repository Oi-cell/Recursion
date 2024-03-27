public class Pallindrome {

    public boolean checkPalindrome(String str, int s, int e){
        if(s == e){
            return true;
        }
        if(str.charAt(s) != str.charAt(e)){
            return false;
        }
        if(s < e){
            checkPalindrome(str, s+1, e-1);
        }
        return true;

    }
    public static void main(String[] args) {
        Pallindrome obj = new Pallindrome();
       System.out.println( obj.checkPalindrome("aba", 0, 2));

    }
}

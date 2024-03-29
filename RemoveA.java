class RemoveA{

    public static String remove(String str , String ans, int n){
        if(n < 0){
           // System.out.println(ans);
            return ans;
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
           return remove(str.substring(1),ans, n-1);
        }
        
       return remove(str.substring(1), ans+ch, n-1);
       

        
    }



    public static void main(String[] args) {
        String str = "abcabsabc";
        str = remove(str, "",str.length()-1);
        System.out.println(str);

    }
}
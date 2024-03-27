public class ReturnRev {
    public static void main(String[] args) {
        String str = "abcde";
        String str1 = rec1(str);
        System.out.println(str1);
    }
    public static String rec1(String str){
        if(str.length() == 1){
            return str;
        }
        //char ch = str.charAt(0);
        return rec1(str.substring(1))+str.charAt(0) ;
    }
}

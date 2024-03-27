class Rever_wd_rec {
    public static void main(String[] args) {
        // System.out.println("hii");
        String str = "abcde";
        rec(str);
    }

    public static void rec(String str) {

        if (str.length() == 1) {
            System.out.print(str);
            return;
        }
        System.out.print(str.charAt(str.length()-1));
        rec(str.substring(0,  str.length()-1));


    }

}
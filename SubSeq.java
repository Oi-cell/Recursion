public class SubSeq {
    public static void main(String[] args) {
        sub("abc", "");
        // System.out.println(st);

    }

    public static void sub(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);

        }
        sub(str.substring(1), ans);
        sub(str.substring(1), ans + str.charAt(0));

    }
}

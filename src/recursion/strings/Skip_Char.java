package recursion.strings;

public class Skip_Char {
    public static void main(String[] args) {
        skip("", "baccadh");
    }

    static void skip(String pr, String upr) {
        if (upr.isEmpty()) {
            System.out.println(pr);
            return;
        }

        char ch = upr.charAt(0);

        if (ch == 'a') skip(pr, upr.substring(1));
        else skip(pr + ch, upr.substring(1));
    }
}
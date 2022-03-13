package recursion;

public class Subsequence {

    public static void main(String[] args) {
        String s = "abc";

    }

    void powerSet(String s, int i, String cur) {
        if (i == s.length()) {
            System.out.println(cur);
        }
        powerSet(s, i + 1, cur);
    }

}
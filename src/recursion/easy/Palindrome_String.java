package recursion.easy;

// Problem statement: A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward.
// Eg: 121 -> palindrome; aba -> palindrome; racecar, madam etc. are palindrome
public class Palindrome_String {
    static boolean isPal(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        return isPal(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
//        isPal("Madam",0,4);
        System.out.println(isPal("Madam", 0, 4));
    }
}
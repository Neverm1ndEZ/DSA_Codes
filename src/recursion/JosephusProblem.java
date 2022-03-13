package recursion;

//Problem -> Okay, soo n=5 number of friends, i.e, 0 1 2 3 4, stands and plays game of death
// suppose 0 has that gun. So for some value of k=3, he'll count an index till the kth value and shoot his friend.
// counting..0, 1, 2. 2 dies. The gun is now with the guy next to 2 which is 3.
// he does the same. counts an index till the kth value and shoots his friend -> 3, 4, 0. 0 dies
// the gun is now with guy next to 0, i.e, 1. repeats procedure. 1, 3, 4 (2 is ded). 4 is ded now.
// next to 4 is 1 cuz 0 is ded. procedure. 1 ,3, 1. (2, 4, 0) ded. Now 1 is ded.
// 3 stays alive and makes new friends.
public class JosephusProblem {
    static int jos(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (jos(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        System.out.println(jos(5, 3));
    }
}
/* Amazon Interview Question
     5^2  5^1
2 -> 1     0

sum = 5^2 + 5^1

Magic number of 2 is 25

*/

public class MagicNumber {
    public static void main(String[] args) {
        int n = 2;
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}

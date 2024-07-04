public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(1824, 0));
    }

    public static int reverseNumber(int n, int reverse) {
        if (n == 0) return reverse;
        return reverseNumber(n/10, reverse*10 + n%10);
    }

}

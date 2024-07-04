public class ReverseANumber {

    static int sum = 0;

    public static void main(String[] args) {
//        System.out.println(reverseNumber(1824, 0));
        rev1(1824);
        System.out.println(sum);
    }

    static void rev1(int n) {
        if (n == 0) return;
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    public static int reverseNumber(int n, int reverse) {
        if (n == 0) return reverse;
        return reverseNumber(n/10, reverse*10 + n%10);
    }

}

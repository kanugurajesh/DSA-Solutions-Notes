public class NoOfDigits {
    public static void main(String[] args) {
        System.out.println(9 & -9);
//        System.out.println(oPowerOfTwo(3));
    }

    // Sum of nth row
    public static int NoOfDigits(int n) {
        return 1 << (n-1);
    }

    // You are given a number find out if it's a power of 2 or not
    public static boolean powerOfTwo(int n) {
        int count = 0;
        while (n > 0) {
            int last = n & 1;
            if (last == 1) count++;
            n = n >> 1;
        }
        if (count == 1) return true;
        return false;
    }

    // Optimized approach for the above one
    public static boolean oPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }

}

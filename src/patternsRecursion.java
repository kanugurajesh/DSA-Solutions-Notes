public class patternsRecursion {

    static void printStar(int n) {
        if (n == 0) {
            System.out.println();
                    return;
        }
        System.out.print("* ");
        printStar(n-1);
    }

    static void patternPrint(int n) {
        if (n == 0) {
            return;
        }
        printStar(n);
        patternPrint(n-1);
    }

    public static void main(String[] args) {
        patternPrint(5);
    }
}

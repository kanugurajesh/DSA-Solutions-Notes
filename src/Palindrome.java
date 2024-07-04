public class Palindrome {

    //    doing string question in java

    // checking if a string is palindrome
    public static boolean isPalindrome(String value) {

        int i = 0;
        int n = value.length() - 1;

        while (i<n) {
            if (value.charAt(i) != value.charAt(n)) return false;
            i++;
            n--;
        }

        return true;

    }

    // function to skip a character
    public static void skip(String p, String up, char skipC) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == skipC) skip(p, up.substring(1), skipC);
        else skip(p+ch, up.substring(1), skipC);
    }

    // function to skip an entire string
    public static void skipApple(String p, String up, String str) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        if (up.startsWith(str)) skipApple(p, up.substring(str.length()), str);
        else skipApple(p+up.charAt(0), up.substring(1), str);

    }


    public static void main(String[] args) {
//        String data = "abdcba";
//        skip("", data, 'a');
        String data1 = "bappled";
        skipApple("", data1, "apple");
    }

}

/*

The special keyboard has 11 numeric keys {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 00}. If he presses 00 , the previously displayed value will be multiplied by 100. Whereas, if he presses any other numeric key, the previously displayed value will first be multiplied by 10 and then the number on the key will be added to it.
example : "60004"
answer : 4
*/



public class minimumNumberOfKeyPresses {

    public static int keyPresses(String value) {
        int length = value.length();
        int i = 0;
        int keypresses = 0;

        while (i < length) {
            if (i < length - 1 && value.charAt(i) == '0' && value.charAt(i+1) == '0') {
                keypresses += 1;
                i += 2;
            } else {
                keypresses += 1;
                i += 1;
            }
        }

        return keypresses;

    }

    public static void main(String[] args) {
        String value = "60004";
        System.out.println(keyPresses(value));
    }
}

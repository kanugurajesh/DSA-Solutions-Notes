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

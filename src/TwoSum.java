public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = {-1, -1};
        int length = numbers.length;

        for(int i=0;i<length-1;i++) {
            for(int j=i+1;j<length;j++) {
                if (numbers[i] + numbers[j] == target) {
                    result = new int[]{i, j};
                    break;
                }
            }
        }

        return result;
    }

    public static void display(int[] numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        display(result);
    }
}

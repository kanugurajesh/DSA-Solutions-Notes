    static int binaryRecursion(int[] arr, int target, int start, int end) {

        int mid = start + (end - start)/2;
        if (start > end) return -1;
        if (arr[mid] == target) return mid;

        if (arr[mid] < target) start = mid + 1;
        else end = mid - 1;

        return binaryRecursion(arr, target, start, end);

    }


// The below one calculates the unique number in an array by performing xor operations.
static int uniqueNumber(int[] arr) {
    int unique = 0;
    for(int n: arr) {
        unique ^= n;
    }
    return unique;
}

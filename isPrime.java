// Optimized Solution

class isPrime {
  public static int isprime(int num) {
    if ( num <= 1) return false;
    int c = 2;
    while (c * c <= num) {
      if (n % c == 0) return false;
      c++;
    }
    return c * c > n;
  }
}

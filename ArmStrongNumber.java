// ArmStrong number in java

// A armstrong number is a number where the sum of cube of each digit in a number is equal to the value of the number

/*

 153 = 1**3 + 5***3 + 3***3

*/

class ArmStrongNumber {
  
  public boolean checkArmStrongNumber(int number) {
    
    int summ = 0;
    int target = 0;
    int temp = number;

    while(temp) {
      target = temp % 10;
      summ += target * target * target;
      temp /= 10;
    }

    if (summ == number) return true;
    return false;
    
  }
  
  public static void main(String[] args) {
    System.out.println(checkArmStrongNumber(153)) // returns true
    System.out.println(checkArmStrongNumber(125)) // returns false
  }
  
}

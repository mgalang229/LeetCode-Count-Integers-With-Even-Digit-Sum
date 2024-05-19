class Solution {
    public int countEven(int num) {
        int x = 1, count = 0;
        while (x <= num) {
            if (isEvenDigitSum(x)) {
                count++;
            }
            x++;
        }
        return count;
    }
    
    boolean isEvenDigitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return (sum % 2 == 0);
    }
}

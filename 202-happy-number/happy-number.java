import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        
        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            n = getSumOfSquares(n);
        }
        
        return n == 1;
    }

    private int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}   
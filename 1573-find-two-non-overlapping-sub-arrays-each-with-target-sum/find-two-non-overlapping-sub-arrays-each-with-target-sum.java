class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minLens = new int[n];
        java.util.Arrays.fill(minLens, Integer.MAX_VALUE);
        
        int minTotalSum = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            currentWindowSum += arr[right];
            
            while (currentWindowSum > target) {
                currentWindowSum -= arr[left];
                left++;
            }
            
            if (currentWindowSum == target) {
                int currentLen = right - left + 1;
                
                if (left > 0 && minLens[left - 1] != Integer.MAX_VALUE) {
                    minTotalSum = Math.min(minTotalSum, currentLen + minLens[left - 1]);
                }
                
                if (right > 0) {
                    minLens[right] = Math.min(minLens[right - 1], currentLen);
                } else {
                    minLens[right] = currentLen;
                }
            } else {
                if (right > 0) {
                    minLens[right] = minLens[right - 1];
                }
            }
        }
        
        return minTotalSum == Integer.MAX_VALUE ? -1 : minTotalSum;
    }
}

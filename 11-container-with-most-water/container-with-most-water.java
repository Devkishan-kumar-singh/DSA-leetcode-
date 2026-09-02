class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int st = 0;              
        int end = n - 1;         
        int maxCap = 0;

        while (st < end) {
            int h = Math.min(height[st], height[end]);
            int width = end - st;
            int currCap = h * width;
            maxCap = Math.max(currCap, maxCap);

            if (height[st] < height[end]) {
                st++;
            } else {
                end--;
            }
        }
        return maxCap;
    }
}

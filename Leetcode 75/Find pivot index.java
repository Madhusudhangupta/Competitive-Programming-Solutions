class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0)
            return -1;
        int n = nums.length;
        int total = 0, leftSum = 0;
        for (int i:nums)
            total += i;
        for (int i=0;i<n;i++) {
            if (leftSum == (total-nums[i]))
                return i;
            else {
                leftSum += nums[i];
                total -= nums[i];
            }
        }
        return -1;
    }
}

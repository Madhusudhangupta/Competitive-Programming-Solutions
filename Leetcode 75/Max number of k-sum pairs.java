class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int h = nums.length-1;
        int res = 0;

        while(l < h) {
            if(nums[l]+nums[h] == k) {
                res++;
                l++;
                h--;
            }
            else if(nums[l]+nums[h] < k)
                l++;
            else
                h--;
        }

        return res;
    }
} 

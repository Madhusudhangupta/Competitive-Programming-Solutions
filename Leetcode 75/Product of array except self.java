class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0; i<ans.length;i++)
            ans[i] = 1;
        int prodL = 1;
        for(int i=1; i<nums.length; i++) {
            prodL *= nums[i-1];
            ans[i] = prodL;
        }
        ans[0] = 1;
        int prodR = 1;
        for(int i=ans.length-2; i>=0; i--) {
            prodR *= nums[i+1];
            ans[i] *= prodR;
        }
        return ans;
    }
}

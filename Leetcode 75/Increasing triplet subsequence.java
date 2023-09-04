class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length <= 2)
            return false;
        int fS = Integer.MAX_VALUE;
        int sS = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num < fS)
                fS = num;
            else if(num < sS && num > fS)
                sS = num;
            else if(num > sS)
                return true;
        }
        return false;
    }
}

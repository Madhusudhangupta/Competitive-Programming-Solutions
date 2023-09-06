class Solution {
    List<Integer> solve(int[] nums1, int[] nums2) {
        Set<Integer> onlyInNums1 = new HashSet<> (); 
        Set<Integer> existsInNums2 = new HashSet<> (); 
        for (int num : nums2)
            existsInNums2.add(num);
        
        for (int num : nums1)
            if (!existsInNums2.contains(num))
                onlyInNums1.add(num);
        
        return new ArrayList<>(onlyInNums1);
    }
    
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(solve(nums1, nums2), solve(nums2, nums1));
    }
}

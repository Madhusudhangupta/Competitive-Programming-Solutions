class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr) {
            map.put(i, map.getOrDefault(i,0)+1);
            set.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i:  map.values())
            set2.add(i);
        
        return set.size() == set2.size();
    }
}

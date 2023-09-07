class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for(int i=0; i<word1.length(); i++)
            m1.put(word1.charAt(i), m1.getOrDefault(word1.charAt(i),0)+1);
        
        for(int i=0; i<word2.length(); i++) {
            m2.put(word2.charAt(i), m2.getOrDefault(word2.charAt(i),0)+1);
            if(!m1.containsKey(word2.charAt(i)))
                return false;
        }

        List<Integer> l1 = new ArrayList<>(m1.values());
        List<Integer> l2 = new ArrayList<>(m2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        
        return l1.equals(l2);
    }
}

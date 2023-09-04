class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        s = "";
        for(int i=(words.length-1); i>=0; i--) {
            if(words[i].equals(""))
                continue;
            s += " " +  words[i];
        }
        return s.trim();
    }
}

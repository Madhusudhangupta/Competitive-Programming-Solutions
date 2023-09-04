class Solution {
    public int compress(char[] chars) {
        int i = 0; // Index to write the compressed characters
        int j = 0;  // Index to read characters for compression

        while (j < chars.length) {
            char currChar = chars[j];
            int count = 0;

            // Count consecutive occurrences of the current character
            while (j<chars.length && chars[j]==currChar) {
                j++;
                count++;
            }

            chars[i] = currChar;
            i++;

            if (count > 1) {
                // Convert count to characters and write them
                char[] countChars = String.valueOf(count).toCharArray();
                for (char c : countChars) {
                    chars[i] = c;
                    i++;
                }
            }
        }

        return i;
    }

}

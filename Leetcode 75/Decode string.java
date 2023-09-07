class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                int n = ch-'0';
                while(i+1<s.length() && Character.isDigit(s.charAt(i+1))) {
                    n = n*10 + s.charAt(i+1)-'0';
                    i++;
                }
                num.push(n);
            }
            else if(ch == '[') {
                str.push(sb.toString());
                sb = new StringBuilder();
            }
            else if(ch == ']') {
                int k = num.pop();
                StringBuilder temp = new StringBuilder(str.pop());
                for(int j=0; j<k; j++)
                    temp.append(sb);
                sb = temp;
            }
            else
                sb.append(ch);
        }

        return sb.toString();
    }
}

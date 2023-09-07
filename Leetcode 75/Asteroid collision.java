class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<Integer>();

        for (int asteroid : asteroids) {
            boolean flag = true;
            while (!st.isEmpty() && (st.peek() > 0 && asteroid < 0)) {
                if (Math.abs(st.peek()) < Math.abs(asteroid)) {
                    st.pop();
                    continue;
                }
                else if (Math.abs(st.peek()) == Math.abs(asteroid))
                    st.pop();

                flag = false;
                break;
            }

            if (flag)
                st.push(asteroid);
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.peek();
            st.pop();
        }

        return res;
    }
}

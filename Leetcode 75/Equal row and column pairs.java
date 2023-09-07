class Solution {
    public int equalPairs(int[][] grid) {
        int res = 0;
        int n = grid.length;
        Map<String, Integer> map = new HashMap<>();
        for(int[] row: grid) {
            String rowString = Arrays.toString(row);
            map.put(rowString, map.getOrDefault(rowString, 0) +1);
        }

        for(int c=0; c<n; c++) {
            int[] colArr = new int[n];
            for(int r=0; r<n; r++)
                colArr[r] = grid[r][c];
            res += map.getOrDefault(Arrays.toString(colArr), 0);
        }

        return res;
    }
}

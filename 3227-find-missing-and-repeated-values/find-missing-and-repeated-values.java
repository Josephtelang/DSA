class Solution {
    //joseph
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int freq[] = new int[n * n + 1];
        int repeated = 0, missing = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }

        }

        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2) {
                repeated = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }
        return new int[] { repeated, missing };
    }
}
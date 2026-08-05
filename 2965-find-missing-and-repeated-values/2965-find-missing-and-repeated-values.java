class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set <Integer> s = new HashSet<Integer>();
        int n = grid.length;
        int i,j;
        int a = -1, b;
        int expSum, actualSum = 0;

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                actualSum += grid[i][j];
                if(s.contains(grid[i][j])){
                    a = grid[i][j];
                } else{
                s.add(grid[i][j]);
                }
            }
        }
        expSum = (n*n) * (n*n + 1) / 2;
        b = expSum + a - actualSum;
        return new int[]{a,b};
    }
}
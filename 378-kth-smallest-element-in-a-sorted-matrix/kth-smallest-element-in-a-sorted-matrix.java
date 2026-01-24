class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                l.add(matrix[i][j]);
            }
        }
        Collections.sort(l);
        return l.get(k-1);
    }
    
}
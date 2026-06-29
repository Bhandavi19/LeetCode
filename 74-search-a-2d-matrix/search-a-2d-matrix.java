class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            int l=0;
            int h=matrix[i].length-1;
            while(l<=h){
                int m=l+(h-l)/2;
                if(matrix[i][m] == target){
                    return true;
                }
                else if(matrix[i][m] < target){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
        }
        return false;
    }
}
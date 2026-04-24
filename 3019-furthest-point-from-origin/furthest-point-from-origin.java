class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0;
        int right = 0;
        int blank = 0;
        
        for (char ch : moves.toCharArray()) {
            if (ch == 'L') {
                left++;
            } else if (ch == 'R') {
                right++;
            } else {
                blank++;
            }
        }
        
        // Assign all '_' to the side that increases distance more
        return Math.abs(left - right) + blank;
    }
}
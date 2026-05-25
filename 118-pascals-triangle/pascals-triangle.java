class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        l.add(row);


        for(int i=1;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            for(int j=1;j<i;j++){
                int val = l.get(i-1).get(j-1) + l.get(i-1).get(j);
                temp.add(val);
            }

            temp.add(1);
            l.add(temp);
        }
        return l;
    }
}
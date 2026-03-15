class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr =new ArrayList<>();
        
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        arr.add(firstrow);

        for(int i=1;i<numRows;i++){
            List<Integer> temprow =new ArrayList<>();
            //in every array first element should be one 
            temprow.add(1);
                        
            for(int j=1;j<i;j++){
            int val=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                temprow.add(val);
            }
            //in every array last element should be one 
            temprow.add(1);
            arr.add(temprow);
        }

        return arr;
    }
}
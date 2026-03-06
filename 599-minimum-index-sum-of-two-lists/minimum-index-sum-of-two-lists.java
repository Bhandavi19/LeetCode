class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            hm1.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            hm2.put(list2[i],i);
        }
        ArrayList<String> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(String i: hm1.keySet()){
            if(hm2.containsKey(i)){
                int sum = hm1.get(i)+hm2.get(i);

                if(sum<min){
                    res.clear();
                    res.add(i);
                    min = sum;
                }

                else if(sum == min) res.add(i);
            }
        }
        return res.toArray(new String[0]);

    }
}
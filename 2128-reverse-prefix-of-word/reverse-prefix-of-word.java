class Solution {
    public String reversePrefix(String word, char ch) {
        char arr[] = word.toCharArray();
        int idx = word.indexOf(ch);
        int i=0;
        int j=idx;
        while(i<j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
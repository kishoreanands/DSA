class Solution {
    public int countSegments(String s) {
       char arr[]=s.toCharArray();
       int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==' '){
            count++;
        }
       }
       return count+1;
    }
}
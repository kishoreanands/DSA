class Solution {
    public int takeCharacters(String s, int k) {
      int arr[]=new int[s.length()];
      for(int i=0;i<s.length();i++){
        arr[i]=s.charAt(i);
      }  
      if((arr.length/2)<k){
        return -1;
      }
      int count=0;
      for(int i=k;i<arr.length-k;i++){
        count++;
      }
      return count;
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
      int k=0;
      
      for(int i=0;i<t.length();i++){
        if(s.charAt(k)==t.charAt(i)){
            k++;
            if(k>=s.length()){
                break;
            }
        }
      }
      boolean bool=false;
      if(k==s.length()){
        bool=true;
      }
      return bool;
    }
}
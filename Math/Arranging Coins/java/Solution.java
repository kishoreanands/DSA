class Solution {
    public int arrangeCoins(int n) {
       int count=0;
       for(int i=1;i<=n/2;i++){
            int diff=n-i;
            n-=i;
            if(diff>count){
                count=diff;
            }
       } 
       return count/2;
    }
}
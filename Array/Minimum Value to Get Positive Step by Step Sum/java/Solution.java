class Solution {
    public int minStartValue(int[] nums) {
        int minPrefix=0;
        int prefixsum=0;
        for(int num:nums){
         prefixsum+=num;
        minPrefix = Math.min(minPrefix,prefixsum);

        }
        return 1-minPrefix;
    }
}
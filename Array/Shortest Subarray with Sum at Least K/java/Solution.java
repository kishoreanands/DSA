class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int count=0;
        int sum=0;
    for(int i=0;i<nums.length;i++){
       sum+=nums[i];
       count++;
       if(sum>=k){
        return count;
       
        }
        }    
         return -1;
    }
}
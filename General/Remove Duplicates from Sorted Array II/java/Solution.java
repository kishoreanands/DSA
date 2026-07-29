1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int count=2;
4        for(int i=2;i<nums.length;i++){
5          if(nums[i]!=nums[count-2]){
6            nums[count++]=nums[i];
7          }
8        }
9        return count;
10    }
11}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0;
        int b=0;
      for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                a+=i;
                b+=j;
                sum+=nums[i]+nums[j];
                break;
            }
        }
        if(sum==target){
            break;
        }
      } 
      int arr[]=new int[2];
      arr[0]=a;
      arr[1]=b;
      return arr;
    }
}
1class Solution{
2    public List<List<Integer>> fourSum(int[] nums,int target){
3        List<List<Integer>> ans=new ArrayList<>();
4        int n=nums.length;
5        Arrays.sort(nums);
6        for(int i=0;i<n-3;i++){
7            if(i>0&&nums[i-1]==nums[i]) continue;
8            for(int j=i+1;j<n-2;j++){
9                if(j>i+1&&nums[j-1]==nums[j]) continue;
10                int k=j+1;
11                int l=n-1;
12                while(k<l){
13                    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
14                    if(sum==target){
15                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
16                        k++;
17                        l--;
18                        while(k<l&&nums[k-1]==nums[k]) k++;
19                        while(k<l&&nums[l+1]==nums[l]) l--;
20                    }
21                    else if(sum<target){
22                        k++;
23                    }
24                    else{
25                        l--;
26                    }
27                }
28            }
29        }
30        return ans;
31    }
32}
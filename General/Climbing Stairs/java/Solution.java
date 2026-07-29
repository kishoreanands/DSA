1class Solution {
2    public int climbStairs(int n) {
3        if(n==1){
4            return 1;
5        }
6        int first =1;
7        int second=2;
8        for(int i=3;i<=n;i++){
9            int current=first+second;
10            first=second;
11            second=current;
12        }
13        return second;
14    }
15}
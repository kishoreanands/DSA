1class Solution {
2    public int getSum(int a, int b) {
3       while(b!=0){
4        int sum=a^b;
5        int carry=(a&b)<<1;
6        a=sum;
7        b=carry;
8       }
9      return a;
10    }
11}
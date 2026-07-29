1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int count=0;
4       for(int i=0;i<matrix.length;i++){
5        for(int j=0;j<matrix[i].length;j++){
6            if(target==matrix[i][j]){
7                count++;
8            }
9        }
10       } 
11       if(count>0)
12       return true;
13       else return false;
14    }
15}
1class Solution {
2    public String convertDateToBinary(String date) {
3        String[] str = date.split("-");
4        StringBuilder sb = new StringBuilder();
5        for(int i = 0; i < str.length; i++){
6            int num = Integer.valueOf(str[i]);
7            sb.append(Integer.toBinaryString(num));
8            if(i != str.length - 1){
9                sb.append("-");
10            }
11         }
12        return sb.toString();
13    }
14}
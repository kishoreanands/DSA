1class Solution {
2    public int strStr(String haystack, String needle) {
3        int n = haystack.length();
4        int m = needle.length();
5        if (m == 0) {
6            return 0;
7        }
8        for (int i = 0; i <= n - m; i++) {
9            int j = 0;
10            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
11                j++;
12            }
13            if (j == m) {
14                return i;
15            }
16        }
17        return -1;
18    }
19}
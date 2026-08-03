class Solution {
    public int findContentChildren(int[] g, int[] s) {
       if(s.length==0)return 0;
       Arrays.sort(g);
       Arrays.sort(s);
       int max=0;
       int cookies=s.length-1;
       int child=g.length-1;
       while(cookies>=0&&child>=0){
        if(g[child]<=s[cookies]){
            max++;
            cookies--;
            child--;
        }else{
            child--;
        }
       }
       return max;
    }
}
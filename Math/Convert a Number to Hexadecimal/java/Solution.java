class Solution {
char[] hex = {
    '0','1','2','3','4','5','6','7',
    '8','9','a','b','c','d','e','f'
};    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        long n=num;
        if(n<0){
            n+=(1l<<32);
        }
        return convert(n);
    }
    private String convert(long n){
        if(n==0){
            return "";
        }
        return convert(n/16)+hex[(int)(n%16)];
    }
}
class Solution {
    public boolean isPerfectSquare(int num) {
        boolean bool=false;
        double n=num;
        for(int i=0;i<num/2;i++){
            double power=Math.pow(i,2);
            if(power==n){
                bool=true;
                break;
            }
            if(power>n){
                break;
            }
        }
        return bool;
    }
}
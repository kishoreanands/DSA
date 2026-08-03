class Solution {
    public boolean isPerfectSquare(int num) {
        boolean bool=false;
        for(int i=1;i<num;i++){
            int power=i*i;
            if(power==num){
                bool=true;
                break;
            }
            if(power>num){
                break;
            }
        }
        return bool;
    }
}
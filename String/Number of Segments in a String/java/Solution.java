class Solution {
    public int countSegments(String s) {
       char arr[]=s.toCharArray();
       int count=0;
       int t=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==' '){
            t=0;
        }if(arr[i]!=' '&&t==0){
            count++;
            t=1;;
        }
       }
       return count;
    }
}
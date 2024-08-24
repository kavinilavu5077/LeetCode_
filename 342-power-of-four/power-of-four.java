class Solution {
    public boolean isPowerOfFour(int n) {

        if(n<=0){
            return false;
        }
        long pow;
        for(long i =0;;i++){
             pow = (long)Math.pow(4,i);
             if(n==pow){
                return true;
             }
             if(pow>=n){
                return false;
             }
        }


    }
}
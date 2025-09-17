class Solution {
    public boolean isPowerOfTwo(int n) {
        // Check if n is positive and has exactly one '1' bit
        // return n > 0 && (n & (n - 1)) == 0;


        // sunbmit krne p time limit exceed aayega isliye int ki jagh long ko use krenge
        long i=1;
        while(i<n){
            i=i*2;
        }
        if(i==n){
            return true;
        }else{
            return false;
        }


        
    }
}
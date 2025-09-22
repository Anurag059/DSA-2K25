class Solution {
    public int reverse(int x) {
        int reversed=0;
        while(x!=0){ // example 2 me minus h isliye doesnot wali cndition use kr rhee h warna simplw whila(x>0) ye use krte
        int temp=x%10;
        x=x/10;
        if(reversed>0 && reversed>(Integer.MAX_VALUE-temp)/10  || reversed<0 && reversed<(Integer.MIN_VALUE-temp)/10) return 0;
         reversed=reversed*10+temp;

        }
        return reversed;
    }
}
class Solution {
    public String largestOddNumber(String num) {
        
        for(int i=num.length()-1;i>=0;i--){//humne last se isliye start kraa h kyunki right side mme hi largest odd number mil jayega
            if((num.charAt(i)-'0')%2==1){  //humne 0 ke character me dala h kyunki integer se char minus nhi ho sakta h
                return num.substring(0,i+1);      //zero starting index h aur bagal wala ending index
            }
        }
        return "";
    }
}
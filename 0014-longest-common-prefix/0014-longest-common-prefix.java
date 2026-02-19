class Solution {
    public String longestCommonPrefix(String[] arr) {
         String result="";
        for (int i =0;i<arr[0].length();i++){
            char ch=arr[0].charAt(i);
            boolean isCommon=true;
            for (int j = 1; j <arr.length ; j++) {
                if (i<arr[j].length()){
                    if(arr[j].charAt(i)!=ch){
                        isCommon=false;
                        break;
                    }
                }
                else{
                    isCommon=false;
                    break;


                }
            }
            if(isCommon){
                result=result+ch;

            }else{
                break;
            }


        }
        return result;
        
    }
}
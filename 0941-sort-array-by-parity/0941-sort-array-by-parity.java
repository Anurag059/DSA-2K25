class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] temp=new int [nums.length];
        int idx=0;
        //even
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
               temp[idx]= nums[i];
               idx++;


            }
        }
        //odd
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
               temp[idx]= nums[i];
               idx++;


            }
        }
        return temp;
        
        
        
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int arr:nums){
            result=result^arr;

        }
        return result;
        
    }
}
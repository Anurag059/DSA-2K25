class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {  
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];  
//----------------------------neeche wala tb hi kaam krega jb array sorted ho-----------
        // int left=0;
        // int right=nums.length-1;
        // int sum=nums[left]+nums[right];
        // while(left<right)
        // {
        //     if(sum==target){
        //         return new int []{left,right};
        //     }else if(sum<target){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        // }
        // return new int[0];






    }
}
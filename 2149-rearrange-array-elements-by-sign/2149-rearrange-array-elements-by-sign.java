class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos=0;
        int neg=1;


        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;

            }else {
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;


        //--------------------without new array
        // int n = nums.length;

        // for (int i = 0; i < n; i++) {
        //     // even index → positive chahiye
        //     if (i % 2 == 0 && nums[i] < 0) {
        //         int j = i + 1;
        //         while (j < n && nums[j] < 0) {
        //             j++;
        //         }
        //         // swap
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //     }

        //     // odd index → negative chahiye
        //     if (i % 2 == 1 && nums[i] > 0) {
        //         int j = i + 1;
        //         while (j < n && nums[j] > 0) {
        //             j++;
        //         }
        //         // swap
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //     }
        // }

        // return nums;

    }
}
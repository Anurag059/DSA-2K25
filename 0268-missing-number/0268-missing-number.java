class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int add=0;
        int formula=(n*(n+1))/2;

        for(int i=0;i<n;i++){
             add+=nums[i];
        }
        //int c=formula-add;
        return formula-add;
    }
}
import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        
        int pos=0;
        int n=nums.length;
        int []  temp=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                temp[pos]=nums[i];
                pos++;

            }

        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}
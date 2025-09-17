import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Sort kro array ko
        // Arrays.sort(nums);
        
        // for(int i=0;i<nums.length-1;i++){
        //     for (int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        // arraylist ka use nhi krenge kyunki time limit exceed aayegi isliye hashset ka use krenge arraylist ki jagh p

        //ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> list = new HashSet<>();

        for (int num : nums) {
            if (list.contains(num)) { 
                return true;  // duplicate found
            }
            list.add(num);
        }
        return false;  // no duplicates
       
    }    
}
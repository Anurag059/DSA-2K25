class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum >target) {
                right--;  // need a bigger sum
            } else if (sum<target){
                left++;
            } else{
                break;
            }

            
        }

        return new int[] {left+1,right+1};  // Just to satisfy return type, won't reach here as per constraints
    }
}

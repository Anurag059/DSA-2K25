public class Solution{

    public static int maxArea(int[] height) {

        int left = 0;                    // left pointer (start)
        int right = height.length - 1;   // right pointer (end)
        int maxArea = 0;                 // maximum area store karega

        // jab tak left < right
        while (left < right) {

            // STEP 1: width nikaalo
            //int width = right - left;

            // STEP 2: height = dono me se chhoti height
           // int minHeight = Math.min(height[left], height[right]);

            // STEP 3: area calculate karo
            int area =Math.min(height[left], height[right])*(right - left);

            // STEP 4: max area update karo
            maxArea = Math.max(maxArea, area);

            // STEP 5: chhoti height wale pointer ko move karo
            if (height[left] < height[right]) {
                left++;    // left height chhoti thi
            } else {
                right--;   // right height chhoti ya equal thi
            }
        }

        return maxArea;
    }
}

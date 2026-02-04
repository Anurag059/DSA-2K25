class Solution {
    public void rotate(int[][] matrix) {

        //rotate ke liye phele transpose kroo phir reverse(swap) kro
        // transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<matrix.length;i++){
            int left=0,right=matrix.length-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;

                left++;
                right--;

            }
        }


        
    }
}
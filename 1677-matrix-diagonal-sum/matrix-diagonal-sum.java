class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            // Primary Diagonbal: i=j
            sum += mat[i][i];

            // Secondary Diagonal: i+j = n-1 => j = n-1-i
            if(i != mat.length-1-i){
                sum += mat[i][mat.length-i-1];
            }

        }
        return sum;
        
    }
}
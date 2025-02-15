class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            // Top
            for(int j=startCol; j<=endCol; j++){
                li.add(matrix[startRow][j]);
            }

            // right
            for(int i=startRow+1; i<=endRow; i++){
                li.add(matrix[i][endCol]);
            }

            // Bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                li.add(matrix[endRow][j]);
            }

            // left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                li.add(matrix[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return li;
        
    }
}
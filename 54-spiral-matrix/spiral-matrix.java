class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int start_row = 0;
        int start_col =0;
        int end_row= matrix.length-1;
        int end_col= matrix[0].length-1;

        List<Integer> result = new ArrayList();

        while(start_row <= end_row && start_col <= end_col){
            // top
            for (int j =start_col ; j<= end_col ; j++){
                System.out.print(matrix[start_row][j]+" ");
                result.add(matrix[start_row][j]);
            }

            // left
            for (int i=start_row +1 ; i<= end_row ; i++){
                System.out.print(matrix[i][end_col]+" ");
                result.add(matrix[i][end_col]);
            }

            // bottom
            for (int j = end_col -1 ; j>= start_col ; j--){
                if (start_row == end_row){
                    return result;
                }
                System.out.print(matrix[end_row][j]+ " ");
                result.add(matrix[end_row][j]);
            }

            // right
            for (int i = end_row -1 ; i>= start_row+1 ; i-- ){
                if (start_col == end_col){
                    return result;
                }
                System.out.print(matrix[i][start_col]+" ");
                result.add(matrix[i][start_col]);
            }
            start_row ++;
            start_col ++;
            end_row --;
            end_col --;
        }
        System.out.println();
        return result;
        
    }
}
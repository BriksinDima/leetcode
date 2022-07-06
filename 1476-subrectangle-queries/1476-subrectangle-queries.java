class SubrectangleQueries {

     private int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }
	
	// Time complexity: O(n*r*c), where n = no. of operations, r = row2 - row1, c = col2 - col1
	// Space complexity: O(1)
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i <= row2; i++) {
            for(int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }
	
	// Time complexity: O(1)
	// Space complexity: O(1)
    
    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        BitSet row = new BitSet(9);
        BitSet[] col = new BitSet[9];
        BitSet[] box = new BitSet[9];
        BitSet tmp = new BitSet(9);
        int boxId = 0;
        for(int i = 0; i<9; i++){
            col[i] = new BitSet(9);
            box[i] = new BitSet(9);
        }
        for(int i = 0; i<9; i++){
            row.clear();
            for(int k = 0; k<9; k++){
                //check col
                if(board[k][i]!='.'){
                    tmp.set(board[k][i]);
                    if(col[i].intersects(tmp)){
                        System.out.println("col " + k + " " + i + "  " + board[k][i]);
                        return false;
                    }
                    tmp.clear();
                    col[i].set(board[k][i]);
                }
                if(board[i][k]!='.'){
                    //check row
                    tmp.set(board[i][k]);
                    if(row.intersects(tmp)){
                        System.out.println("row " + i + " " + k + "  " + board[i][k]);
                        return false;
                    }
                    row.set(board[i][k]);

                    //che box
                    boxId = (i/3)*3 + (k/3);
                    if(box[boxId].intersects(tmp)) {
                        System.out.println("box " + boxId + " " + i + " " + k + "  " + board[i][k]);
                        return false;
                    }
                    box[boxId].set(board[i][k]);
                    tmp.clear();
                }
            }
        }
        return true;
    }
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r=0;r<board.length;r++){
            HashSet<Character> hs = new HashSet<>();
            int count = 0;
            for(int c = 0;c<board[0].length;c++){
                if(board[r][c] != '.'){
                    count++;
                    hs.add(board[r][c]);
                }
                if(count != hs.size())
                    return false;
            }
        }

        for(int c=0;c<board[0].length;c++){
            HashSet<Character> hs = new HashSet<>();
            int count = 0;
            for(int r = 0;r<board.length;r++){
                if(board[r][c] != '.'){
                    count++;
                    hs.add(board[r][c]);
                }
                if(count != hs.size())
                    return false;
            }
        }
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                HashSet<Character> hs = new HashSet<>();
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        char current = board[boxRow + r][boxCol + c];
                        if (current != '.' && !hs.add(current)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}

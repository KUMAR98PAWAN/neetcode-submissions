class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> s = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                    continue;
                
                String row = new String(board[i][j]+"_ROW_"+ i);
                String col = new String(board[i][j]+"_COL_"+ j);
                String box = new String(board[i][j]+"_BOX_"+ i/3+"_"+ j/3);

                if(s.contains(row)||s.contains(col)||s.contains(box))
                    return false;
                
                s.add(row);
                s.add(col);
                s.add(box);


            }
        }
        return true;
    }
}

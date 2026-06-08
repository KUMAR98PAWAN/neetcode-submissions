class Solution {
     boolean isValid(char[][] board,int sr,int er,int sc, int ec){
       HashSet<Character> s = new HashSet<>();
        for(int i=sr;i<=er;i++)
        {   
            for(int j=sc;j<=ec;j++)
            {
                if(board[i][j]=='.')
                    continue;
                
                if(s.contains(board[i][j]))
                    return false;
                
                s.add(board[i][j]);
            }

        }
        return true;
     }
    public boolean isValidSudoku(char[][] board) {
     
        for(int row=0;row<9;row++)
        {   
            HashSet<Character> s = new HashSet<>();
            for(int col=0;col<9;col++)
            {
                if(board[row][col]=='.')
                    continue;
                
                if(s.contains(board[row][col]))
                    return false;
                
                s.add(board[row][col]);
            }
        }

         for(int col=0;col<9;col++)
        {   
            HashSet<Character> s = new HashSet<>();
            for(int row=0;row<9;row++)
            {
                if(board[row][col]=='.')
                    continue;
                
                if(s.contains(board[row][col]))
                    return false;
                
                s.add(board[row][col]);
            }
        }

        for(int sr=0;sr<9;sr+=3)
        {
            int er=sr+2;
            for(int sc=0;sc<9;sc+=3)
            {
                int ec=sc+2;
                if(!isValid(board,sr,er,sc,ec))
                    return false;
            }
        }
        return true;
    }
}

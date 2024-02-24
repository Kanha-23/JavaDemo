public class possibleknights {
    static int maxKnights = -1;
    public static boolean isSafe(char[][] board, int row, int col){
        int n=board.length;
        int i,j;
        //up right
         i=row-2;
         j=col+1;
        if(i>=0 && j<n && board[i][j]=='K') return false;

        //up left
         i=row-2;
         j=col-1;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;

         //down right
         i=row+2;
         j=col+1;
        if(i<n && j<n && board[i][j]=='K') return false;

         //down left
         i=row+2;
         j=col-1;
        if(i<n && j>=0 && board[i][j]=='K') return false;

         //left up
         i=row-1;
         j=col-2;
        if(i>=0 && j>=0 && board[i][j]=='K') return false;

         //left down
         i=row+1;
         j=col-2;
        if(i<n && j>=0 && board[i][j]=='K') return false;

         //right up
         i=row-1;
         j=col+2;
        if(i>=0 && j<n && board[i][j]=='K') return false;

         //right down
         i=row+1;
         j=col+2;
        if(i<n && j<n && board[i][j]=='K') return false;

        return true;

    }

    public static void helper(char[][] board , int row , int col,int num){
        int n=board.length;
        //base case final print

        if(row==n){
         
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                   System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        else if(isSafe(board,row,col)){
            board[row][col]='K';
            if(col!=n-1)
            helper(board, row, col+1, num+1);
            else
            helper(board, row+1, 0, num+1);
            board[row][col]='X';//backtracking
        }
        //not safe to put
        
            if(col!=n-1)
            helper(board, row, col+1, num); //agar safe nahi h fir b age to bhadunga so same thing
                                            //aur num+1 nahi krunga coz it dont count as mene knight vaha rakha hi nahi                                //it was unsake so i just skipped it
            else
            helper(board, row+1, 0, num);
        
    }
    public static void main(String[] args) {
        int n=2;
        
        //creating a chess board
        char[][] board = new char[n][n];
        //first fill the board with X
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }

        helper(board, 0, 0, 0);
    }
}
////this print all possibilities; 

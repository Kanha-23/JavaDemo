public class Nqueen {

    
    public static void main(String[] args) {
        int n=4;
        
        //creating a chess board
        char[][] board = new char[n][n];
        //first fill the board with .
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }

        nqueen(board,0);

    }
    //to check if i can travel in paticular row of a board or not
    private static void nqueen(char[][] board, int row){
        int n=board.length;
        
        //finally print jab row or n eqaul aa jaye which means now each
        //row has a Q printed in it 
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
        //in row check for paticular column if sfae or not
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                //ek bar row me ek Q aa gaya fir will move to the next row
                nqueen(board, row+1);
                //now will backtrack
                board[row][j]='.';
            }
            
        }
    }

    //isSafe function to check place is safe or not
    private static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        //check the row
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }

        //check col
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }

        //check north east
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        //check south east
        i= row;
        j= col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }

        //check south west
        i= row;
        j= col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }

        //check north west
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;
    }
}

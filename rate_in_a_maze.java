//left right up down
public class rate_in_a_maze {
    public static void main(String[] args) {
        int row=3;
        int col=4;
        int[][] maze={{1,0,1,1,1,1},
                      {1,1,1,1,0,1},
                      {0,1,1,1,1,1},
                      {0,0,1,0,1,1}};
        boolean[][] isVisited = new boolean[row][col]; 
        print(0,0,row-1,col-1,"",maze,isVisited);   
    }

    public static void print(int sr,int sc, int er, int ec,String s,int[][] maze,boolean[][] isVisited){
        if(sr<0||sc<0) return;
        if(sr>er||sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        if(isVisited[sr][sc]==true) return;

        isVisited[sr][sc] = true;
        //go right
        print(sr, sc+1, er, ec, s+"R", maze , isVisited);
        //go down
        print(sr+1, sc, er, ec, s+"D", maze , isVisited);
        //go left
        print(sr, sc-1, er, ec, s+"L", maze , isVisited);
        //go up
        print(sr-1, sc, er, ec, s+"U", maze , isVisited);


        //backtracking
        isVisited[sr][sc] = false;
    }
}

public class printmazepath {
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        
        maze(1,1,rows,cols,"");
    }

    private static void maze(int sr,int sc, int er,int ec,String str){

        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec) {
            System.out.println(str);
            return;
        }
        maze(sr+1,sc,er,ec,str+"D");

        maze(sr,sc+1,er,ec,str+"R");
     
    }


}

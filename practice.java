public class practice {
    
    public static void mazepath(int cr,int cc,int dr,int dc, String ans){
        if(cr==dr && cc==dc){
            System.out.println(ans);
            return;
        }

        if(cr > dr || cc > dc) {
            return;
        }

        mazepath( cr+1, cc, dr, dc, ans+'V');
        mazepath( cr, cc+1, dr, dc, ans+'H');
    }

    public static void dice_path(int current,int distination, String path)
    {
        if(current>distination){
            return;
        }
        if(current==distination){
            System.out.println(path);
        }
        dice_path( current+1, distination,  path+1);
        dice_path( current+2, distination,  path+2);
        dice_path( current+3, distination,  path+3);
        dice_path( current+4, distination,  path+4);
        dice_path( current+5, distination,  path+5);
        dice_path( current+6, distination,  path+6);

    }

    public static void main(String[] args){
        // mazepath( 0, 0, 2, 2, "");
        dice_path(0,5, "");
    }
}

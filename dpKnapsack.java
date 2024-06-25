import java.util.*;
public class dpKnapsack {

    public static int helper(int w, int[] wt, int[] p , int n,int[][] result){
        if(n==0 ||w==0)
        return 0;

        if(result[n][w]!=-1)
        return result[n][w];

        if(wt[n-1] > w)
        {
            result[n][w]=helper(w, wt, p, n-1, result);
            
        }else{
            result[n][w]=Math.max(p[n-1]+ helper( w-wt[n-1],  wt, p ,  n-1, result) , helper( w,  wt, p ,  n-1, result) );
        }
        return result[n][w];

      

    }

    public static int KnapSack(int w, int[] wt, int[] p , int n){
        int[][] result=new int[n+1][w+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                result[i][j]=-1;
            }
        }

        return helper(w, wt, p, n, result);
    }
  
    public static void main(String[] args) {
        int[] profit ={60,100,120};
        int[] weight = {10,20,30};
        int capaciy = 50;

        System.out.println("Total profit="+ KnapSack(capaciy,weight,profit,profit.length));
    }
}

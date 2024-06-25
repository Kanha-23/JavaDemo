public class SubsetSumProblem {
    public static boolean isSubsetSum(int[] arr,int n, int sum)
    {
        boolean subset[][] = new boolean[sum+1][n+1];

        //if sum is zero then return true
        for(int i=0;i<=n;i++){
            subset[0][i]=true;
        }
        //if sum is not zero but set is empty then return false
        for(int i=1;i<=sum;i++){
            subset[i][0]=false;
        }

        //fill the table in bottom up approach ,starting the loop from 1 coz
        //we will have already filled the 0 row and column with 1st 2 conditions

        for(int i=1;i<=sum;i++){
            for(int j=1;j<=n;j++){
                subset[i][j]=subset[i][j-1];
                if(i>=arr[j-1]){
                    subset[i][j]=subset[i][j] || subset[i-arr[j-1]][j-1];
                }
            }
        }
        return subset[sum][n];
    }
    public static void main(String[] args) {
        int[] arr={3,34,4,12,5,2};
        int sum=9;
        if(isSubsetSum(arr, arr.length, sum))
        {
            System.out.println("Subset Found!");
        }
        else{
            System.out.println("SubSet not Found");
        }
    }
}

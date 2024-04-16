import java.util.Arrays;

public class Cnt_inversion {

    public static int mergeProcedure(int[] arr,int l,int mid,int h){
        int swap=0;
        //left and right subarray
        int[] lsubarray = Arrays.copyOfRange(arr, l, mid+1);//last ele of the range function is not included

        int[] rsubarray = Arrays.copyOfRange(arr,mid+1 ,h+1);//last ele of the range function is not included

        int i=0,j=0,k=l;
        while(i<lsubarray.length && j<rsubarray.length){
            if(lsubarray[i]<=rsubarray[j]){
                arr[k++]=lsubarray[i++];


            }else{
                arr[k++]=rsubarray[j++];
               //calculate the number of swaps
               swap+=(mid+1)-(l+i);

            }
         
        }
        //copy all the remaining element from left subarray
        while(i<lsubarray.length){
            arr[k++]=lsubarray[i++];
        }
        //copy all the remaining element from right subarray
        while(j<rsubarray.length){
            arr[k++]=rsubarray[j++];
        }
        return swap;
    }

    public static int inversionCountDC(int[] arr, int l,int h){
        int count=0;
        if(l<h){
            //1.divide the array into two subproblem
            int mid=l+(h-l)/2;

            //2.Conquer the subproblem using the recursion approch
            //left subarray
            count+=inversionCountDC(arr, l, mid);
            //right subarray
            count+=inversionCountDC(arr, mid+1, h);

            //3.Combine the solution
            count+=mergeProcedure(arr,l,mid,h);

            
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,5,2,8,3,4};
        int n=arr.length;
        
        int countOpt=inversionCountDC(arr,0,n-1);
        System.out.println("inversions="+countOpt);

    }
}

import java.util.*;
public class countsort {
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }

        return mx;
    }

/*      static void basicCountSort(int[] arr){
        int max=findMax(arr);
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){             //here are two loops thus its time complexity will be O(n^2)
                arr[k++]=i;
            }
        }
    }  */

    static void countSort(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        int max = findMax(arr);
        int[]count = new int[max+1];

        for(int i=0;i<arr.length;i++){          //frequency array
            count[arr[i]]++;
        }

        for(int i=1;i<count.length;i++){        //make prefix sum array
            count[i]+=count[i-1];
        }

        //now find each element in original array 

        for(int i=n-1;i>=0;i--){
            int idx = count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }

        //copy all elements of output to arr

        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }

    static void display(int[] arr){
        System.out.print("Array after sorting: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

     public static void main(String[] args){
        int[] arr={1,4,5,2,2,5,78,34,55,90};
        // basicCountSort(arr);
        countSort(arr);
        display(arr);
     }
}

import java.util.*;

public class radixsort {
    
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }

        return mx;
    }

    static void countSort(int[] arr,int place){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];
        for(int i=0;i<arr.length;i++){
            count[(arr[i]/place)%10]++;
        }
        
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }

        //now find each element in original array 

        for(int i=n-1;i>=0;i--){
            int idx = count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }

        //copy all elements of output to arr

        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }

    static void radixSort(int[] arr){
        int max = findMax(arr);
        for(int place=1;max/place>0;place+=10){
            countSort(arr,place);
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
        radixSort(arr);
        display(arr);
     }

}

public class practice {
    
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=mx){
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

        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }

        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }

    static void radixSort(int[] arr){
        int maxlength=findMax(arr);
        for(int place=1;maxlength/place>0;place*=10){
            countSort(arr,place);
        }
    }

    static void display(int[] arr){
        System.out.println("Sorted array2:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] arr={9,35,86,35,90,32,12,4};
        radixSort(arr);
        display(arr);
    }
}

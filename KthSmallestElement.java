public class KthSmallestElement {

    public static int findKthSmallest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length) {
            throw new IllegalArgumentException("Invalid input");
        }
        
        return quickselect(nums, 0, nums.length - 1, k);
    }

    private static int quickselect(int[] nums, int left, int right, int k) {
        if (left == right) {
            return nums[left];
        }

        // Choose the leftmost element as the pivot
        int pivotIndex = left;//initialising
        
        pivotIndex = partition(nums, left, right, pivotIndex);//give the pivot element index

        if (k == pivotIndex + 1) {
            return nums[k - 1];
        } else if (k < pivotIndex + 1) {
            return quickselect(nums, left, pivotIndex - 1, k);
        } else {
            return quickselect(nums, pivotIndex + 1, right, k);
        }
    }

    private static int partition(int[] arr, int l, int h, int pivotIndex) {
        int i = l;
        int pivot = arr[l];

        for (int j = l + 1; j <= h; j++) {
            if (arr[j] <= pivot) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] nums = {36, 12, 21, 25, 34};
        int k = 2;
        int kthSmallest = findKthSmallest(nums, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }
}



//using randomise quick sort
// import java.util.Random;

// public class KthSmallestElement {

//     public static int findKthSmallest(int[] nums, int k) {
//         if (nums == null || nums.length == 0 || k < 1 || k > nums.length) {
//             throw new IllegalArgumentException("Invalid input");
//         }
        
//         return quickselect(nums, 0, nums.length - 1, k);
//     }

//     private static int quickselect(int[] nums, int left, int right, int k) {
//         if (left == right) {
//             return nums[left];
//         }

//         Random random = new Random();
//         int pivotIndex = left + random.nextInt(right - left + 1);
//         pivotIndex = partition(nums, left, right, pivotIndex);

//         if (k == pivotIndex + 1) {
//             return nums[k - 1];
//         } else if (k < pivotIndex + 1) {
//             return quickselect(nums, left, pivotIndex - 1, k);
//         } else {
//             return quickselect(nums, pivotIndex + 1, right, k);
//         }
//     }

//     private static int partition(int[] arr, int l, int h, int pivotIndex) {
//         int i = l;
//         int pivot = arr[l];

//         for (int j = l + 1; j <= h; j++) {
//             if (arr[j] <= pivot) {
//                 i = i + 1;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         int temp = arr[l];
//         arr[l] = arr[i];
//         arr[i] = temp;

//         return i;
//     }

//     public static void main(String[] args) {
//         int[] nums = {36, 12, 21, 25, 34};
//         int k = 2;
//         int kthSmallest = findKthSmallest(nums, k);
//         System.out.println("The " + k + "th smallest element is: " + kthSmallest);
//     }
// }

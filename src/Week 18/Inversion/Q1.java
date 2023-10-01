package Inversion;

public class Q1 {

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 5, 6, 7};
        int n = arr.length - 1;
        int k = 3;
        int kthLargest = quickSelect(arr, 0, n, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }

    private static int quickSelect(int[] arr, int l, int h, int k) {
        if (l <= h) {
            int mid = partition(arr, l, h);
            int position = mid - l + 1; // Calculate the position of the pivot

            if (position == k) {
                return arr[mid]; // Found the kth largest element
            } else if (position > k) {
                return quickSelect(arr, l, mid - 1, k); // Recurse on the left subarray
            } else {
                return quickSelect(arr, mid + 1, h, k - position); // Adjust k and recurse on the right subarray
            }
        }
        return -1; // Return -1 if k is out of bounds
    }

    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;

        for (int j = l; j <= h - 1; j++) {
            if (arr[j] >= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;

        return i + 1;
    }
}

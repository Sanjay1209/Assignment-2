public class Q4_MergeSort {
	// 4. WAP to sort an array using Merge Sort Algorithm.

	 public void merge(int[] arr, int left, int mid, int right) {

	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        int[] L = new int[n1];
	        int[] R = new int[n2];
	 

	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[left + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[mid + 1 + j];

	        int i = 0, j = 0;

	        int k = left;

	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 

	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	 

	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	 

	    public void sort(int[] arr, int left, int right) {
	        if (left < right) {
	            int mid = left + (right - left) / 2;
	            sort(arr, left, mid);
	            sort(arr, mid + 1, right);
	            merge(arr, left, mid, right);
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = { 12, 11, 13, 15, 6, 7 }; //input
	        Q4_MergeSort ms = new Q4_MergeSort();
	        ms.sort(arr, 0, arr.length - 1);
	        System.out.println("Sorted array:");
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i] + " ");
	    }
}

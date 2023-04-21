public class Q1 {

	public static void main(String[] args) {
		// 1. WAP to find the duplicates present in an array.

		int[] arr = { 1, 2, 3, 4, 5, 1, 3, 7, 8, 4 }; // Sample input array
		int len = arr.length;

		// Loop through the array

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				// Compare each element with all elements after it
				if (arr[i] == arr[j]) {
					// If duplicate found, print it
					System.out.println("Duplicate found: " + arr[j]);
				}
			}
		}
	}
}

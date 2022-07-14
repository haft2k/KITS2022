package EX6dang3;

public class Main {

	public static void main(String[] args) {
		// [2, 34, 36, 38], [36, 96, 98, 100]
		int[] arr = { 3, 85, 2, 34, 36, 38, 26, 14, 29, 1, 12, 201, 36, 96, 98, 100, 2, 31 };

		int maxLength = 0, count = 0, lastIndex = 0; // A[0]

		int sum = arr[0], sumOfSubArr = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i % 2] == 0) {
				count++;
			}

			else {
				count = 1;

			}

			if (count > maxLength) {
				maxLength = count;
				lastIndex = i;
			}

		}

		System.out.println("Max Length = " + maxLength + " " + "Sum Sub Array = " + sumOfSubArr);
		System.err.println(" ");
		for (int i = lastIndex - maxLength + 1; i < lastIndex; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(arr[lastIndex] + " !");
	}

}

package w5;

public class TUT4_Array {
	public static int arr[] = { 1, 2, 3, -1, -2 };

	public static void main(String[] args) {
		System.out.println(countNegative(arr));
		System.out.println(min(arr));
		ascOrder(arr);

	}

	/**
	 * this method is designed to count the negative number of Array
	 * 
	 * @requires:
	 * @modifies:
	 * @effects: for each int i in Array if i < 0 count++ return count
	 * @param:
	 * @return
	 */
	public static int countNegative(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] < 0)
				count = count + 1;
		return count;
	}

	/**
	 * this method is designed to check the minimum number
	 * 
	 * @requires:
	 * @modifies:
	 * @effects: min = arr[0] for each int i in array if arr[i] <= min min =
	 *           arr[i] return min
	 * @param arr
	 * @return
	 */
	public static int min(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= min) {
				min = arr[i];
			}

		}
		return min;
	}

	/**
	 * @requires:
	 * @modifies:
	 * @effects: for each element int i in array if min < arr[i] min = arr[i]
	 * 
	 */
	public static int ascOrder(int arr[]) {
		int max, pos;
		for (int i = arr.length; i >= 1; i--) {
			max = arr[i];
			pos = i;
			for (int j = i - 1; j >= 0; j--) {
				if (max < arr[j]) {
					max = arr[j];
					pos = j;
				}
			}
			arr[pos] = arr[i];
			arr[i] = max;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return 0;
	}
}

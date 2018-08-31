public class BinaryIterativeSearch implements Practice2Search {
	public int search(int[] a, int x) {
		int low = 0;
		int up = a.length - 1;
		int mid = (up + low) / 2;
		while (low <= up) {
			mid = (up + low) / 2;
			if (a[mid] == x) {
				return mid;
			}
			else if (a[mid] < x) {
				low = mid + 1;
			}
			else {
				up = mid - 1;
			}
		}
		return -1;
	}
	public String searchName() {
		return "Binary Iterative Search";
	}
}
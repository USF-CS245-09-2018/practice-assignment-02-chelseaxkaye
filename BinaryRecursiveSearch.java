public class BinaryRecursiveSearch implements Practice2Search {
	public int search(int[] a, int x) {
		return search(a, x, 0, a.length - 1);
	}
	public int search(int[] a, int x, int low, int up) {
		if (low > up) {
			return -1;
		}
		int mid = (up + low) / 2;
		if (a[mid] == x) {
			return mid;
		}
		else if (a[mid] < x) {
			return search(a, x, mid + 1, up);
		}
		else {
			return search(a, x, low, mid - 1);
		}
	}
	public String searchName() {
		return "Binary Recursive Search";
	}
}
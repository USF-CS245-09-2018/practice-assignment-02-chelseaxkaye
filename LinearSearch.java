public class LinearSearch implements Practice2Search {
	public int search(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x){
				return i;
			}
		}
		return -1;
	}
	public String searchName() {
		return "Linear Search";
	}
}
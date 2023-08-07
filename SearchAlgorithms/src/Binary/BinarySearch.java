package Binary;

import java.util.Collections;
import Search.Search;
import java.util.List;

public class BinarySearch implements Search {
	int key, first, last;
	List<Integer> lis;

	public BinarySearch(List<Integer> lis, int first, int last) {
		this.first = first;
		this.last = last;
		this.lis = lis;
	}

	public int Search(int key) {
		Collections.sort(lis);
		while (first <= last) {
			int m = (int) (first + last) / 2;
			int midElement = lis.get(m);
			if (midElement < key) {
				first = lis.indexOf(midElement) + 1;
			} else if (midElement > key) {
				last = lis.indexOf(midElement) - 1;
			} else if (midElement == key) {
				return m;
			}
		}
		return -1;

	}

}
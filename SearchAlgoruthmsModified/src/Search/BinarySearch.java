package Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch extends ListData implements Search {
	private int key, first = 0;
	private List<Integer> li = new ArrayList<>();
	private int last = lis.size() - 1;

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
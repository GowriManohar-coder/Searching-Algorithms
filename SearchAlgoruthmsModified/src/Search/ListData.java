package Search;

import java.util.List;
import java.util.ArrayList;

public abstract class ListData {
	protected List<Integer> lis;

	public ListData() {
		 lis = new ArrayList();

		for (int i = 1; i <= 100; i++) {
			lis.add(i);
		}

		System.out.println("the list is = " + lis);

	}
}

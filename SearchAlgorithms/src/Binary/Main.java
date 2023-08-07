package Binary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Search.Search;

public class Main {

	public static void main(String[] args) {

		List<Integer> lis = new ArrayList<Integer>();

		lis.add(21);
		lis.add(30);
		lis.add(45);
		lis.add(50);
		lis.add(51);
		lis.add(56);
		lis.add(70);
		lis.add(75);
		lis.add(80);
		lis.add(90);

		System.out.println(lis);

		int key = 8;
		int first = 0;
		int last = lis.size() - 1;
		Search ser = new BinarySearch(lis, first, last);
		int x = ser.Search(key);
		if (x == -1)
			System.out.println("the value is not found ");
		else
			System.out.println("The value is found at " + x);
	}
}
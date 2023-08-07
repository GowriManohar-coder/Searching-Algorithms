
package Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		int key = 12;

		Search ser = new RandomSearch();
		int x = ser.Search(key);
		if (x == -1)
			System.out.println("the value is not found ");
		else
			System.out.println("The value is found at " + x);

	}
}
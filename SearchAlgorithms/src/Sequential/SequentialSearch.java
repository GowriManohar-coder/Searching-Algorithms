package Sequential;
import Search.Search;
import java.util.Collections;
import java.util.List;

public class SequentialSearch implements Search {
    private int key, first, last;
    List<Integer> lis;

    public SequentialSearch(List<Integer> lis, int first, int last) {
        this.first = first;
        this.last = last;
        this.lis = lis;
    }

    public int Search(int key) {
    	for(int i = first;i<=last;i++) {
    	    if(lis.get(i)==key) {
    	    	return i;
    	    }
    	}
    	return -1;
          }
    
           
       }     
package Search;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialSearch extends ListData implements Search {
	 private int key, first=0;
	    private List<Integer> li = new ArrayList<>();
	    private int last = lis.size()-1;

    public int Search(int key) {
    	for(int i = first;i<=last;i++) {
    	    if(lis.get(i)==key) {
    	    	return i;
    	    }
    	}
    	return -1;
          }
    
           
       }     
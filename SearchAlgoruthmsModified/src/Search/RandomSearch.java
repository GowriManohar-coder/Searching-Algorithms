package Search;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomSearch extends ListData implements Search {
    private int key, first=0;
    private List<Integer> li = new ArrayList<>();
    private int last = lis.size()-1;

    public int Search(int key) {
    	while(first<last) { 
    	 int x = (int) (Math.random()*100);
    	if(li.contains(x)!=true) {
    		li.add(x);
    			if(lis.get(x)==key) {
        			return x;
        	}
    		}
    	}
    	return -1;
    	
       }     
    }
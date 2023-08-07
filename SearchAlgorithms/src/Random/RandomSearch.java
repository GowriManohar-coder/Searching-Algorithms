package Random;
import java.util.ArrayList;
import Search.Search;
import java.util.Collections;
import java.util.List;

public class RandomSearch implements Search {
    int key, first, last;
    List<Integer> lis;
    List<Integer> li = new ArrayList<>();

    public RandomSearch(List<Integer> lis, int first, int last) {
        this.first = first;
        this.last = last;
        this.lis = lis;
    }

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
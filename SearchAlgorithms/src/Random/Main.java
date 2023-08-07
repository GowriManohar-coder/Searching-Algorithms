package Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Search.Search;
public class Main {

    public static void main(String[] args) {

        List<Integer> lis = new ArrayList<Integer>();
        
        for(int i = 1;i<=100;i++) {
        	lis.add(i);
        }
        
        System.out.println("the list is = "+lis);

        
        int key = 12;
        int first = 0;
        int last = lis.size()-1;
        Search ser = new RandomSearch(lis, first, last);
        int x = ser.Search(key);
        if(x==-1)
            System.out.println("the value is not found ");
            else
            	System.out.println("The value is found at "+x);
        


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
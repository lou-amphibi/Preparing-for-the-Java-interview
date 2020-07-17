package support;
import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
	Integer value=1;
	Integer prev=0;
	int fibCount=0;
    @Override
    public boolean hasNext() {
        return Integer.MAX_VALUE-prev>=value;
    }

    @Override
    public Integer next() {
    	if (fibCount==0) {
    		fibCount++;
    		return 0;
    	}
    	else if (fibCount==1) {
    		fibCount++;
    		return 1;
    	}
    	Integer temp=value;
    	value+=prev;
    	prev=temp;
    	return value;
    }

}

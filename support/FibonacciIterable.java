package support;
import java.util.Iterator;

public class FibonacciIterable implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }

}

/**
 * Do not modify this interface
 */

public interface Deque<E> extends Iterable<E> {
    public void addFirst(E item);
    public void addLast(E item);
    public E removeFirst();
    public E removeLast();
    public int size(); 
}

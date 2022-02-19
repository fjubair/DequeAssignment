import java.util.Iterator;

public class NodeDeque<E> implements Deque<E> {
    
    private Node<E> first, last;
    private int n;

    public NodeDeque(){
        first=null;
        last=null;
        n=0;
    }

    @Override
    public void addFirst(E item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addLast(E item) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public E removeFirst() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public E removeLast() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        return n;
    }

    /**
     * Do not modify this method
     */
    @Override
    public String toString(){
        String str = "[";
        Node<E> ptr = first;
        while(ptr!= null){
            str = str + " " + ptr.getItem().toString();
            ptr = ptr.getNext();
        }
        str = str + " ]";
        return str;
    }
}

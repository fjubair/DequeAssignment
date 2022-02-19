
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class NodeDequeTest {
    
    @Test
    public void test1(){
        //setup
        String expected = "[ 55 66 77 88 ]";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addLast(55);
        deque.addLast(66);
        deque.addLast(77);
        deque.addLast(88);
        String actual = deque.toString();

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 4);
    }

    @Test
    public void test2(){
        //setup
        String expected = "[ 55 66 77 88 ]";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addFirst(88);
        deque.addFirst(77);
        deque.addFirst(66);
        deque.addFirst(55);
        String actual = deque.toString();

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 4);
    }

    @Test
    public void test3(){
        //setup
        String expected = "[ 55 66 77 88 ]";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addFirst(66);
        deque.addLast(77);
        deque.addFirst(55);
        deque.addLast(88);
        String actual = deque.toString();

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 4);
    }

    @Test
    public void test4(){
        //setup
        String expected = "[ A B C D ]";
        
        //invoke
        Deque<Character> deque = new NodeDeque<Character>();
        deque.addLast('C');
        deque.addFirst('B');
        deque.addLast('D');
        deque.addFirst('A');
        String actual = deque.toString();

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 4);
    }

    @Test
    public void test5(){
        //setup
        String expected = "[ A B C D ]";
        
        //invoke
        Deque<String> deque = new NodeDeque<String>();
        deque.addLast("C");
        deque.addLast("D");
        deque.addFirst("B");
        deque.addFirst("A");
        String actual = deque.toString();

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 4);
    }

    @Test
    public void test6(){
        //setup
        String expected = "[ 55 66 77 88 ]";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addFirst(66);
        deque.addFirst(55);
        deque.addLast(77);
        deque.addLast(88);   
        String actual = deque.toString();

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 4);
    }
    
    @Test
    public void test7(){
        //setup
        String expected = "[ 55 66 77 88 ]";
        String actual = "[";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addFirst(55);
        actual = actual + " " + deque.removeFirst();
        deque.addLast(66);
        actual = actual + " " + deque.removeFirst();
        deque.addLast(77);   
        actual = actual + " " + deque.removeFirst();
        deque.addFirst(88);
        actual = actual + " " + deque.removeFirst();
        actual = actual + " ]";

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 0);
    }

    @Test
    public void test8(){
        //setup
        String expected = "[ 55 66 77 88 ]";
        String actual = "[";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addFirst(55);
        deque.addLast(66);
        deque.addLast(77); 
        deque.addLast(88);
        actual = actual + " " + deque.removeFirst();
        actual = actual + " " + deque.removeFirst();
        actual = actual + " " + deque.removeFirst();
        actual = actual + " " + deque.removeFirst();
        actual = actual + " ]";

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 0);
    }

    @Test
    public void test9(){
        //setup
        String expected = "[ 55 66 77 88 ]";
        String actual = "[";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addFirst(88);
        deque.addLast(77);
        deque.addLast(66); 
        deque.addLast(55);
        actual = actual + " " + deque.removeLast();
        actual = actual + " " + deque.removeLast();
        actual = actual + " " + deque.removeLast();
        actual = actual + " " + deque.removeLast();
        actual = actual + " ]";

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 0);
    }

    @Test
    public void test10(){
        //setup
        String expected = "[ 55 66 77 88 ]";
        String actual = "[";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addFirst(55);
        actual = actual + " " + deque.removeLast();
        deque.addLast(66);
        actual = actual + " " + deque.removeLast();
        deque.addFirst(77); 
        actual = actual + " " + deque.removeLast();
        deque.addLast(88);
        actual = actual + " " + deque.removeLast();
        actual = actual + " ]";

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 0);
    }

    @Test
    public void test11(){
        //setup
        String expected = "[ 55 88 66 77 77 55 88 66 ]";
        String actual = "[";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addFirst(88);
        deque.addFirst(77);
        deque.addFirst(66); 
        deque.addFirst(55);
        actual = actual + " " + deque.removeFirst();
        actual = actual + " " + deque.removeLast();
        actual = actual + " " + deque.removeFirst();
        actual = actual + " " + deque.removeLast();
        deque.addLast(88);
        deque.addLast(77);
        deque.addFirst(66); 
        deque.addFirst(55);
        actual = actual + " " + deque.removeLast();
        actual = actual + " " + deque.removeFirst();
        actual = actual + " " + deque.removeLast();
        actual = actual + " " + deque.removeFirst();
        actual = actual + " ]";

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 0);
    }

    @Test
    public void test12(){
        //setup
        String expected = "[ 55 66 88 77 77 55 88 66 ]";
        String actual = "[";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addFirst(88);
        deque.addFirst(77);
        deque.addFirst(66); 
        deque.addLast(55);
        actual = actual + " " + deque.removeLast();
        actual = actual + " " + deque.removeFirst();
        actual = actual + " " + deque.removeLast();
        actual = actual + " " + deque.removeFirst();
        deque.addFirst(88);
        deque.addLast(77);
        deque.addFirst(66); 
        deque.addFirst(55);
        actual = actual + " " + deque.removeLast();
        actual = actual + " " + deque.removeFirst();
        actual = actual + " " + deque.removeLast();
        actual = actual + " " + deque.removeLast();
        actual = actual + " ]";

        //analyze
        assertEquals(expected, actual);
        assertEquals(deque.size(), 0);
    }

    @Test
    public void test13(){
        //setup
        String expected = "[ 55 66 77 88 ]";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addLast(77);
        deque.addFirst(66);
        deque.addLast(88);
        deque.addFirst(55);
        String actual = "[";
        for(Integer e: deque)
            actual = actual + " " + e.toString();
        actual = actual + " ]";    

        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void test14(){
        //setup
        String expected = "[ 55 66 77 88 ]";
        
        //invoke
        Deque<Integer> deque = new NodeDeque<Integer>();
        deque.addLast(77);
        deque.addLast(88);
        deque.addFirst(66);
        deque.addFirst(55);
        String actual = "[";
        for(Integer e: deque)
            actual = actual + " " + e.toString();
        actual = actual + " ]";  

        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void test15(){
        Deque<Integer> deque = new NodeDeque<Integer>();
        for(int i=0; i<1000; i++){
            if(i%10==0)
                deque.addFirst(i);
            else if(i%50 == 0)
                deque.removeLast();
            else if(i%80 == 0)
                deque.removeFirst();
            else deque.addLast(i);        
        }
        int i = 0;
        String str = "";
        for(Integer s: deque){
            if(i%40==0)
               str = str + s + " ";
            i++;   
        }
        String expected = "990 590 190 23 67 112 156 201 245 289 334 378 423 467 512 556 601 645 689 734 778 823 867 912 956 ";
        assertEquals(expected, str);
    }
}

import java.util.*;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyQueueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyQueueTest{
    @Test
    public void testAdd(){
        MyQueue<Integer> q1 = new MyQueue<Integer>();
        ArrayList a1 = new ArrayList();
        int i = 0;
        while(i<12){
            q1.add(i);
            a1.add(i);
            i++;
        }
        //q1.print();
        int k = 0;
        while(k<a1.size()){
            Object j = (Integer)q1.remove();
            //System.out.println("Removed element: "+j);
            //System.out.println("Retrieved arrayList element: "+a1.get(k));
            assert a1.get(k) == j;
            //System.out.println("Size: "+q1.size());
            k++;
        }

        MyQueue<Integer> q2 = new MyQueue<Integer>();
        assert q2.empty() == true;
        assert q2.remove() == null;
        q2.add(14);
        assert q2.remove() == 14;

        MyQueue<Integer> q3 = new MyQueue<Integer>();
        q3.add(8);
        assert q3.remove() == 8;
    }

    @Test
    public void testPeek(){
        MyQueue<Integer> q1 = new MyQueue<Integer>();
        int i = 0;
        while(i<12){
            q1.add(i);
            i++;
        }
        assert q1.peek() == 0;
        
        MyQueue<Integer> q2 = new MyQueue<Integer>();
        assert q2.peek() == null;
        
        MyQueue<Integer> q3 = new MyQueue<Integer>(8);
        assert q3.peek() == 8;
    }

    @Test
    public void testRemove(){
        MyQueue<Integer> q1 = new MyQueue<Integer>();
        ArrayList a1 = new ArrayList();
        int i = 0;
        while(i<12){
            q1.add(i);
            a1.add(i);
            i++;
        }
        //q1.print();
        int k = 0;
        //int size = q1.size();
        while(k<a1.size()){
            //q1.print();
            Object j = (Integer)q1.remove();
            //System.out.println("Removed element: "+j);
            //System.out.println("Retrieved arrayList element: "+a1.get(k));
            assert a1.get(k) == j;
            //System.out.println("Size: "+q1.size());
            k++;
        }
    }
}

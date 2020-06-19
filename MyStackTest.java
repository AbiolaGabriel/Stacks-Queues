import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MyStackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MyStackTest{
    @Test
    public void testEmpty(){
        MyStack<Integer> s1 = new MyStack<Integer>();
        int i = 0;
        while(i<12){
            int k = 0;
            s1.push(i);
            i++;
        }

        assert s1.empty() == false;

        MyStack<Integer> s2 = new MyStack<Integer>();
        assert s2.empty() == true;

        MyStack<Integer> s3 = new MyStack<Integer>();
        s3.push(8);
        assert s3.empty() == false;
        s3.pop();
        assert s3.empty() == true;
    }

    @Test
    public void testPeek(){
        MyStack<Integer> s1 = new MyStack<Integer>();
        int i = 0;
        while(i<12){
            int k = 0;
            s1.push(i);
            i++;
        }
        assert 11 == s1.peek();

        MyStack<Integer> s2 = new MyStack<Integer>();
        assert s2.peek() == null;

        MyStack<Integer> s3 = new MyStack<Integer>(12);
        assert s3.peek() == 12;
        s3.pop();
        assert s3.peek() == null;
    }

    @Test
    public void testPop(){
        MyStack<Integer> s1 = new MyStack<Integer>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        int i = 0;
        while(i<12){
            int k = 0;
            s1.push(i);
            a1.add(i);
            i++;
        }

        int k = s1.size()-1;
        while(k>0){
            int j = s1.pop();
            //System.out.println("Popped element: "+j);
            //System.out.println("Retrieved arrayList element: "+a1.get(k));
            assert a1.get(k) == j;
            //System.out.println("Size: "+s1.size());
            k--;
        }

        MyStack<Integer> s2 = new MyStack<Integer>();
        assert s2.pop() == null;

        MyStack<Integer> s3 = new MyStack<Integer>();
        s3.push(8);
        assert s3.pop() == 8;
        assert s3.pop() == null;
    }

    @Test
    public void testPush(){
        MyStack<Integer> s1 = new MyStack<Integer>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        int i = 0;
        while(i<12){
            int k = 0;
            s1.push(i);
            a1.add(i);
            i++;
        }

        int k = s1.size()-1;
        while(k>0){
            int j = s1.pop();
            //System.out.println("Popped element: "+j);
            //System.out.println("Retrieved arrayList element: "+a1.get(k));
            assert a1.get(k) == j;
            //System.out.println("Size: "+s1.size());
            k--;
        }
    }

    @Test
    public void testSearch(){
        MyStack<Integer> s1 = new MyStack<Integer>();
        int i = 0;
        while(i<12){
            int k = 0;
            s1.push(i);
            i++;
        }

        int y = 12;
        for(int j = 0; j<s1.size(); j++){
            int x = s1.search(j);
            //System.out.println(x);
            assert x == y;
            y--;
        }
        
        assert s1.search(22) == -1;
        
        MyStack<Integer> s2 = new MyStack<Integer>();
        assert s2.search(0) == -1;
        
        MyStack<Integer> s3 = new MyStack<Integer>(12);
        //System.out.println(s3.search(12));
        assert s3.search(12) == 1;
    }
}

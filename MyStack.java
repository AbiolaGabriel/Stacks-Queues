import java.util.*;
/**
 * I am implementing my linkedlist as a Stack 
 *
 * @Abiola Gabriel Olofin 
 */
public class MyStack<A> implements StackInterface<A>{
    private MyLinkedList<A> list;
    private int size;
    public MyStack(){
        this.list = new MyLinkedList<A>();
        this.size = 0;
    }

    public MyStack(A a) {
        this.list = new MyLinkedList<A>(a);
        this.size = 1;
    }

    /**
     * In this method, it is checking if the stack is empty or not
     * based on the size of the linkedlist
     * that is being used to implement the stack
     * 
     * @param - none 
     */
    @Override
    public boolean empty() {
        if(this.size == 0){
            return true;
        }
        return false;
    }

    /**
     * In this method, it is looking at the top element in the stack 
     * 
     * @param - none
     */
    @Override
    public A peek() {
        if(this.empty() == true){
            return null;
        }
        else{
            return this.list.tail.getCurrentValue();
        }
    }

    /**
     * In this method, it is removing elements from the stack
     * starting from the top
     * 
     * @param - none 
     */
    @Override
    public A pop(){
        A temp;
        if(this.empty() == true){
            return null;
        }
        else if(this.size == 1){
            temp = this.list.head.getCurrentValue();
            this.list = null;
            this.size--;
        }
        else if(this.size == 0){
            return null;
        }
        else{
            temp = this.list.getElement(this.size-1);
            this.list.tail = null;
            this.size--;
        }
        return temp;
    }

    /**
     * This method adds an item to the top of the stack
     * 
     * @param - an item which will first add a value to the head node
     * if it does not have a value. Otherwise, it will add the item
     * to the top of the stack
     * 
     * @param - an item which is the value of the node
     */
    @Override
    public A push(A item){
        if(this.size == 0 && this.list.head.getCurrentValue() == null){
            this.list.head.setValue(item);
            this.size++;
            return item;
        }
        else{
            this.list.addEnd(item);
            this.size++;
            return item;
        }
    }

    /**
     * This method Returns the distance from the top of the
     * stack of the occurrence that is nearest the top of the stack
     * The topmost item is considered to be at distance 1; the next item is 
     * at distance 2; etc. 
     * 
     * @param - Object o which will the the value of the node
     * we are searching for
     */
    @Override
    public int search(Object o){
        int x = this.size;
        MyLinkedList<A>.Node<A> curr = this.list.head;
        if(o == curr.getCurrentValue() && curr.next == null){
            return x;
        }
        while(curr.next != null){
            if(o == curr.getCurrentValue()){
                return x;
            }
            x--;
            curr = curr.getNext();
            if(o == curr.getCurrentValue() && curr.next == null){
                return x;
            }
        }
        return -1;
    }

    /**
     * This method returns the size of the stack
     */
    public int size(){
        return this.size;
    }

    /**
     * This method prints out the elements in the stack 
     * starting from the bottom
     */
    public void print(){
        this.list.print();
    }
}

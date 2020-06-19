
/**
 * This class implements MyLinkedList as a queue
 *
 * @Abiola Gabriel Olofin
 */
public class MyQueue<A> implements QueueInteface<A>{
    private MyLinkedList<A> list;
    private int size;
    public MyQueue(){
        this.list = new MyLinkedList<A>();
        this.size = 0;
    }

    public MyQueue(A a){
        this.list = new MyLinkedList<A>(a);
        this.size = 1;
    }

    /**
     * In this method, it is checking if the queue is empty or not
     * based on the size of the linkedlist
     * that is being used to implement the stack
     * 
     * @param - none 
     */
    public boolean empty() {
        if(this.size == 0){
            return true;
        }
        return false;
    }

    /**
     * This methods adds an element into the queue
     * 
     * @param - an item which will first add a value to the head node
     * if it does not have a value. Otherwise, it will add the item
     * to the back of the queue
     */
    public A add(A item){
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
     * In this method, it is looking at the front element in the queue 
     * 
     * @param - none
     */
    @Override
    public A peek() {
        return(this.list.head.getCurrentValue());
    }

    /**
     * In this method, it is removing elements from the queue
     * starting from the front
     * 
     * @param - none 
     */
    @Override
    public A remove() {
        A temp;
        if(this.size == 0){
            return null;
        }
        else if(this.size == 1){
            temp = this.list.head.getCurrentValue();
            this.list = null;
            this.size --;
        }
        else{
            temp = this.list.head.getCurrentValue();
            this.list.head = this.list.head.next;
            //this.list.head = null;
            this.size--;
        }
        return temp;
    }

    /**
     * This method returns the size of the queue
     */
    public int size(){
        return this.size;
    }

    /**
     * This method prints out the elements in the queue 
     * starting from the front
     */
    public void print(){
        this.list.print();
    }
}

import java.util.*;
/**
 * 
 */
public class MyLinkedList<A> implements Iterable<A>{
    Node<A> head;
    Node<A> tail;
    /**
     * MyLinkedList constructor creates a new MyLinkedList object that 
     * creates a new node with object of the a generic class and creates a
     * head and tail node
     * 
     * @param A a variable 'a' is an object of A which is a generic class
     */
    public MyLinkedList(A a){
        Node<A> node1 = new Node<A>(a);
        this.head = node1;
        this.tail = node1;
    }

    public MyLinkedList(){
        Node<A> node1 = new Node<A>();
        this.head = node1;
        this.tail = node1;
    }

    /**
     * This method returns the head of the linked list
     * 
     * @param - there's none 
     */
    public Node returnHead(){
        return head;
    }

    /**
     * This method returns the tail of the linked list
     * 
     * @param - there's none 
     */
    public Node returnTail(){
        return tail;
    }

    /**
     * This method returns the Node at a specific point in the list 
     * 
     * @param - an integer that will allow the method move through the list until it reaches the "index" of the Node
     */
    public Node getNode(int b){
        Node<A> temp = new Node();
        while(b>1){
            temp = head.getNext();
            b--;
        }
        return temp;
    }

    /**
     * addFirst function adds an element in a new Node to 
     * the beginning of each Linked list
     * 
     * @return  void  
     * @param   a  variable 'a' is an object of a generic class 
     */
    public void addFirst(A a){
        Node newNode = new Node<A>(a);
        newNode.setNext(this.head);
        head = newNode;
        tail = newNode.getNext();
    }

    /**
     * addEnd function adds an element in a new Node to
     * the end of each Linked List
     *
     * @return  void
     * @param   a variable 'a' is an object of a generic class
     */
    public void addEnd(A a){
        Node newNode = new Node<A>(a);
        this.tail.setNext(newNode);
        this.tail = newNode;
        newNode.setNext(null);
    }

    /**
     * getElement function gets an element from a node 
     * in a Linked List based on which node the user wants
     * 
     * @return  A which is the current value of the node 
     * which is an object of a generic class
     * @param   int b variable 'b' is an integer 
     * that tells the while loop which node to stop at and return the node's value
     */
    public A getElement(int b){
        Node<A> temp = this.head;
        int x = 0;
        while(x<b && temp.next!= null){
            temp = temp.getNext();
            x++;
        }
        return temp.getCurrentValue();
    }

    /**
     * This method returns a new MyLinkedListIteraror object which is the iterator for the MyLinkedList class
     * 
     * @param - there's none
     */
    public Iterator<A> iterator(){
        return new MyLinkedListIterator<A>(this);
    }

    /**
     * print function prints out the element of each node 
     * as long as there a next node
     * 
     * @return  void
     */
    public void print(){
        Node<A> temp = new Node();
        temp = this.head;
        while(temp.getNext() != null){
            System.out.println(temp.getCurrentValue());
            temp = temp.getNext();
            if(temp.getNext() == null){
                System.out.println(temp.getCurrentValue());
            }
        }
    }

    /**
     * isEmpty method checks to see if the linkedList is empty 
     * which is determined by whether the head does not have a next and does not have a value
     * 
     * @return boolean - it returns true or false 
     * @param there's none
     */
    public boolean isEmpty(){
        if(head.getNext() == null && head.getCurrentValue() == null){
            return true;
        }
        return false;
    }
    class Node<A>{
        //Variable to store node after current node
        Node<A> next;  

        A a;

        /**
         * Node default constructor sets next to null
         * and sets a to null as well
         */
        public Node(){
            next = null;
            this.a = null;
        }

        /**
         * Node constructor creates sets next to null
         * and sets this.a to the a in the param
         * 
         * @param   a variable 'a' is a object of a generic class
         */
        public Node(A a){
            this.next = null;
            this.a = a;
        }

        /**
         * getCurrentValue function gets the value of the current node
         * 
         * @return an object of the a generic class which is stored in the node
         * @param is nothing
         */
        public A getCurrentValue(){
            return this.a;
        }

        /**
         * getNext function gets the next node in the linked list
         * 
         * @return a node which is the next node
         * @param is nothing
         */
        public Node getNext(){
            return this.next;
        }

        /**
         * setValue function sets the value of a node to variable 'a'
         * which is an object of a generic class called A
         * 
         * @return  void
         * @param   a   variable 'a' is an object of a generic class
         */
        public void setValue(A a){
            this.a = a;
        }

        /**
         * setNext function sets a new node as the next node 
         * that a previous node will point to 
         * 
         * @return  void
         * @param   Node n  n is a Node which the previous node will point to when n is set as next
         */
        public void setNext(Node n){
            this.next = n;
        }
    }

    class MyLinkedListIterator<A> implements Iterator<A>{
        Node<A> current;
        public MyLinkedListIterator(MyLinkedList<A> list){
            this.current = list.returnHead();
        }
        //this returns true or false whether the current node has a next 
        public boolean hasNext(){
            return current !=null;
        }

        //this returns the value of the current node then updates the current node to the next node 
        public A next(){
            A element = this.current.getCurrentValue();
            //System.out.println(element);
            this.current = this.current.getNext();
            return element;
        }

    }

    // public static void main(String[]args){
    // MyLinkedList<Integer> list = new MyLinkedList<Integer>(Integer.valueOf(0));
    // for(int i = 1; i<20; i++){
    // list.addEnd(Integer.valueOf(i));
    // }

    // for(Integer x : list){
    // System.out.println(x);
    // }
}
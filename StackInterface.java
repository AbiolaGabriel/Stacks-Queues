
/**
 * This is an interface for MyStack class to implement these methods
 *
 * @Abiola Gabriel Olofin
 * 
 */
public interface StackInterface<A>{
    boolean empty();
    A peek();
    A pop();
    A push(A item);
    int search(Object o);
}

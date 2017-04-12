/**
 * Created by cse on 21.03.2017.
 */
import java.util.NoSuchElementException;
public class StackC<E> implements StackInterface<E> {

    // Data Fields
    /** The reference to the first stack node. */
    private Node<E> topOfStackRef = null;
    private int size=0;


    /** Insert a new item on top of the stack.
     @post The new item is the top item on the stack.
     All other items are one position lower.
     @param obj The item to be inserted
     @return The item that was inserted
     */
    @Override
    public E push(E obj) {
        topOfStackRef = new Node<>(obj, topOfStackRef);
        size++;
        return obj;
    }
    /** Remove and return the top item on the stack.
     @pre The stack is not empty.
     @post The top item on the stack has been
     removed and the stack is one item smaller.
     @return The top item on the stack
     @throws NoSuchElementException if the stack is empty
     */
    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        else {
            E result = topOfStackRef.data;
            topOfStackRef = topOfStackRef.next;
            size--;
            return result;
        }
    }


    /** See whether the stack is empty.
     @return true if the stack is empty
     */
    @Override
    public boolean isEmpty() {
        return topOfStackRef == null;
    }


    /**
     * Returns the total amount of elements this stack has.
     * @return total amount of elements.
     */
    @Override
    public int size(){
        return size;
    }

    private Node<E> getNode(int index) {
        Node<E> node = topOfStackRef;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int i=size-1; i>=0; i--){
            result.append(getNode(i).data);
            result.append(',');

        }
        result.deleteCharAt(result.length()-1);

        return result.toString();
    }


    /** A Node is the building block for a single‐linked list. */
    private static class Node<E> {
// Data Fields
        /** The reference to the data. */
        private E data;
        /** The reference to the next node. */
        private Node<E> next;
// Constructors
        /** Creates a new node with a null next field.
         @param dataItem The data stored
         */
        private Node(E dataItem) {
            data = dataItem;
            next = null;
        }
        /** Creates a new node that references another node.
         @param dataItem The data stored
         @param nodeRef The node referenced by new node
         */
        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }

}

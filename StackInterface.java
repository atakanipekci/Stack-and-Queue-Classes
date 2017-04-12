/**
 * Created by cse on 21.03.2017.
 */
public interface StackInterface<E> {

    /** Pushes an item onto the top of the stack and returns
     the item pushed.
     @param obj The object to be inserted
     @return The object inserted
     */
    E push(E obj);

    /** Returns the object at the top of the stack
     and removes it.
     @post The stack is one item smaller.
     @return The object at the top of the stack
     @throws NoSuchElementException if stack is empty
     */
    E pop();
    /** Returns true if the stack is empty; otherwise,
     returns false.
     @return true (false) if the stack is empty (not empty)
     */
    boolean isEmpty();

    /**
     * Returns the total amount of elements this stack has.
     * @return total amount of elements.
     */
    int size();

}

import java.util.*;

/**
 * Created by cse on 22.03.2017.
 */
public class StackD<E> implements StackInterface<E> {
    private Queue<E> myList = new LinkedList<E>();
    private int size=0;

    /** Pushes an item onto the top of the stack and returns
     the item pushed.
     @param obj The object to be inserted
     @return The object inserted
     */
    @Override
    public E push(E obj){
        Queue<E> list2 = new LinkedList<E>();
        list2.add(obj);
        for(int i=0; i<size(); i++){
            list2.add(myList.remove());
        }
        myList = list2;
        size++;
        return obj;
    }
    /** Returns the object at the top of the stack
     and removes it.
     @post The stack is one item smaller.
     @return The object at the top of the stack
     @throws NoSuchElementException if stack is empty
     */
    @Override
    public E pop(){
        if(isEmpty()!=true)
            size--;
        return myList.remove();
    }

    /** Returns true if the stack is empty; otherwise,
     returns false.
     @return true (false) if the stack is empty (not empty)
     */
    @Override
    public boolean isEmpty(){

        int i= size();
        return i == 0 ? true : false;
    }

    /**
     * Returns the total amount of elements this stack has.
     * @return total amount of elements.
     */
    @Override
    public int size(){
        return size;
    }

    @Override
    public String toString(){

        String substr = myList.toString().substring(1,myList.toString().length()-1);
        String sarr[] = substr.split(", ");
        StringBuilder result = new StringBuilder();

        for(int i =sarr.length-1; i>=0; i--){
            result.append(sarr[i]);
            result.append(',');
        }
        result.deleteCharAt(result.length()-1);

        return result.toString();
    }

}

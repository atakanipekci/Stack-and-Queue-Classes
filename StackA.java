import java.util.ArrayList;
import java.util.NoSuchElementException;
/**
 * Created by cse on 21.03.2017.
 */
public class StackA<E> extends ArrayList<E> implements StackInterface<E> {



    StackA(){

        super();

    }
    /** Pushes an item onto the top of the stack and returns
     the item pushed.
     @param obj The object to be inserted
     @return The object inserted
     */
    @Override
    public E push(E obj){
        add(obj);
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
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        else {
            int i = size() - 1;
            E temp = get(i);
            remove(i);
            return temp;
        }
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
        return super.size();
    }


    @Override
    public String toString(){

        String substr = super.toString().substring(1,super.toString().length()-1);
        String sarr[] = substr.split(", ");
        StringBuilder result = new StringBuilder();

        for(int i =0; i<sarr.length; i++){
            result.append(sarr[i]);
            result.append(',');
        }
        result.deleteCharAt(result.length()-1);

        return result.toString();
    }

}

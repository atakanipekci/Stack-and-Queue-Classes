/**
 * Created by cse on 23.03.2017.
 */
import java.lang.reflect.Array;
import java.util.*;

public class myQueue<E> extends KWLinkedList<E> {


    myQueue(){
        super();
    }





    /**
     * Reverses this "myQueue"
     */
    public void reverse(){

        int j =0;
        for(int i=super.size()-1; i!=j; i--,j++){

            E data1,data2;
            data1=super.get(i);
            data2=super.get(j);

            super.set(i,data2);
            super.set(j,data1);

        }


    }

    /**
     * Reverses the given queue object
     * @param q queue object to reverse
     */
    public void reverseQueue(Queue<E> q){
        KWLinkedList<E> q2 = new KWLinkedList<E>();

        reverseHelper(q,q2);

       for(int i = q2.size()-1 ; i>=0 ; i--){

            q.add(q2.get(i));
        }


    }

    /**
     * Helper method for recursive reverse
     * @param q elements will be taken from this queue
     * @param q2 elements that are taken from q will be added to this
     */
    private void reverseHelper(Queue<E> q,KWLinkedList<E> q2 ){

        E data;

        while(q.size()>0){
            data=q.poll();
            q2.add(data);


            reverseHelper(q,q2);
        }

    }

    @Override
    public String toString(){

        StringBuilder result = new StringBuilder();

        for(int i=0; i<super.size(); i++){
            result.append(super.get(i));
            result.append(',');
        }
        result.deleteCharAt(result.length()-1);

        return result.toString();
    }
}

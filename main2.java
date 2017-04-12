/**
 * Created by Taha Atakan İpekçi on 21.03.2017.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.*;
import java.util.*;
public class main2 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("test.csv"));
            Scanner dataScanner = null;
            PrintWriter pw = new PrintWriter(new File("testResult_2.csv"));
            myQueue<myQueue> result = new myQueue<myQueue>();
            myQueue<Object> forReverse = new myQueue<Object>();
            Queue<Object> result2 = new LinkedList<Object>();

            while (scanner.hasNextLine()) {
                dataScanner = new Scanner(scanner.nextLine());
                dataScanner.useDelimiter(",");
                myQueue<Object> Line = new myQueue<Object>();
                while (dataScanner.hasNext()) {
                    Object data = dataScanner.next();

                    Line.add(data);


                }

                Line.reverse();
                result.add(Line);



            }
            for(int i =result.size()-1; i>=0; i--)
            pw.write(result.get(i).toString()+"\n");


            scanner.close();

            scanner = new Scanner(new File("test.csv"));
            dataScanner = null;

            while (scanner.hasNextLine()) {
                dataScanner = new Scanner(scanner.nextLine());
                dataScanner.useDelimiter(",");
                Queue<Object> Line = new LinkedList<Object>();
                while (dataScanner.hasNext()) {
                    Object data = dataScanner.next();

                    Line.add(data);


                }

                forReverse.reverseQueue(Line);
                result2.add(Line.toString().substring(1,Line.toString().length()-1));



            }
            forReverse.reverseQueue(result2);
            int j =result2.size();
            for(int i =0; i<j; i++) {

                pw.write(result2.poll().toString()+"\n" );
            }

        pw.close();
        }catch(NoSuchElementException e){
            System.out.println("NoSuchElementException is thrown!!!");
        }catch(FileNotFoundException e){
            System.out.println("File Not Found !!!");
        }
    }
}
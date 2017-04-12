/**
 * Created by Taha Atakan İpekçi on 21.03.2017.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.*;
import java.util.*;
public class main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("test.csv"));
            Scanner dataScanner = null;
            PrintWriter pw = new PrintWriter(new File("testResult_1.csv"));


            while (scanner.hasNextLine()) {
                dataScanner = new Scanner(scanner.nextLine());
                dataScanner.useDelimiter(",");

                StackA<Object> stack1= new StackA<Object>();
                StackB<Object> stack2= new StackB<Object>();
                StackC<Object> stack3= new StackC<Object>();
                StackD<Object> stack4= new StackD<Object>();


                while (dataScanner.hasNext()) {
                    Object data = dataScanner.next();

                    stack1.push(data);
                    stack2.push(data);
                    stack3.push(data);
                    stack4.push(data);

                }

                pw.write(stack1.size()+","+stack1.toString()+'\n');
                pw.write(stack2.size()+","+stack2.toString()+'\n');
                pw.write(stack3.size()+","+stack3.toString()+'\n');
                pw.write(stack4.size()+","+stack4.toString()+'\n');




            }
            pw.close();
            scanner.close();




        }catch(NoSuchElementException e){
            System.out.println("NoSuchElementException is thrown!!!");
        }catch(FileNotFoundException e){
            System.out.println("File Not Found !!!");
        }
    }
}
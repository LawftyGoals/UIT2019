package RemoveStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.*;


public class RemoveStrings {

    static PrintWriter output;
    static File sourceFile, temp;
    static Scanner input;

    public static void main(String[] args) throws Exception{

        try {
            sourceFile = new File(args[1]);

            input = new Scanner(sourceFile);


            String s1;
            String s2= "";

            while (input.hasNext()) {
                s1 = input.nextLine();
                System.out.println("Reading and removing " + args[0] + " from file.");
                s2 += s1.replace(args[0], "") + System.lineSeparator();
                System.out.println("Done!");
            }


            System.out.println("Writing back to file!");

            output = new PrintWriter(sourceFile);

            output.println(s2);


        } catch (FileNotFoundException ex){
            System.out.println("File '" + args[0] + "' not found.");

        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Failed input: " + ex);

        } catch (NullPointerException ex){
            ex.printStackTrace(System.err);

        } finally {
            output.close();
        }

    }

}

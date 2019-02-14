package ReadResults;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadResults {

    static File file;
    static double sum, counter, average;

    ReadResults(){

        this.sum = 0;
        this.counter = 0;
        this.average = 0;

    }


    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        boolean conti = true;

        System.out.print("Input file name: ");
        String pathway = input.nextLine();

        do{
            file = new File(pathway);


            try (Scanner sc = new Scanner(file);){
                while(sc.hasNext()){
                    sum+=sc.nextDouble();
                    counter++;
                    conti = false;
                }

                average = sum/counter;

                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);

            } catch (FileNotFoundException ex){
                pathway = input.nextLine();
                System.out.println("File not found.1");


            } catch (InputMismatchException ex){
                if(ex.getMessage() == null){
                    System.out.println("File may contain invalid content.");
                    conti = false;
                } else{
                    System.out.println("File not found.2");
                    pathway = input.nextLine();
                }

            }

        } while (conti);

    }

}

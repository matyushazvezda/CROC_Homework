package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class lab5 {
   public static int WordCount(File file) throws FileNotFoundException{
        Scanner in = new Scanner(file);
        int k = 0;
        while (in.hasNext()){
            in.next();
            ++k;
        }
        return k;
    }
    public static void main(String[] args) throws IllegalArgumentException {
        if (args.length==0) {
            throw new IllegalArgumentException();
        }
        try {

            File file = new File(args[0]);
            int k = WordCount(file);
            System.out.println("Ans:  "+k);
        }
        catch (FileNotFoundException f){
            System.out.println("Error file");
        }
    }
}

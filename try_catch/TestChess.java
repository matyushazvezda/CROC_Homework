package com.company;
import java.util.Scanner;

/**
 * class for the test
 * @author matyushazvezda
 */

public class TestChess {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try {
                int x,y;
                x=in.nextInt();
                y=in.nextInt();
                ChessBoard cb = new ChessBoard(x,y);
                System.out.println(cb.toString());
        }
        catch (IllegalArgumentException x){
            System.out.println(x);
        }
    }
}

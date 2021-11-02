package com.company;
/**
 *
 * @author matyushazvezda
 */


public class ChessBoard {

    private int x;
    private int y;

    //returns the coordinate by x
    public int getX(){
        return this.x;
    }
    //returns the coordinate by y
    public int getY(){
        return this.y;
    }
    //method sets x and y coordinates with accuracy data check
    public ChessBoard(int x, int y) throws IllegalArgumentException{
        if (x>7 || y>7 || y<0 || x<0){
            throw new IllegalArgumentException("incorrect data entry");
        }
        else{
            this.x=x;
            this.y=y;
        }
    }
    //method sets y coordinates with accuracy data check
    public void setX(int x) throws IllegalArgumentException{
        if (x>7 || x<0){
            throw new IllegalArgumentException("incorrect data entry");
        }
        else {
            this.x=x;
        }
    }
    //method sets x coordinates with accuracy data check
    public void setY(int y) throws IllegalArgumentException{
        if (y>7 || y<0){
            throw new IllegalArgumentException("incorrect data entry");
        }
        else {
            this.y=y;
        }
    }
    //method print the coordinates to the console in form of a letter and a number
    public String toString(){
        this.y+=97;
        return String.format("your coordinate: %s%d",(char)this.y,this.x+1);
    }

}

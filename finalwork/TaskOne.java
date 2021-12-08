package com.company;
/**
 * class for file with task one
 * variant is 3
 * @author matyushazvezda
 */
public class TaskOne {
    private String productName;
    private int amount;

    public TaskOne(String name, int value){
        this.amount = value;
        this.productName = name;
    }
    public TaskOne(){
    }
    public String getProductName(){
        return this.productName;
    }
    public void setProductName(String name){
         this.productName = name;
    }
    public int getAmount(){
        return this.amount;
    }
    public void setAmount(int value){
        this.amount = value;
    }
    @Override
    public String toString(){
        return "Product = " + this.productName+ "; "
                +"Amount = " + this.amount;
    }
}

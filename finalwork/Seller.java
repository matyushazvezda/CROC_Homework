package com.company;
/**
 * class for file with seller
 * @author matyushazvezda
 */
public class Seller {
    private int id;
    private String surname;
    private String name;

    public Seller(){
    }

    public int getSellerID(){
        return this.id;
    }

    public String getSellerSurname(){
        return this.surname;
    }

    public String getSellerName(){
        return this.name;
    }

    public void setSellerID(int id){
        this.id = id;
    }
    public void setSellerSurname(String surname){
        this.surname = surname;
    }
    public void setSellerName(String name){
        this.name = name;
    }


    @Override
    public String toString(){
        return "Seller ID = " + this.id + "; "
                +"Seller name = " + this.name +"; "
                +"Seller surname = " + this.surname;
    }
}

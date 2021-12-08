package com.company;
/**
 * class for file with seller with products
 * @author matyushazvezda
 */
public class SellerWithProducts {

    private int sellerID;
    private int productID;
    private int price;
    private int amount;

    public SellerWithProducts(){
    }

    public int getSellerID(){
        return this.sellerID;
    }

    public int getProductID(){
        return this.productID;
    }

    public int getPrice(){
        return this.price;
    }
    public int getAmount(){
        return this.amount;
    }

    public void setSellerID(int id){
        this.sellerID = id;
    }

    public void setProductID(int id){
        this.productID = id;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Seller ID = " + this.sellerID + "; "
                +"Product ID = " + this.productID +"; "
                +"Price = " + this.price + "; "
                +"Amount = " + this.amount;
    }
}
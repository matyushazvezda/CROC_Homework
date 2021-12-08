package com.company;

import java.util.Date;
/**
 * class for file with sold products
 * @author matyushazvezda
 */
public class ProductSold {
        private int soldID;
        private int sellerID;
        private int productID;
        private int amount;
        private Date date;

        public ProductSold(){
        }

        public int getSoldID(){
            return this.soldID;
        }

        public int getSellerID(){
            return this.sellerID;
        }

        public int getProductID(){
            return this.productID;
        }
          public int getAmount(){
        return this.amount;
        }
        public Date getDate(){
            return this.date;
        }

        public void setSoldID(int id){
            this.soldID = id;
        }

        public void setSellerID(int id){
            this.sellerID = id;
        }

        public void setProductID(int id){
            this.productID = id;
        }
        public void setAmount(int amount){
            this.amount = amount;
        }
        public void setDate(Date date){
            this.date = date;
        }

        @Override
        public String toString(){
            return "Seller ID = " + this.sellerID + "; "
                    +"Product ID = " + this.productID +"; "
                    +"Sold ID = " + this.soldID + "; "
                    +"Amount = " + this.amount + "; "
                    +"Date = " + this.date;
        }

    }


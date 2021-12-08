package com.company;
/**
 * class for file with products
 * @author matyushazvezda
 */

    public class Product {
          private int id;
          private String  productName;

        public Product(){
        }

        public  int getProductID(){
            return this.id;
        }

        public  String getProductName(){
            return this.productName;
        }

        public void setID(int id){
            this.id = id;
        }

        public void setProductName(String name){
            this.productName = name;
        }

        @Override
        public String toString(){
            return "Product ID = " + this.id + "; "
                    +"Product name = " + this.productName;
        }

    }


package com.company;

import com.google.gson.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.*;
import java.util.*;

public class Finaltest {

    public static void ex1(Product[] v1, ProductSold[] v2){
       List<TaskOne> v = new LinkedList<>();
       int sum=0;
       for(Product i:v1){
           for(ProductSold j:v2){
               if(i.getProductID()==j.getProductID()){
                   v.add(new TaskOne(i.getProductName(), j.getAmount()));
               }
           }
       }
        try (Writer writer = new FileWriter("Output1.json")) {
            Gson gson = new GsonBuilder().create();
            for(TaskOne i : v) {
                gson.toJson(i, writer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static int AmountSell(ProductSold[] v4, Date date){
        // number of items sold on a given date
        int sum = 0;
        for(ProductSold i : v4){
            if(i.getDate().equals(date)){
                sum += i.getAmount();
            }
        }
        return sum;
    }

    //task 2
    public static void ex2(ProductSold[] v4) {
        //put dates in map
        Map<Date, Integer> map = new HashMap<>();
        for (ProductSold i : v4) {
            Date date = i.getDate();
            if (!map.containsKey(date))
                map.put(date, AmountSell(v4, date));
        }
        //put TaskTwo from map
        List<TaskTwo> v = new ArrayList<>();
        for (Map.Entry<Date, Integer> i : map.entrySet()) {
            TaskTwo item = new TaskTwo();
            v.add(item);
            item.setDate((Date) i.getKey());
            item.setAmount(i.getValue());
        }
        try (Writer writer = new FileWriter("Output2.json")) {
            Gson gson = new GsonBuilder().create();
            for(TaskTwo i : v) {
                gson.toJson(i, writer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        JsonReader in1 = new JsonReader(new FileReader("Product.json"));
        JsonReader in2 = new JsonReader(new FileReader("Seller.json"));
        JsonReader in3 = new JsonReader(new FileReader("SellerWithProducts.json"));
        JsonReader in4 = new JsonReader(new FileReader("ProductSold.json"));
        Gson gson = new GsonBuilder().setDateFormat("dd.MM.yyyy").create();

        Product[] product_info = gson.fromJson(in1, Product[].class);
        Seller[] seller_info = gson.fromJson(in2, Seller[].class);
        SellerWithProducts[] SWP_info = gson.fromJson(in3, SellerWithProducts[].class);
        ProductSold[] productSolds_info = gson.fromJson(in4, ProductSold[].class);
        in1.close();
        in2.close();
        in3.close();
        in4.close();

        ex1(product_info,productSolds_info);
        ex2(productSolds_info);
    }
}

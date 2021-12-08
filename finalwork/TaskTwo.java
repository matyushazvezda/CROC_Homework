package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * class for file with task two
 * variant is 0
 * @author matyushazvezda
 */
public class TaskTwo {
    private int amount;
    private String date;

    public TaskTwo(){

    }

    public TaskTwo(int value, String date) {
        this.amount = value;
        this.date = date;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getDate() {
        return this.date;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = new SimpleDateFormat("dd.MM.yyyy").format(date);
    }

    @Override
    public String toString() {
        return "Date = " + this.date + "\n"
                + "Amount = " + this.amount;
    }
}
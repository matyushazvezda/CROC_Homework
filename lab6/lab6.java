package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
/**
 * Lab6
 *
 * @author matyushazvezda
 */
public class lab6 {
    public static void main(String[] args) {
        // example line  КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики
        Scanner in = new Scanner(System.in);
        String ans="";
        String s = in.nextLine();
        // split the string into substrings
        String[] tokens = s.split("/");
        Deque<String> deq = new ArrayDeque<>();
        /**
         * fill the deq
         * if we met ".." and the deq is empty or last element is ".." then we add else delete last element
         * if we met
         * if we met a line other than "." and "..", then add to the deq
         */
        for (String test: tokens){
            if (test.equals("..")){
                if(deq.isEmpty() || deq.getLast().equals("..")){
                    deq.addLast(test);
                }
                else{
                    deq.removeLast();
                }
            }
            else if(!test.equals(".")){
                deq.addLast(test);
            }
        }
        //collecting the normalized string
        for(String S:deq){
            ans+=S+'/';
        }
        System.out.println(ans.substring(0,ans.length()-1));
    }
}

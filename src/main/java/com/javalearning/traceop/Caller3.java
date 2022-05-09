package com.javalearning.traceop;

public class Caller3 extends Caller{

    public static void main(String[] args) {
        String names[] = {"Thomas","Peter","Josepth"};
        String pwd[] = new String[3];
        int idx = 0;
        try{
            for(String n : names){
                pwd[idx] = n.substring(2,6);
                System.out.println(pwd[idx]);
                idx++;
            }
        }catch (Exception ex){
            System.out.println("inv");
        }
    }
}

package com.javalearning.traceop;

public class Caller {
    public void test(){
        System.out.println("A ");
    }

    public static int meThodX(){

        int j=0;

        try{
            if(j++>0){
                System.out.println("if this will exexute with j ="+j);
                return j;
            }else if(j==1){
                System.out.println("else this will execute with j="+j);
                return j;
            }
            throw new NullPointerException("throwing for test");
        }catch(NullPointerException e){
            System.out.println("inside the exception j="+j);
        }finally{
            System.out.println("finally supposed to execute ");
            j++;
        }

        return j;

    }

    public static void main(String[] args) {
        Caller.meThodX();
    }

}

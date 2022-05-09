package com.javalearning.interview;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int inputNo = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        if(inputNo % 10 != 0){
            throw new Exception("invalid input");
        }
        if(inputNo > 49){
            int substitute = inputNo / 50;
            sb.append(substitute);
            sb.append(" * 50 ");
            inputNo= inputNo % 50;
        }

        if(inputNo > 19){
            int substitute = inputNo / 20;
            sb.append(substitute);
            sb.append(" * 20 ");
            inputNo= inputNo % 20;
        }

        if(inputNo > 9){
            int substitute = inputNo / 10;
            sb.append(substitute);
            sb.append(" * 10 ");
        }

        System.out.println(sb.toString().trim());

    }
}

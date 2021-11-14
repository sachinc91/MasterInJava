package com.javalearning.arrays;

import java.util.Scanner;

public class subarrayWithGivenSum {

    public static void subArraySum1() {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int sum=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int csum=0,header=0,flag=0;
            for(int j=0;j<n;j++)
            {
                csum+=arr[j];
                while(csum>sum)

                {
                    csum=csum-arr[header];
                    header++;
                }
                if(csum==sum)
                {
                    flag=1;
                    System.out.println((header+1)+" "+(j+1));
                    break;

                }
            }
            if(flag==0)
                System.out.println(-1);

        }
    }

    public static void main(String[] args) {
        subArraySum1();
    }
}

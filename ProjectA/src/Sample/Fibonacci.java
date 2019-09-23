package Sample;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[])
    {
//        int n1=0,n2=1,n3,i,count=10;
//        System.out.print(n1+" "+n2);//printing 0 and 1
//
//        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
//        {
//            n3=n1+n2;
//            System.out.print(" "+n3);
//            n1=n2;
//            n2=n3;
//        }


        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }








    }





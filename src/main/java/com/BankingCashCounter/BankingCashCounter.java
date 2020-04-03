package com.BankingCashCounter;
import java.util.Scanner;
public class BankingCashCounter
{
   public static class Queue
    {
        static int amount = 5000;
        //method deposit amount add to original amount
        public  int insert(int value)
        {
            amount = amount + value;
            return amount;
        }

        //method withdraw amount from original amount
        public int remove(int value)
        {
            amount=amount-value;
            return amount;
        }
        //method check bank balance maintane or not
        public  boolean checkBankBalance(int value1,int amount1)
        {
            if(value1==amount1)
            {
                return true;
            }
            return false;
        }
    }
    //main method
    public static void main(String args[])
    {
        int result1=0;
        System.out.println("welcome to Banking Cash Counter");

        //class object created
        Queue object=new Queue();
        Scanner sc=new Scanner(System.in);
        System.out.println("how many people in queue");
        int peopleCount=sc.nextInt();

        while(peopleCount>0)
        {
            peopleCount--;
            System.out.println("enter value");
            int val = sc.nextInt();
            System.out.println("ask for choice");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 0:
                    System.out.println("Deposit money");
                    result1 = (object.insert(val));
                    System.out.println(result1);
                    break;
                case 1:
                    System.out.println("Withdraw money");
                    result1 = (object.remove(val));
                    System.out.println(result1);
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
            System.out.println(object.checkBankBalance(result1,Queue.amount));
    }
}

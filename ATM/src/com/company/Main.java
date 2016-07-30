package com.company;

import java.util.Scanner;

public class Main extends Balance {

    public static void main(String[] args) {

	    System.out.println("Please Enter Your 4 digit Pin Code");
        Scanner sc = new Scanner(System.in);
        getDebit Gd = new getDebit();
        Credit Cr = new Credit();
        Balance acBlnc = new Balance();
        int pin = 1234;
        int userPin;
        int userSel;
        int userMoney;
        userPin = sc.nextInt();
        if (pin == userPin){
            do {
                System.out.println("Please Select One of Them");
                System.out.println("1- For Debit");
                System.out.println("2- For Credit");
                System.out.println("3- For Check Balance");
                System.out.println("4- For Exit");
                userSel = sc.nextInt();

            if(userSel == 1){
                System.out.println("Please Enter Money You want to Debit : ");
                userMoney = sc.nextInt();
                acBlnc.getActualBalance(userMoney);
            }else if(userSel == 2){
                System.out.println("Please Enter Money You want to Credit Use : ");
                userMoney = sc.nextInt();
                String negative = "-"+userMoney;
                userMoney =Integer.parseInt(negative);
                acBlnc.getActualBalance(userMoney);

            }else if(userSel == 3){
                acBlnc.ActualBalance();
            }
            }while(userSel < 4);
            if(userSel == 4){
                System.out.println("Exit");
            }

        }else{
            System.out.println("You Enter Wrong Pin Code");
        }




    }
}

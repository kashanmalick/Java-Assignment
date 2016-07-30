package com.company;

/**
 * Created by Kashan on 25-07-2016.
 */
public class Balance {
   // int ActualBalance = 1000;
    int currentBalance = 1000;
    int actualBalnce;

    public String getActualBalance(int paisa){

        actualBalnce = currentBalance + paisa;
        currentBalance = actualBalnce;
        System.out.println("Your Current Balance are : "+currentBalance );
        return null;
    }
    public void ActualBalance(){
        System.out.println("Your Current Balance are : " +currentBalance);
    }
}

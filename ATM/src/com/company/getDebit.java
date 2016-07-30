package com.company;

import java.util.Scanner;

/**
 * Created by Kashan on 25-07-2016.
 */
public class getDebit {
    //Balance blnce = new Balance();
    Main parrent = new Main();

    public String GetDD(int Money) {
        int debitAmm = Money;
        int AcMoney = debitAmm + parrent.currentBalance;
        //System.out.println("Now Your Current Balance are : " + AcMoney);
        parrent.getActualBalance(AcMoney);
        return null;

    }

}

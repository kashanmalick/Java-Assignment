package com.company;

/**
 * Created by Kashan on 25-07-2016.
 */
public class Credit {
    //Balance blnc =  new Balance();
    getDebit GD = new getDebit();
    public  String getCredit (int Money){
        int crMoney = Money;
        if (crMoney > 0 && crMoney < GD.parrent.currentBalance) {
            int accMoney = GD.parrent.currentBalance - crMoney;
           // System.out.println("Now Your Current Balance are : " + accMoney);
            GD.parrent.getActualBalance(accMoney);

        }else if (crMoney < 0 || crMoney > GD.parrent.currentBalance){
            System.out.println("Please Enter Minimum Amount Your Current Balance are : " +GD.parrent.currentBalance);

        }
        return null;
    }
}

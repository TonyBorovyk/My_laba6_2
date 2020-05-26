package com.company;

public class Output {
    TransferOf_Money money = new TransferOf_Money();
    double m1 = money.Dollars;
    double m2 = money.Euro;
    double m3 = money.Grn;
    double m4 = money.Ruble;
    public void out(){
     System.out.println("\nНаявність валют: ");
        System.out.println("Доллари: "+ money.Dollars);
        System.out.println("Евро: "+ money.Euro);
        System.out.println("Гривні: "+ money.Grn);
        System.out.println("Рублі: "+ money.Ruble+"\n");
    }
  public void print(double c){
    if (c > 0)
        System.out.println("+ "+c);
    else{
        System.out.println(" " + c);
    }
}}

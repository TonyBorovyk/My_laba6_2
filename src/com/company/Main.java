package com.company;

public class Main {

    public static void main(String[] args) {
	TransferOf_Money money = new TransferOf_Money();
	Output o = new Output();
	o.out();
	Zvit z = new Zvit();
    int countTransActions = 30;
    while (countTransActions > 0){
        double mon = 50 + (int) (Math.random() * 400);
        int fromWhat = 1 + (int) (Math.random() * 4);
        int toWhat = 1 + (int) (Math.random() * 4);
        if(fromWhat!= toWhat &money.Dollars > 1000 & money.Euro > 1000 & money.Grn > 10000 & money.Ruble > 10000){
            System.out.println("Транзакція пройшла успішно");
            money.perevod(mon,fromWhat,toWhat);
            countTransActions--;
        }
        else {
            System.out.println("Неможливо провести транзацію!");
            countTransActions--;
        }

        }System.out.println("\nЗалишок валют: ");
        System.out.println("Доллари: "+ money.Dollars);
        System.out.println("Евро: "+ money.Euro);
        System.out.println("Гривні: "+ money.Grn);
        System.out.println("Рублі: "+ Math.abs(money.Ruble)+"\n");
        System.out.println("Дохід у валюті: ");
        o.print(money.Dollars  -o.m1);
        o.print(money.Euro - o.m2);
        o.print(money.Grn- o.m3);
        o.print(money.Ruble - o.m4);
        z.zvit(money.TransActions,money.Value);

    }

}

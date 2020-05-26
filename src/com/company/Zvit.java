package com.company;

public class Zvit {
    public void zvit(double[]arr,int[]arr1 ){
        TransferOf_Money m = new TransferOf_Money();
        Output o = new Output();
        String dol = "Dolr";
        String eu = "Euro";
        String gr = "Grn";
        String ru = "Ruble";
        int i = 0;
        int j = 0;
        System.out.println("\tЗвітність\n №   Вал. Сума   Вал. Сума"  );
        while(i >= 0){
            if(arr1[i] == 1 & arr1[i+1]==2){
                System.out.println(j+1 + " : " + dol + " "+ arr[i+1]+ " - "+eu +" "+ arr[i]);
                i+=2;
                j++;
            }else if(arr1[i] == 1 & arr1[i+1]==3){
                System.out.println(j+1 + " : " + dol + " "+ arr[i+1]+ " - "+gr +" "+ arr[i]);
                m.addDol+=arr[i+1];
                m.addGrn -= arr[i];
                i+=2;
                j++;
            }else if(arr1[i] == 1 & arr1[i+1]==4){
                System.out.println(j+1 + " : " + dol + " "+ arr[i+1]+ " - "+ru +" "+ arr[i]);
                m.addDol+=arr[i+1];
                m.addRub -= arr[i];
                i+=2;
                j++;
            }else if(arr1[i] == 2 & arr1[i+1]==1){
                System.out.println(j+1 + " : " + eu + " "+ arr[i+1]+ " - "+dol +" "+ arr[i]);
                m.addEu+=arr[i+1];
                m.addDol -= arr[i];
                i+=2;
                j++;
            }else if(arr1[i] == 2 & arr1[i+1]==3){
                System.out.println(j+1 + " : " + eu + " "+ arr[i+1]+ " - "+gr +" "+ arr[i]);
                m.addEu+=arr[i+1];
                m.addGrn -= arr[i];
                i+=2;
                j++;
            }else if(arr1[i] == 2 & arr1[i+1]==4){
                System.out.println(j+1 + " : " + eu + " "+ arr[i+1]+ " - "+ru +" "+ arr[i]);
                m.addEu+=arr[i];
                m.addRub -= arr[i];
                i+=2;
                j++;
            }else if(arr1[i] == 3 & arr1[i+1]==1){
                System.out.println(j+1 + " : " + gr + " "+ arr[i+1]+ " - "+dol +" "+ arr[i]);
                m.addGrn+=arr[i];
                m.addDol -= arr[i];
                i+=2;
                j++;
            }else if(arr1[i] == 3 & arr1[i+1]==2){
                System.out.println(j+1 + " : " + gr + " "+ arr[i+1]+ " - "+eu +" "+ arr[i]);
                m.addGrn+=arr[i];
                m.addEu -= arr[i];
                i+=2;
                j++;
            }else if(arr1[i] == 3 & arr1[i+1]==4){
                System.out.println(j+1 + " : " + gr + " "+ arr[i+1]+ " - "+ru +" "+ arr[i]);
                m.addGrn+=arr[i];
                m.addRub -= arr[i];
                i+=2;
                j++;
            }else if(arr1[i] == 4 & arr1[i+1]==1){
                System.out.println(j+1 + " : " + ru + " "+ arr[i+1]+ " - "+ dol +" "+ arr[i]);
                m.addRub+=arr[i];
                m.addDol -= arr[i];
                i+=2;
                j++;
            }else if(arr1[i] == 4 & arr1[i+1]==2){
                System.out.println(j+1 + " : " + ru + " "+ arr[i+1]+ " - "+eu +" "+ arr[i]);
                m.addRub+=arr[i];
                m.addEu -= arr[i];
                i+=2;
                j++;
            }else if(arr1[i] == 4 & arr1[i+1]==3){
                System.out.println(j+1 + " : " + ru + " "+ arr[i+1]+ " - "+gr +" "+ arr[i]);
                m.addRub+=arr[i+1];
                m.addGrn -= arr[i];
                i+=2;
                j++;
            }if (i >= 60){
                i = -100;
               }
        }
        }


}

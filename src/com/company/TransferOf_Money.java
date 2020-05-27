package com.company;

import javax.annotation.processing.SupportedSourceVersion;

public class TransferOf_Money {
    double addDol;
    double addEu;
    double addGrn;
    double addRub;
    double[] TransActions = new double[101];
    int[] Value = new int[100];
    double  Dollars = 10000 + (int) (Math.random() * 50000);// 1
    double Euro = 10000 + (int) (Math.random() * 50000);// 2
    double Grn = 10000 + (int) (Math.random() * 500000);// 3
    double Ruble = 10000 + (int) (Math.random() * 100000);// 4
    int counter = 0;
    ArrayForSort<Zvit> zvitnist;

    public void perevod(double clientMoney, int fromWhat, int inWhat) {

        if ((fromWhat != inWhat)) {
            if (fromWhat == 1 & inWhat == 2) {
                TransActions[counter] = Math.round(clientMoney * 0.903);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                TransActions[counter + 1] = clientMoney;
                Dollars += clientMoney;
                Euro -= TransActions[counter];
                counter += 2;
                addDol += clientMoney;
                addEu -= TransActions[counter];
            } else if (fromWhat == 1 & inWhat == 3) {
                TransActions[counter] = Math.round(clientMoney * 26.44);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                Dollars += clientMoney;
                Grn -= TransActions[counter];
                counter += 2;
                addDol += clientMoney;
                addGrn -= TransActions[counter];
            } else if (fromWhat == 1 & inWhat == 4) {
                TransActions[counter] = Math.round(clientMoney * 81.18);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                Dollars += clientMoney;
                Ruble -= TransActions[counter];
                counter += 2;
                addDol += clientMoney;
                addRub -= TransActions[counter];
            } else if (fromWhat == 2 & inWhat == 3) {
                TransActions[counter] = Math.round(clientMoney * 28.92);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                Euro += clientMoney;
                Grn -= TransActions[counter];
                counter += 2;
                addEu += clientMoney;
                addGrn -= TransActions[counter];
            } else if (fromWhat == 2 & inWhat == 4) {
                TransActions[counter] = Math.round(clientMoney * 94.52);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                Euro += clientMoney;
                Ruble -= TransActions[counter];
                counter += 2;
            } else if (fromWhat == 3 & inWhat == 4) {
                TransActions[counter] = Math.round(clientMoney * 94.52);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                Grn += clientMoney;
                Ruble -= TransActions[counter];
                counter += 2;
                addEu += clientMoney;
                addRub -= TransActions[counter];
            } else if (fromWhat == 2 & inWhat == 1) {
                TransActions[counter] = Math.round(clientMoney * 1.076);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                Euro += clientMoney;
                Dollars -= TransActions[counter];
                counter += 2;
                addEu += clientMoney;
                addDol -= TransActions[counter];
            } else if (fromWhat == 3 & inWhat == 1) {
                TransActions[counter] = Math.round(clientMoney * 0.037);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                Grn += clientMoney;
                Dollars -= TransActions[counter];
                counter += 2;
                addGrn += clientMoney;
                addDol -= TransActions[counter];
            } else if (fromWhat == 3 & inWhat == 2) {
                TransActions[counter] = Math.round(clientMoney * 0.024);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                Grn += clientMoney;
                Euro -= TransActions[counter];
                counter += 2;
                addGrn += clientMoney;
                addEu -= TransActions[counter];
            } else if (fromWhat == 4 & inWhat == 1) {
                TransActions[counter] = Math.round(clientMoney * 0.012);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                Ruble += clientMoney;
                Dollars -= TransActions[counter];
                counter += 2;
                addRub += clientMoney;
                addDol -= TransActions[counter];
            } else if (fromWhat == 4 & inWhat == 2) {
                TransActions[counter] = Math.round(clientMoney * 0.009);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                Ruble += clientMoney;
                Euro -= TransActions[counter];
                counter += 2;
                addRub += clientMoney;
                addEu -= TransActions[counter];
            } else if (fromWhat == 4 & inWhat == 3) {
                TransActions[counter] = Math.round(clientMoney * 0.33);
                TransActions[counter + 1] = clientMoney;
                Value[counter] = fromWhat;
                Value[counter + 1] = inWhat;
                Ruble += clientMoney;
                Grn -= TransActions[counter];
                counter += 2;
                addRub += clientMoney;
                addGrn -= TransActions[counter];
            }
        }//zvitnist.output();
    }
}
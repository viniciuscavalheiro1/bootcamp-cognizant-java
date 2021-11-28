package com.cognizant.saldacao;

public class Saldacao {

    public void saldacao(int hora){

        if (hora < 12 && hora > 5) {
            System.out.println("Bom Dia!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18 && hora < 00) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Boa madrugada!");
        }
    }
}

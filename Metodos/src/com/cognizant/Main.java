package com.cognizant;

import com.cognizant.calculadora.Calculadora;
import com.cognizant.emprestimo.Emprestimo;
import com.cognizant.saldacao.Saldacao;
import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Saldacao saldacao = new Saldacao();
        Emprestimo emprestimo = new Emprestimo(3000);
        System.out.println("Resultado da multiplicação: " + calculadora.multiplicacao(3, 4, 5));

        saldacao.saldacao(12);

        emprestimo.calculaValorEmprestimo(3);


    }
}

package com.cognizant.emprestimo;

public class Emprestimo {
    public double valor;

    public Emprestimo(double valor) {
        this.valor = valor;
    }

    public void calculaValorEmprestimo(int quantidadeParcelas) {
        double valorTotal;
        if(quantidadeParcelas == 2) {
            valorTotal = valor + (valor * 0.2);
        }else if(quantidadeParcelas == 3) {
            valorTotal = valor + (valor * 0.3);
        }else {
            valorTotal = valor + (valor * 0.6);
        }

        System.out.println("Valor total parcelado em " + quantidadeParcelas + " é: " + valorTotal);
    }
}

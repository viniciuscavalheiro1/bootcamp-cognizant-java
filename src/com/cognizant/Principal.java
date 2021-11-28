package com.cognizant;

import com.cognizant.calculararea.CalcularArea;

public class Principal {
    public static void main(String[] args) {
        CalcularArea calcularArea = new CalcularArea();

        calcularArea.area(3);
        calcularArea.area(5d, 5d);
        calcularArea.area(7, 8, 9);
        calcularArea.area(5f, 5f);
    }
}

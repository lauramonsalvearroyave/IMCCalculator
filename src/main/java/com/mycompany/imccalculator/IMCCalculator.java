package com.mycompany.imccalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author Laura Monsalve
 */
public class IMCCalculator {

    public static void main(String[] args) {
        double weight;
        double height;
        double heigthCuadrado;
        double IMC;
        
        weight= Double.parseDouble(JOptionPane.showInputDialog("Ingrse su peso en Kilogramos: "));
        height= Double.parseDouble(JOptionPane.showInputDialog("Ingrse su estatura en Centímetros: "));
        heigthCuadrado = Math.pow(height, 2);
        IMC = weight/heigthCuadrado;
        
        JOptionPane.showMessageDialog(null, "Su Índice de Masa Corporal (IMC) es: "+  IMC);
        
    }
}

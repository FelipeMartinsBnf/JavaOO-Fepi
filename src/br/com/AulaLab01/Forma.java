package br.com.AulaLab01;

import javax.swing.JOptionPane;

public class Forma {

    double base;
    double altura;

    void retonaArea() {
        double resultado = (this.base * this.altura);
        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, "O resultado é "+resultado , "Resultado da Area", 2);
    }

    void retornaPerimetro() {
        double resultado = (2 * (base * altura));
        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, "O resultado é "+resultado , "Resultado do perimetro", 2);
    }
}

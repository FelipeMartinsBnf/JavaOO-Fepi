package br.com.AulaLab01;

public class Principal {
    public static void main(String[] args) {
        Forma retangulo = new Forma();
        retangulo.altura = 10;
        retangulo.base = 40;
        
        retangulo.retonaArea();
        retangulo.retornaPerimetro();
    }
}

package br.com.tiposfiguras;

public class Triangulo extends Figura {
    double base, altura;

    public Triangulo(){}
    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        this.cor = cor;
    }

    double getBase() {
        return base;
    }

    void setBase(double base) {
        this.base = base;
    }

    double getAltura() {
        return altura;
    }

    void setAltura(double altura) {
        this.altura = altura;
    }

    double area() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo  " + cor + " = base de valor (" + base + ") vezes a altura de valor (" + altura + ") dividio por 2 é igual à " + area();
    }
}

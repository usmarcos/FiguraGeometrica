package br.com.tiposfiguras;

public class Circulo extends Figura {
    double raio;

    public Circulo(){}
    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    double getRaio() {
        return raio;
    }

    void setRaio(double raio) {
        this.raio = raio;
    }
    double area(){
        return 2 * 3.14 * raio;
    }

    @Override
    public String toString() {
        return "Círculo " + cor + " = 2 vezes PI vezes o raio de valor (" + raio + ") é igual à " + area();
    }
}

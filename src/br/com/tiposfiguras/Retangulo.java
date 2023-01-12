package br.com.tiposfiguras;

public class Retangulo extends Figura {
    double ladoUm, ladoDois;

    public Retangulo() {
    }

    public Retangulo(double ladoUm, double ladoDois, String cor) {
        this.ladoUm = ladoUm;
        this.ladoDois = ladoDois;
        this.cor = cor;
    }

    public double getLadoUm() {
        return ladoUm;
    }

    public void setLadoUm(double ladoUm) {
        this.ladoUm = ladoUm;
    }

    public double getLadoDois() {
        return ladoDois;
    }

    public void setLadoDois(double ladoDois) {
        this.ladoDois = ladoDois;
    }

    public double area() {
        return ladoUm * ladoDois;
    }
    public double area(double lado) {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Retangulo " + cor + " = lado um de valor (" + ladoUm + ") vezes lado dois de valor (" + ladoDois + ") é igual à " + area();
    }

}


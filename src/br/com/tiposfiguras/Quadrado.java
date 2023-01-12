package br.com.tiposfiguras;

public class Quadrado extends Retangulo {

    public Quadrado() {
    }

    public Quadrado(double lado, String cor) {
        super(lado, lado, cor);
    }

    @Override
    public String toString() {
        return "Quadrado " + cor + " = lado de valor (" + ladoUm + ") ao quadrado é igual à " + area(getLadoUm());
    }
}


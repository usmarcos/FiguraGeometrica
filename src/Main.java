import br.com.tiposfiguras.Circulo;
import br.com.tiposfiguras.Quadrado;
import br.com.tiposfiguras.Retangulo;
import br.com.tiposfiguras.Triangulo;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo(5, 12, "Azul");
        Circulo circulo = new Circulo(10.2, "Verde");
        Retangulo retangulo = new Retangulo(32,12,"Rosa");

        quadrado.setCor("Roxo");
        quadrado.setLadoUm(4);

        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(retangulo);
    }
}
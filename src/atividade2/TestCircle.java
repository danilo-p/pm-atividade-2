/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package atividade2;

/**
 *
 * @author M904
 */
public class TestCircle { // salve como "TestCircle.java"
    public static void main(String[] args) {
        // Declara c1 como variável habilitada a armazenar uma referencia para objeto da classe
        // Circle.
        Circle c1;

        // atribui a c1 .a referencia retornada pelo construtor padrão Circle ()
        c1 = new Circle();

        // Para invocar os metodos classe Circle para operar sobre a instância c1,
        // usa-se o operador ponto (“.”).
        //Em outras palavras: usa-se o ponto para enviar uma mensagem ao objeto c1 para que
        // ele execute um de seus métodos.
        System.out.println("O circulo tem o raio de " + c1.getRadius()
                + " e area de " + c1.getArea());

        // Declara e aloca uma segunda instancia da classe Circle chamada c2
        // com o valor do radius igual a 2.0 e color com valor padrão.
        Circle c2 = new Circle(2.0);
        // Para invocar os metodos a operar sobre a instância c2, usa-se o operador ponto (“.”)
        System.out.println("O circulo tem raio de " + c2.getRadius()
                + " e area de " + c2.getArea());

        // Declara e aloca uma terceira instancia da classe Circle chamada c3
        // com o valor do radius igual a 3.0 e color com valor "green".
        Circle c3 = new Circle(3.0, "green");
        // Para invocar os metodos a operar sobre a instância c3, usa-se o operador ponto (“.”)
        System.out.println("O circulo tem raio de " + c3.getRadius()
                + ", cor " + c3.getColor()
                + " e area de " + c3.getArea());

        // Exceção será lançada por acesso ao atributo privado radius
        // System.out.println(c3.radius);

        // Exceção será lançada por atribuição ao atributo privado radius
        // c3.radius = 5.0;

        c3.setRadius(6.0);
        c3.setColor("yellow");
        System.out.println("O circulo agora tem raio de " + c3.getRadius()
                + ", cor " + c3.getColor()
                + " e area de " + c3.getArea());

        // Utilização do método para leitura do atributo de comprimento do círculo
        System.out.println("O circulo tem comprimento de " + c3.getLength());

        Circle c4 = new Circle(4.0);

        // chamada explicita do metodo toString
        System.out.println(c4.toString());

        // chamada implitica do metodo toString, mas obtem o mesmo resultado
        System.out.println(c4);

        // chamada implicita com saída concatenada à outra string pelo operador '+'
        System.out.println("Aqui o operador '+' também invoca toString(): " + c2);
    } // fim do método main()
} // fim da classe TestCircle

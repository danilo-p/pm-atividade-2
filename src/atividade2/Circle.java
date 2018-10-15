/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author M904
 */
public class Circle extends Point { // salvar como "Circle.java"
    // variáveis de instancia privadas, isto é, não acessíveis de fora desta classe.

    private double radius;
    private double length;
    private String color;

    // primeiro construtor o qual atribui valores iniciais a ambos: radius e color .
    public Circle() {
        super();
        this.radius = 1.0;
        this.color = "red";
        this.setLength();
    }

    // Segundo construtor que inicia radius com o parâmetro recebido, e matem color com
    // o valor padrão definido.
    public Circle(double radius) {
        this(); // cria o objeto com o primeiro construtor:.Circle()
        this.radius = radius;
        this.setLength();
    }

    // Terceiro construtor que inicia radius e color com os parâmetros recebidos.
    public Circle(double radius, String color) {
        this(); // cria o objeto com o primeiro construtor:.Circle()
        this.radius = radius;
        this.color = color;
        this.setLength();
    }

    // Metodo de acesso para obter o valor armazenado em radius
    public double getRadius() {
        return this.radius;
    }

    // Metodo de acesso para obter o valor armazenado em color
    public String getColor() {
        return this.color;
    }

    // Metodo de acesso para obter o valor armazenado em length
    public double getLength() {
        return this.length;
    }

    // Metodo de acesso para computar a área de um circulo.
    public double getArea() {
        return this.radius * this.radius * Math.PI; // PI é a constante ¶. Math é a classe onde PI é definido ¶.
    }

    // Metodo Set para a variável de instancia radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metodo Set para a variável de instancia color
    public void setColor(String color) {
        this.color = color;
    }

    // Metodo privado para o calculo do comprimento do circulo
    private void setLength() {
        this.length = 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circulo: raio = " + radius
                + " cor = " + color
                + " centro (" + this.getX() + ", " + this.getY() + ")";
    }
}

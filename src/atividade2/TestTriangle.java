/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author M904
 */
public class TestTriangle {

    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(10, 1000, 1000000);
            System.err.print("Não deveria chegar aqui, pois o triângulo com lados 10, 1000, 1000000 é inválido");
        } catch (Exception ex) {
            System.out.println("Deveria chegar aqui, pois o triângulo com lados 10, 1000, 1000000 é inválido");
        }

        try {
            Triangle t = new Triangle(3, 4, 5);
            System.out.println("Deveria chegar aqui, pois o triângulo com lados 3, 4 e 5 é válido.");
            
            System.out.println(t);

            if (t.getPerimetro() == 12) {
                System.out.println("Deveria chegar aqui, pois o perímeto deste triângulo é 12");
            } else {
                System.err.print("Não deveria chegar aqui, pois o perímeto deste triângulo é 12 e não " + t.getPerimetro());
            }

            if (t.getArea() == 6) {
                System.out.println("Deveria chegar aqui, pois a área deste triângulo é 6");
            } else {
                System.err.print("Não deveria chegar aqui, pois a área deste triângulo é 6 e não " + t.getArea());
            }

            if (t.getTipo().equals("retangulo")) {
                System.out.println("Deveria chegar aqui, pois o tipo deste triângulo é retângulo");
            } else {
                System.err.print("Não deveria chegar aqui, pois o tipo deste triângulo é retângulo e não" + t.getTipo());
            }

            if (t.getAngulos().equals("36.9, 53.1, 90.0")) {
                System.out.println("Deveria chegar aqui, pois os ângulos deste triângulo são 36.9, 53.1, 90.0");
            } else {
                System.err.print("Não deveria chegar aqui, pois os ângulos deste triângulo são 36.9, 53.1, 90.0 e não" + t.getAngulos());
            }
        } catch (Exception ex) {
            System.err.print("Não deveria chegar aqui, pois o triângulo com lados 3, 4, e 5 é válido");
        }

        try {
            Triangle t = new Triangle(1, 1, 1);
            System.out.println("Deveria chegar aqui, pois o triângulo com lados 1, 1, 1 é válido");
            
            System.out.println(t);

            if (t.getTipo().equals("equilatero")) {
                System.out.println("Deveria chegar aqui, pois o tipo deste triângulo é equilátero");
            } else {
                System.err.print("Não deveria chegar aqui, pois o tipo deste triângulo é equilátero e não" + t.getTipo());
            }
        } catch (Exception ex) {
            System.err.print("Não deveria chegar aqui, pois o triângulo com lados 1, 1, 1 é válido");
        }

        try {
            Triangle t = new Triangle(2, 2, 1);
            System.out.println("Deveria chegar aqui, pois o triângulo com lados 2, 2, 1 é válido");
            
            System.out.println(t);

            if (t.getTipo().equals("isosceles")) {
                System.out.println("Deveria chegar aqui, pois o tipo deste triângulo é isosceles");
            } else {
                System.err.print("Não deveria chegar aqui, pois o tipo deste triângulo é isosceles e não" + t.getTipo());
            }
        } catch (Exception ex) {
            System.err.print("Não deveria chegar aqui, pois o triângulo com lados 2, 2, 1 é válido");
        }
    }
}

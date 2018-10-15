/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author M904
 */
public class Triangle {
    private double l1;
    private double l2;
    private double l3;

    public Triangle(double l1, double l2, double l3) throws Exception {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;

        if (!this.isValido()) {
            throw new Exception("Lados nao formam um triangulo");
        }
    }

    private boolean isValido() {
        return ((this.l1 > Math.abs(this.l2 - this.l3)
                && this.l1 < Math.abs(this.l2 + this.l3)) || (this.l2 > Math.abs(this.l1 - this.l3)
                && this.l2 < Math.abs(this.l1 + this.l3)) || (this.l3 > Math.abs(this.l2 - this.l1)
                && this.l3 < Math.abs(this.l2 + this.l1)));
    }

    // Baseado em a*a = b*b + c*c - 2*b*c*cosα
    private double getAnguloOposto(double a, double b, double c) {
        return Math.round(Math.toDegrees(Math.acos(
            (Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2))
            / (-2.0d * b * c)
        )) * 10) / 10.0d;
    }

    public double getPerimetro() {
        return this.l1 + this.l2 + this.l3;
    }

    // Utiliza a formula de herao
    public double getArea() {
        double p = (this.l1 + this.l2 + this.l3) / 2;
        return Math.sqrt(p * (p - this.l1) * (p - this.l2) * (p - this.l3));
    }

    public String getTipo() {
        if (this.l1 == this.l2 && this.l2 == this.l3) {
            return "equilatero";
        }

        if (this.l1 == this.l2 || this.l1 == this.l3 || this.l2 == this.l3) {
            return "isosceles";
        }

        if (
            (Math.pow(this.l1, 2) == (Math.pow(this.l2, 2) + Math.pow(this.l3, 2)))
            || (Math.pow(this.l2, 2) == (Math.pow(this.l1, 2) + Math.pow(this.l3, 2)))
            || (Math.pow(this.l3, 2) == (Math.pow(this.l2, 2) + Math.pow(this.l1, 2)))
        ) {
            return "retangulo";
        }

        return "escaleno";
    }

    public String getAngulos() {
        double angulo1 = this.getAnguloOposto(this.l1, this.l2, this.l3);
        double angulo2 = this.getAnguloOposto(this.l2, this.l1, this.l3);
        double angulo3 = this.getAnguloOposto(this.l3, this.l2, this.l1);
        return angulo1 + ", " + angulo2 + ", " + angulo3;
    }

    @Override
    public String toString() {
        return "O triangulo possui"
                + " lados " + this.l1 + ", " + this.l2 + " e " + this.l3
                + ", area = " + this.getArea()
                + ", perimetro = " + this.getPerimetro()
                + " e angulos internos " + this.getAngulos();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author M904
 */
public class Point {
    // Alteração de float para int, pois coordenadas não necessitam de ponto flutuante

    private int x;
    private int y;

    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Atuais coordenadas são (" + this.x + ", " + this.y + ")";
    }
}

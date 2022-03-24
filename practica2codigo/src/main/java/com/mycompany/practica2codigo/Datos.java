package com.mycompany.practica2codigo;

public class Datos {

    private int valores;
    private String curso;
    private String x, y;

    public Datos(int valores, String curso, String x, String y) {
        this.setValores(valores);
        this.setCurso(curso);
        this.setX(x);
        this.setY(y);
    }

    public Datos() {

    }

    public Datos(String curso, int valores, String x, String y) {
        this.valores = valores;
        this.curso = curso;
        this.x = x;
        this.y = y;
    }

    public Datos(String curso, String valores, String x, String y) {
        this.valores = Integer.parseInt(valores);
        this.curso = curso;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getValores() {
        return valores;
    }

    public void setValores(int valores) {
        this.valores = valores;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

}

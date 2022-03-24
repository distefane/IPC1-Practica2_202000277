package com.mycompany.practica2codigo;
public class Timer implements Runnable {

    Thread t;
    String nombre;

    public void rapido() {
        t = new Thread(this, "");
        t.start();
    }

    public void rapido(String nombre) {
        this.nombre = nombre;
        t = new Thread(this, "");
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 60; i++) {
                if (i < 10) {
                    System.out.println("Tiempo transcurrido: " + ":00" + ":00:0" + i);
                } else if (i >= 10 && i < 60) {
                    System.out.println("Tiempo transcurrido: " + ":00" + ":00:" + i);
                }

                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        };
    }
}

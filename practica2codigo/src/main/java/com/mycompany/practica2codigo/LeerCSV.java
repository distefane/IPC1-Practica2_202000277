package com.mycompany.practica2codigo;

import java.io.*;
import javax.swing.JOptionPane;

public class LeerCSV {

    VentanaPrincipal yy = new VentanaPrincipal();
    public static Datos[] datosn;
    public static String[] titulos;
    public static String[] columnas;
    String x, y;
    String nombres;
    String valores;
    GenerarGrafico tt;

    public void LeerCSV1(String ruta) throws FileNotFoundException, IOException {
        File t = null;
        t = new File(ruta);

        try {
            BufferedReader lector = new BufferedReader(new FileReader(t));
            String line = "";
            String texto = "";

            while ((line = lector.readLine()) != null) {
                texto += line + "\n";
            }

            String[] lineas = texto.split("\n");
            titulos = lineas[0].split(",");
            x = titulos[0];
            y = titulos[1];

            System.out.println(x + y);

            datosn = new Datos[lineas.length - 1];

            for (int i = 1; i < lineas.length; i++) {
                columnas = lineas[i].split(",");
                datosn[i - 1] = new Datos(columnas[0], columnas[1], titulos[0], titulos[1]);

            }

            x = titulos[0];
            y = titulos[1];

            MostrarGraficoInicial();

            for (Datos dato : datosn) {
                System.out.println("Curso: " + dato.getCurso() + " Nota: " + dato.getValores() + " Título x: " + dato.getX() + " Título y: " + dato.getY());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El sistema no puede encontrar la ruta especificada.");
        }

    }

    public void MostrarGraficoInicial() {
        tt = new GenerarGrafico();
        tt.GenerarGrafico(datosn);
    }

}

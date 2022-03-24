package com.mycompany.practica2codigo;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class AbrirRutaArchivo {

    String ruta = "";
    JPanel lectura = new JPanel();
    String j = "";
    String l = "";

    public String leerarchivo() {

        JFileChooser fc = new JFileChooser();
        int op = fc.showOpenDialog(lectura);
        if (op == JFileChooser.APPROVE_OPTION) {

            File pRuta = fc.getSelectedFile();

            //Identificador de título en la ruta
            ruta = pRuta.getAbsolutePath();
            String o = "";

            for (int i = ruta.length(); i >= 1; i--) {
                String p = String.valueOf(ruta.charAt(i - 1));
                if (p.equals("\\")) {
                    break;
                } else {
                    o = p + o;
                }
            }

            //Aquí en o ya tengo el nombre del archivo. Ahora, ¿cómo lo elimino?
            j = ruta.replaceAll(o, "");

            String m = "";

            for (int i = ruta.length(); i >= 1; i--) {
                String p = String.valueOf(ruta.charAt(i - 1));
                if (p.equals("\\")) {
                    break;
                } else {
                    m = p + m;
                }
            }
            l = m;

        } else if (op == JFileChooser.CANCEL_OPTION) {

        }
        return ruta;
    }
}

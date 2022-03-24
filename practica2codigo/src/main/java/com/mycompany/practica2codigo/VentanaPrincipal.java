package com.mycompany.practica2codigo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class VentanaPrincipal extends JFrame {
    JPanel principal1;
    JPanel principal, opciones, grafico;
    private JLabel ru, tit, titAlg, titTip, titVel;
    JTextField ingRuta, ingTitulo;
     JButton buscar, cargar, ejecutar;
     JComboBox algoritmo, tipo, velocidad;
     
     JLabel ex1, ex2, ex3;
     
    String paraLeer = "";
            
    public void VentanaPrincipal() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        principal = new JPanel();
        setSize(830, 460);
        setLayout(null);
        setTitle("Ordenamiento");
        setLocationRelativeTo(null);
        getContentPane().add(principal);
        principal.setLayout(null);
        principal.setSize(830, 460);
        principal.setBackground(Color.LIGHT_GRAY);
        principal.setVisible(true);
        
        //Etiquetas
        ru = new JLabel("Ruta del archivo");
        ru.setBounds(30, 10, 100, 20);
        principal.add(ru);
        ru.setVisible(true);
        
        tit = new JLabel("Título de la gráfica");
        tit.setBounds(30, 60, 150, 20);
        principal.add(tit);
        tit.setVisible(true);
        
        //TextFields
        ingRuta = new JTextField();
        ingRuta.setBounds(30, 30, 650, 20);
        principal.add(ingRuta);
        ingRuta.setVisible(true);
        
        ingTitulo = new JTextField();
        ingTitulo.setBounds(30, 80, 650, 20);
        principal.add(ingTitulo);
        ingTitulo.setVisible(true);
        
        //Panel de Opciones
        opciones = new JPanel();
        opciones.setLayout(null);
        opciones.setBounds(30, 130, 250, 270);
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "Panel de Opciones");
        opciones.setBorder(bordejpanel);
        opciones.setBackground(Color.LIGHT_GRAY);
        opciones.setVisible(true);
        principal.add(opciones);
        
        //Panel Gráfico
        grafico = new JPanel();
        grafico.setLayout(null);
        grafico.setBounds(305, 130, 480, 270);
        Border bordeg = new TitledBorder(new EtchedBorder(), "Gráfica");
        grafico.setBorder(bordeg);
        grafico.setBackground(Color.LIGHT_GRAY);
        
        ex1 = new JLabel("Se abrirá una ventana nueva con");
        ex1.setBounds(160, 90, 200, 20);
        
        ex2 = new JLabel("la gráfica actual, al presionar ");
        ex2.setBounds(160, 120, 200, 20);
        
        ex3 = new JLabel("presionar el botón de 'cargar'.");
        ex3.setBounds(160, 150, 200, 20);
        
        grafico.add(ex1);
        ex1.setVisible(true);
        
        grafico.add(ex2);
        ex2.setVisible(true);
        
        grafico.add(ex3);
        ex3.setVisible(true);
        
        grafico.setVisible(true);
        principal.add(grafico);
        
        //Label
        titAlg = new JLabel("Algoritmo: ");
        titAlg.setBounds(30, 50, 100, 20);
        opciones.add(titAlg);
        titAlg.setVisible(true);
        
        titTip = new JLabel("Tipo: ");
        titTip.setBounds(30, 100, 100, 20);
        opciones.add(titTip);
        titTip.setVisible(true);
        
        titVel = new JLabel("Velocidad: ");
        titVel.setBounds(30, 150, 100, 20);
        opciones.add(titVel);
        titVel.setVisible(true);
        
        //Botones
        buscar = new JButton("Buscar");
        buscar.setBounds(695, 30, 90, 20);
        principal.add(buscar);
        buscar.setVisible(true);
        
        //Abrir FileChooser
        ActionListener filechooser = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbrirRutaArchivo k = new AbrirRutaArchivo();
                k.leerarchivo();
                ingTitulo.setText(k.l);
                ingRuta.setText(k.j);
                //Asignando variable a la ruta para que lo lea el LeerCSV.java
                paraLeer = k.leerarchivo();
            }
        };
        buscar.addActionListener(filechooser);
        
        cargar = new JButton("Cargar");
        cargar.setBounds(695, 80, 90, 20);
        principal.add(cargar);
        cargar.setVisible(true);
        
        //Leer y mostrar .CSV
        ActionListener leermostrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String archivo1 = paraLeer;
                System.out.println(archivo1);
                try {
                    LeerCSV m = new LeerCSV();
                    m.LeerCSV1(archivo1);
                 
//                    GenerarGrafico y = new GenerarGrafico();
//                    y.GenerarGrafico();
                } catch (IOException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        cargar.addActionListener(leermostrar);
        
        ejecutar = new JButton("Ejecutar");
        ejecutar.setBounds(70, 210, 100, 20);
        opciones.add(ejecutar);
        ejecutar.setVisible(true);
        
        //Abrir FileChooser
        ActionListener ejecutarco = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GraficosOrdenados iu = new GraficosOrdenados();
                MostrarOrdenTipo uj = new MostrarOrdenTipo();
                uj.MostrarOrdenTipos(iu.graficoBar);
            }
        };
        ejecutar.addActionListener(ejecutarco);
        
        //ComboBox 
        String[] j = {"Burbuja", "Inserción", "Selección"};
        algoritmo = new JComboBox(j);
        algoritmo.setBounds(110, 50, 100, 20);
        opciones.add(algoritmo);
        algoritmo.setVisible(true);
        
        String[] m = {"Ascendente", "Descendente"};
        tipo = new JComboBox(m);
        tipo.setBounds(110, 100, 100, 20);
        opciones.add(tipo);
        tipo.setVisible(true);
        
        String[] p = {"Rápida", "Media", "Lenta"};
        velocidad = new JComboBox(p);
        velocidad.setBounds(110, 150, 100, 20);
        opciones.add(velocidad);
        velocidad.setVisible(true);
        
        setVisible(true);
        
    }
}

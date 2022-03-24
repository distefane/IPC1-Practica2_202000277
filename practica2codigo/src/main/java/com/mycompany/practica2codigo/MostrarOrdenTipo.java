
package com.mycompany.practica2codigo;

import java.awt.Color;
import javax.swing.*;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class MostrarOrdenTipo extends JFrame {
    MetodosOrdenamiento ii = new MetodosOrdenamiento();
    Datos [] datos;
    Datos [] datosn;
    VentanaPrincipal info = new VentanaPrincipal();
    GraficosOrdenados qq = new GraficosOrdenados();
    JPanel mosInfo = new JPanel();
    JPanel graficoo = new JPanel();
    JLabel tipo;
    JLabel ordenamiento;
    JFreeChart n;
    ChartPanel grafico;
    
    public void MostrarOrdenTipos (JFreeChart n) {
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        grafico = new ChartPanel(this.n);
        
        tipo = new JLabel("Tipo: " + info.tipo.getSelectedItem());
        tipo.setBounds(150, 50, 200, 20);
        ordenamiento = new JLabel("Algoritmo:" + info.algoritmo.getSelectedItem());
        ordenamiento.setBounds(300, 50, 200, 20);
        tipo.setVisible(true);
        ordenamiento.setVisible(true);
        
        mosInfo.setBackground(Color.LIGHT_GRAY);
        mosInfo.setBounds(0, 10, 500, 100);
        mosInfo.add(tipo);
        mosInfo.add(ordenamiento);
        getContentPane().add(mosInfo);
        mosInfo.setVisible(true);
        
        setVisible(true);
        
        if (info.tipo.getSelectedItem().equals("Ascendente") && info.algoritmo.getSelectedItem().equals("Burbuja")) {
            ii.burbujaCreciente(datos);
            qq.GenerarGraficoOrdenado(datosn);
        }
        
        else if (info.tipo.getSelectedItem().equals("Descendente") && info.algoritmo.getSelectedItem().equals("Burbuja")) {
            ii.burbujaDecreciente(datos);
            qq.GenerarGraficoOrdenado(datosn);
        }
        
        else if (info.tipo.getSelectedItem().equals("Ascendente") && info.algoritmo.getSelectedItem().equals("Inserción")) {
            ii.burbujaDecreciente(datos);
            qq.GenerarGraficoOrdenado(datosn);
        }
        
        else if (info.tipo.getSelectedItem().equals("Descendente") && info.algoritmo.getSelectedItem().equals("Inserción")) {
            ii.insercionDecreciente(datos);
            qq.GenerarGraficoOrdenado(datosn);
        }
        
        else if (info.tipo.getSelectedItem().equals("Ascendente") && info.algoritmo.getSelectedItem().equals("Selección")) {
            ii.seleccionCreciente(datos);
            qq.GenerarGraficoOrdenado(datosn);
        }
        
        else if (info.tipo.getSelectedItem().equals("Descendente") && info.algoritmo.getSelectedItem().equals("Selección")) {
            ii.seleccionDecreciente(datos);
            qq.GenerarGraficoOrdenado(datosn);
        }
        
    }
}

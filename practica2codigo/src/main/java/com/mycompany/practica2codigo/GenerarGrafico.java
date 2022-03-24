package com.mycompany.practica2codigo;

import java.awt.Color;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartPanel;

public class GenerarGrafico extends JFrame{
    
    String cursosN, notasN;
    ChartPanel grafico;
    JPanel principal1= new JPanel();;
        
    LeerCSV t = new LeerCSV();
    Datos m = new Datos();
    JFreeChart graficoBar;
    VentanaPrincipal ven = new VentanaPrincipal();
    DefaultCategoryDataset datosg;
  
    int contador = 0;
    String x, y;
    String titX, titY;
    String CursoN;
    String NOMBRECURSO;
    public static Datos [] datosn;
    int notaN;
    int notaCurso;
    int NOTAOBTENIDA;
    Datos [] notasCursos;
    public void GenerarGrafico (Datos [] datosn) {
        
        this.datosn = datosn;
        
        
        try {
        datosg = new DefaultCategoryDataset();
            
        for (Datos nota : datosn) {
         CursoN = nota.getCurso();
         NOTAOBTENIDA = nota.getValores();
            System.out.println(" notas: " + CursoN + " nombre: " + NOTAOBTENIDA + " " + t.titulos[0] + " " + t.titulos[1]);
        datosg.addValue(nota.getValores(), nota.getCurso(), contador + "");
        contador++;
        }
//        }
        
        } catch (Exception e){
            
        }
        graficoBar = ChartFactory.createBarChart("Calificaciones", t.titulos[0], t.titulos[1], datosg, PlotOrientation.VERTICAL, true, true, false);
        
        
        
        setSize(550, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().add(principal1);
        principal1.setLayout(null);
        principal1.setSize(500, 300);
        principal1.setVisible(true);
        
        grafico = new ChartPanel(graficoBar);
        grafico.setSize(500, 300);
        grafico.setBackground(Color.LIGHT_GRAY);
        principal1.add(grafico);
        grafico.setVisible(true);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);
        
    }

}

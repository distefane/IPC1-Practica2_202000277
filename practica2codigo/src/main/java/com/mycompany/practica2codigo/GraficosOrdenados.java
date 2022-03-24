
package com.mycompany.practica2codigo;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficosOrdenados {
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
//    String cursoN;
//    Datos [] cursooN;
    public void GenerarGraficoOrdenado (Datos [] datosn) {
        
//        this.CursoN = CursoN;
//        this.NOTAOBTENIDA = NOTAOBTENIDA;
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
        MostrarOrdenTipo uy = new MostrarOrdenTipo();
        uy.MostrarOrdenTipos(graficoBar);
}
}

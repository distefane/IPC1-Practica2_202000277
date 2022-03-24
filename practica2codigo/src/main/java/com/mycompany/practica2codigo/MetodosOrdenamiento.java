package com.mycompany.practica2codigo;

public class MetodosOrdenamiento {

    Datos[] datosn;
    static int[] paraLlenarb;
    static int[] paraOrdenar;
    LeerCSV hu = new LeerCSV();

    public void burbujaCreciente(Datos[] datosn) {
        int i, j, aux;
        for (Datos paraLlenar : datosn) {
            paraOrdenar[datosn.length] = paraLlenar.getValores();
            for (i = 0; i < paraOrdenar.length - 1; i++) {
                for (j = 0; j < paraOrdenar.length - 1; j++) {
                    if (paraOrdenar[j + 1] < paraOrdenar[j]) {
                        aux = paraOrdenar[j + 1];
                        paraOrdenar[j + 1] = paraOrdenar[j];
                        paraOrdenar[j] = aux;
                    }
                }
            }
        }
        //Necesito tomar el nuevo arreglo e ingresarlo a Datos, en notas.
        //Llenando Datos
        for (int l = 0; l < paraOrdenar.length; l++) {
            for (Datos notasOrdenadas : datosn) {
                notasOrdenadas.setValores(l);
            }
        }
    }

    public void burbujaDecreciente(Datos[] datosn) {
        int i, j, aux;
        for (Datos paraLlenar : datosn) {
            paraOrdenar[datosn.length] = paraLlenar.getValores();
            for (i = 0; i < paraOrdenar.length - 1; i++) {
                for (j = 0; j < paraOrdenar.length - 1; j++) {
                    if (paraOrdenar[j + 1] < paraOrdenar[j]) {
                        aux = paraOrdenar[j + 1];
                        paraOrdenar[j + 1] = paraOrdenar[j];
                        paraOrdenar[j] = aux;
                    }
                }
            }
        }
        //Mostrando en decreciente
        for (int l = (paraOrdenar.length - 1); l >= 0; l--) {
            System.out.print("[" + paraOrdenar[l] + "]");
        }
        System.out.println("");
        
        
        //Llenando Datos
        for (int l = 0; l < paraOrdenar.length; l--) {
            for (Datos notasOrdenadas : datosn) {
                notasOrdenadas.setValores(l);
            }
        }
    }

    public void insercionCreciente(Datos[] datosn) {
        int p, j;
        int aux;
        for (Datos paraLlenar : datosn) {
            paraOrdenar[datosn.length] = paraLlenar.getValores();
            for (p = 1; p < paraOrdenar.length; p++) {

                aux = paraOrdenar[p];
                j = p - 1;
                while ((j >= 0) && (aux < paraOrdenar[j])) {

                    paraOrdenar[j + 1] = paraOrdenar[j];
                    j--;
                }
                paraOrdenar[j + 1] = aux;
            }
        }
        //Creciente
        for (int l = 0; l < paraOrdenar.length; l++) {
            System.out.print("[" + paraOrdenar[l] + "]");
        }
        System.out.println("");

        for (int l = 0; l < paraOrdenar.length; l++) {
            for (Datos notasOrdenadas : datosn) {
                notasOrdenadas.setValores(l);
            }
        }
        System.out.println("");

        //Llenando Datos
        for (int l = 0; l < paraOrdenar.length; l--) {
            for (Datos notasOrdenadas : datosn) {
                notasOrdenadas.setValores(l);
            }
        }
        
    }

    public void insercionDecreciente(Datos[] datosn) {
        int p, j;
        int aux;
        for (Datos paraLlenar : datosn) {
            paraOrdenar[datosn.length] = paraLlenar.getValores();
            for (p = 1; p < paraOrdenar.length; p++) {

                aux = paraOrdenar[p];
                j = p - 1;
                while ((j >= 0) && (aux < paraOrdenar[j])) {

                    paraOrdenar[j + 1] = paraOrdenar[j];
                    j--;
                }
                paraOrdenar[j + 1] = aux;
            }
        }

        //Mostrando en decreciente
        for (int l = (paraOrdenar.length - 1); l >= 0; l--) {
            System.out.print("[" + paraOrdenar[l] + "]");
        }
        System.out.println("");

    }

    public void seleccionCreciente(Datos[] datosn) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < datosn.length - 1; i++) {
            for (Datos paraLlenar : datosn) {
                paraOrdenar[datosn.length] = paraLlenar.getValores();
                menor = paraOrdenar[i];
                pos = i;
                for (j = i + 1; j < datosn.length; j++) {
                    if (paraOrdenar[j] < menor) {
                        menor = paraOrdenar[j];
                        pos = j;
                    }

                }
                if (pos != i) {
                    tmp = paraOrdenar[i];
                    datosn[i] = datosn[pos];
                    paraOrdenar[pos] = tmp;
                }
            }
        }

        //Creciente
        for (int l = 0; l < paraOrdenar.length; l++) {
            System.out.print("[" + paraOrdenar[l] + "]");
        }
        System.out.println("");

        //Llenando Datos
        for (int l = 0; l < paraOrdenar.length; l--) {
            for (Datos notasOrdenadas : datosn) {
                notasOrdenadas.setValores(l);
            }
        }
        
    }

    public void seleccionDecreciente(Datos[] datosn) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < datosn.length - 1; i++) {
            for (Datos paraLlenar : datosn) {
                paraOrdenar[datosn.length] = paraLlenar.getValores();
                menor = paraOrdenar[i];
                pos = i;
                for (j = i + 1; j < datosn.length; j++) {
                    if (paraOrdenar[j] < menor) {
                        menor = paraOrdenar[j];
                        pos = j;
                    }

                }
                if (pos != i) {
                    tmp = paraOrdenar[i];
                    datosn[i] = datosn[pos];
                    paraOrdenar[pos] = tmp;
                }
            }
        }

        //Mostrando en decreciente
        for (int l = (paraOrdenar.length - 1); l >= 0; l--) {
            System.out.print("[" + paraOrdenar[l] + "]");
        }
        System.out.println("");

        //Llenando Datos
        for (int l = 0; l < paraOrdenar.length; l--) {
            for (Datos notasOrdenadas : datosn) {
                notasOrdenadas.setValores(l);
            }
        }
        
    }

}

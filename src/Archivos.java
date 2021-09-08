/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johana
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Archivos {

    int n = 6;
    int[] Vector = new int[n];
    int tamano = 0;
    String texto = "";
    String temp = "";
    String bfRead;
    String Archivo = "ordenar.txt";
    int numero;
    char respuesta1 = ' ';
    String respuesta = " ";

    public String leerTxt(String direccion) {

        try {

            BufferedReader bf = new BufferedReader(new FileReader(direccion));

            while ((bfRead = bf.readLine()) != null) {

                temp = temp + bfRead;

            }

            texto = temp;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se encontro el archivo.", "Error", JOptionPane.ERROR_MESSAGE);

        }

        return texto;

    }

    public String ordenar(String direccion) {

        String texto = "";
        Scanner entrada = new Scanner(System.in);
        Quick lecto = new Quick();

        try {

            File archivo = new File(Archivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            BufferedReader bf = new BufferedReader(new FileReader(direccion));

            int d = 0;
            String bfRead;
            String temp = "";
            int i = 0;

            while ((bfRead = br.readLine()) != null) {

                Vector[i] = Integer.parseInt(bfRead);
                i++;
            }

            Arrays.sort(Vector);

            JOptionPane.showMessageDialog(null, Arrays.toString(Vector));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "No se encontro el archivo.", "Error", JOptionPane.ERROR_MESSAGE);

        }

        return texto;

    }

    public void imprimir() {
        try {
            FileOutputStream archivo;
            PrintStream p;
            archivo = new FileOutputStream("c:archivo.txt");
            p = new PrintStream(archivo);

            for (int i = 0; i < Vector.length; i++) {

                p.print(Vector[i] + ", ");

            }

            p.close();
        } catch (FileNotFoundException e) {

        }
    }
}

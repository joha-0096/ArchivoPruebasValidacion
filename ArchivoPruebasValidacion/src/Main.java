/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johana
 */

public class Main {

    public static void main(String[] args) {
                
        Archivos archivo = new Archivos();
        String leer = archivo.ordenar("ordenar.txt");
        archivo.imprimir();
        System.out.println(leer);
        
    }
}
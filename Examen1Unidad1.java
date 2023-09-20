/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenu1;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen1Unidad1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar informacion del istrumento 1
        System.out.println(" Ingrese el nombre del instrumento1 ");
        String instrumento1 = scanner.nextLine();
        System.out.println(" Ingrese el precio de compra del instrumento1 ");
        double precioCompra1 = scanner.nextDouble();
        double precioVenta1 = 1250.45;
        double ganacia1 = precioVenta1 - precioCompra1;
        double porcentajeGanacia1 = (ganacia1 / precioCompra1)*100;
       
        System.out.println(" Ingrese el nombre del instrumento2 ");
        String instrumento2 = scanner.nextLine();
        System.out.println(" Ingrese el precio de compra del instrumento2 ");
        double precioCompra2 = scanner.nextDouble();
        double precioVenta2 = 3473.00;
        double ganacia2 = precioVenta2 - precioCompra2;
        double porcentajeGanacia2 = (ganacia2 / precioCompra2)+100;
        
        System.out.println(" Ingrese el nombre del instrumento3 ");
        String instrumento3 = scanner.nextLine();
        System.out.println(" Ingrese el precio de compra del instrumento3 ");
        double precioCompra3 = scanner.nextDouble();
        double precioVenta3 = 2683.78;
        double ganacia3 = precioVenta3 - precioCompra3;
        double porcentajeGanacia3 = (ganacia3 / precioCompra3)*100;
        
        System.out.println(" Instrumento1: " + instrumento1);
        System.out.println(" Ganancia: $ " + ganacia1);
        System.out.println(" Porcentaje de ganacia: " + porcentajeGanacia1 + " %");
        
        System.out.println(" Instrumento2: " + instrumento2);
        System.out.println(" Ganancia: $ " + ganacia2);
        System.out.println(" Porcentaje de ganacia: " + porcentajeGanacia2 + " %");

         System.out.println(" Instrumento3: " + instrumento3);
        System.out.println(" Ganancia: $ " + ganacia3);
        System.out.println(" Porcentaje de ganacia: " + porcentajeGanacia3 + " %");
        
        scanner.close();

        
        
        
    
    }
}

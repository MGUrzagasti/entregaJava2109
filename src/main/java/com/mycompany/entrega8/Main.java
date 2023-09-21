/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.entrega8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Main {

    public static void main(String[] args) {

     
       
      
         Carrito chango = new Carrito();
        Scanner sc = new Scanner(System.in);
        int opcionElegida = 0;

        do {
             
            System.out.println(" Tu compra!. \n");
            System.out.println("1-Agregar producto.");
            System.out.println("2-Cantidad de productos.");
            System.out.println("3-Importe total.");
           
            System.out.println("5-Salir.");
            opcionElegida = sc.nextInt();
            switch (opcionElegida) {
                case 1:
                    
               chango.agregarProducto();
               
                    System.out.println("producto agregado"+chango.carro);
               
                    break;

                case 2:
                
                          
                    chango.cantidaproductos();
                 
             

                break;
                case 3:

                    break;
                case 5:

                    break;

            }
        } while (opcionElegida != 5);

    }

}

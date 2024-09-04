/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejerciciossergio1;

import java.util.Scanner;

public class Ejerciciossergio1 {

    public static void main(String[] args) { 
//x=llantas 
//x<5, entonces el precio es de $100 
//x=>5 y <10 , entonces el precio es de $75 
//x>10, entonces el precio es de $50

        int llantas;
        int precio;

        Scanner user = new Scanner(System.in);
        System.out.println("Cuantas llantas va a comprar: ");
        llantas = user.nextInt();

        if (llantas < 5) {
            precio = (llantas * 100);
            System.out.println("Cada llanta tiene un valor de $100, estonces su compra es : " + precio);
        } else if ((llantas >= 5) && (llantas <= 10)) {
            precio = (llantas * 75);
            System.out.println("Cada llanta tiene un valor de $75; entonces su compra es: " + precio);
        } else if (llantas > 10) {
            precio = (llantas * 50);
            System.out.println("Cada llanta tiene un valor de $50; entonces su compra es: " + precio);
        }
    }
}

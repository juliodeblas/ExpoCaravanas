/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expocaravanas;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class ExpoCaravanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion1, opcion2;
        int entradaspedidas = 0;
        Scanner sc = new Scanner(System.in);

        Zona zonap = new Zona();
        zonap.setEntradas(1000);
        Zona zonacv = new Zona();
        zonacv.setEntradas(200);
        Zona zonavip = new Zona();
        zonavip.setEntradas(25);

        System.out.println("1-------------->Mostrar entradas libres");
        System.out.println("2-------------->Comprar entradas");
        System.out.println("3-------------->Salir");
        opcion1 = 1;

        while (opcion1 != 3) {

            System.out.println("¿Qué opción quieres realizar?");
            opcion1 = sc.nextInt();
            if (opcion1 == 1) {
                System.out.println("Quedan " + zonap.getEntradas() + " en la zona principal.");
                System.out.println("Quedan: " + zonacv.getEntradas() + " en la zona de compra-venta.");
                System.out.println("Quedan: " + zonavip.getEntradas() + " en la zona VIP.");
            } else if (opcion1 == 2) {
                System.out.println("¿En qué zona quieres estar?");
                System.out.println("1-------------->ZONA PRINCIPAL");
                System.out.println("2-------------->ZONA COMPRA-VENTA");
                System.out.println("3-------------->ZONA VIP");
                opcion2 = sc.nextInt();
                if (opcion2 == 1) {
                    System.out.println("¿Cuántas entradas quieres comprar?");
                    entradaspedidas = sc.nextInt();
                    zonap.Venta(entradaspedidas);
                } else if (opcion2 == 2) {
                    System.out.println("¿Cuántas entradas quieres comprar?");
                    entradaspedidas = sc.nextInt();
                    zonacv.Venta(entradaspedidas);
                } else if (opcion2 == 3) {
                    System.out.println("¿Cuántas entradas quieres comprar?");
                    entradaspedidas = sc.nextInt();
                    zonavip.Venta(entradaspedidas);
                } else {
                    System.out.println("ERROR");
                }
            } else if (opcion1 != 1 && opcion1 != 2 && opcion1 != 3) {
                System.out.println("ERROR");
            }
        }
    }

}

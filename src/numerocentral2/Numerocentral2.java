/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerocentral2;

import java.util.Scanner;

/**
 *
 * @author AMAL
 */
public class Numerocentral2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        int num1, num2, num3, casos, numerocentral, i;
        casos = numerocentral = i = 0;

        casos = sc.nextInt();
        for (i = 1; i <= casos; i++) {

            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();
            if (num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3) {

            } else {
                numerocentral = num1;
                if (num2 > num1 && num2 < num3 || num2 < num1 && num2 > num3) {
                    numerocentral = num2;
                } else {

                    numerocentral = num3;

                }

            }

            System.out.println("El numero central es:" + numerocentral);
        }

    }

    public static int Elnumero(int num1, int num2, int num3, int numerocentral) {
        if (num1 > num2 && num1 < num3 && num2 < num3 || num1 > num3 && num1 < num2 && num3 > num1) {
            numerocentral = num1;
        }
        if (num1 < num2 && num1 < num3 && num2 > num3 || num1 > num2 && num1 > num3 && num1 > num3) {
            numerocentral = num2;
        }
        if (num1 < num2 && num1 < num3 && num2 > num3 || num1 > num2 && num1 > num3 && num2 < num3) {
            numerocentral = num3;
        }
        return numerocentral;
    }
}

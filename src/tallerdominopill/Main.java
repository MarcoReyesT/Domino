/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerdominopill;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int ancho = in.nextInt();

        int largo = in.nextInt();

        int cantDomino = (ancho * largo) / 2;

        System.out.println(cantDomino);

    }

}

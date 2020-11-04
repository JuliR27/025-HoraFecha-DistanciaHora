
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author CicloM
 */
public class Main {

    public static final GregorianCalendar CAL
            = new GregorianCalendar();
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        int hi;
        int mi;
        int si;
        try {
            System.out.print("Hora Inicio ..........:");
            hi = SCN.nextInt();

            System.out.printf("Hora Inicio ..........: %d%n", hi);
        } catch (Exception e) {
            System.out.println("Error: Entrada incorrecta");
        } finally {
            SCN.nextLine();
        }

        try {
            System.out.print("Minutos Inicio ..........:");
            mi = SCN.nextInt();

            System.out.printf("Minutos Inicio ..........: %d%n", mi);
        } catch (Exception e) {
            System.out.println("Error: Entrada incorrecta");
        } finally {
            SCN.nextLine();
        }

        try {
            System.out.print("Segundos Inicio ..........:");
            si = SCN.nextInt();

            System.out.printf("Segundos Inicio ..........: %d%n", si);
        } catch (Exception e) {
            System.out.println("Error: Entrada incorrecta");
        } finally {
            SCN.nextLine();
        }
    }

}

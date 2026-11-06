/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod_3a;

/**
 *
 * @author USER
 */

import java.util.Scanner;

public class Tugas {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        String karyawan[][];
        int jumlah;

        System.out.println("DATA GAJI KARYAWAN");
        System.out.println("SISTEM INFORMASI");
        System.out.println("FKOM - UNIKU");

        System.out.print("Jumlah Karyawan : ");
        jumlah = Integer.parseInt(input.nextLine());

        karyawan = new String[jumlah][4];

        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nData Karyawan ke-" + (i + 1));

            System.out.print("NAMA : ");
            karyawan[i][0] = input.nextLine();

            System.out.print("JABATAN : ");
            karyawan[i][1] = input.nextLine();

            System.out.print("GAPOK : ");
            karyawan[i][2] = input.nextLine();

            System.out.print("TUNJANGAN : ");
            karyawan[i][3] = input.nextLine();
        }

        System.out.println("\nDATA GAJI KARYAWAN");
        System.out.println("NO.\tNAMA\tJABATAN\tGAPOK\tTUNJANGAN");

        for (int i = 0; i < jumlah; i++) {

            System.out.println((i + 1) + "\t"
                    + karyawan[i][0] + "\t"
                    + karyawan[i][1] + "\t"
                    + karyawan[i][2] + "\t"
                    + karyawan[i][3]);
        }

        input.close();
    }
}

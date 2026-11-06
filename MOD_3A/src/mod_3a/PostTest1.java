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

public class PostTest1 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        String mahasiswa[][];
        int jumlah;
        double total = 0, rataRata;

        System.out.println("DATA NILAI MAHASISWA");
        System.out.println("SISTEM INFORMASI");
        System.out.println("FKOM - UNIKU");

        System.out.print("Jumlah Orang : ");
        jumlah = Integer.parseInt(input.nextLine());

        mahasiswa = new String[jumlah][6];

        for (int i = 0; i < jumlah; i++) {

            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM : ");
            mahasiswa[i][0] = input.nextLine();

            System.out.print("NAMA : ");
            mahasiswa[i][1] = input.nextLine();

            System.out.print("NILAI TUGAS : ");
            mahasiswa[i][2] = input.nextLine();

            System.out.print("NILAI UTS : ");
            mahasiswa[i][3] = input.nextLine();

            System.out.print("NILAI UAS : ");
            mahasiswa[i][4] = input.nextLine();

            double tugas = Double.parseDouble(mahasiswa[i][2]);
            double uts = Double.parseDouble(mahasiswa[i][3]);
            double uas = Double.parseDouble(mahasiswa[i][4]);

            double akhir = (tugas + uts + uas) / 3;

            mahasiswa[i][5] = String.valueOf(akhir);

            total = total + akhir;
        }

        rataRata = total / jumlah;

        System.out.println("\nNO.\tNIM\tNAMA\tTUGAS\tUTS\tUAS\tAKHIR");

        for (int i = 0; i < jumlah; i++) {

            System.out.println((i + 1) + "\t"
                    + mahasiswa[i][0] + "\t"
                    + mahasiswa[i][1] + "\t"
                    + mahasiswa[i][2] + "\t"
                    + mahasiswa[i][3] + "\t"
                    + mahasiswa[i][4] + "\t"
                    + mahasiswa[i][5]);
        }

        System.out.println("\nRata-rata Nilai Akhir : " + rataRata);

        input.close();
    }
}

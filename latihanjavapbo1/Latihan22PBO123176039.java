/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapbo1;

import java.util.Scanner;

/**
 * NAMA    : BAGUS GILANG PRADITA
 * NIM     : 23176039
 * KELAS   : PBO1
 * JURUSAN : SISTEM INFORMASI
 * @author bagus
 */
public class Latihan22PBO123176039 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            final double PI = 3.14159;
            
            while (true) {
                System.out.println("run:");
                System.out.println("=====Perhitungan Lingkaran=====");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                
                // Validasi input
                if (!input.hasNextDouble()) {
                    String invalidInput = input.next();
                    System.out.println("Nilai Diameter Tidak Sesuai");
                    continue;
                }
                
                double diameter = input.nextDouble();
                
                // Validasi nilai diameter harus positif
                if (diameter <= 0) {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                    continue;
                }
                
                // Perhitungan
                double jariJari = diameter / 2;
                double luas = PI * jariJari * jariJari;
                double keliling = PI * diameter;
                
                // Output hasil
                System.out.println("\n=====Hasil Perhitungan Lingkaran=====");
                System.out.printf("Jari-jari Lingkaran = %.0f cm%n", jariJari);
                System.out.printf("Luas Lingkaran = %.2f cm%n", luas);
                System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);
                System.out.println("dibuat bagus gilang pradita");
                break;
            }
        }
    }
}

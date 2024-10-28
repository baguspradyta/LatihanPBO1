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
public class Latihan21PBO123176039 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("run:");
        
        // Data mahasiswa
        String[] nama = {"Bagus", "Yogi", "Yonglex", "Jayeng"};
        int[] nilai = {10, 8, 7, 9};
        int jumlahMahasiswa = nama.length;
        
        // Tampilkan data dan hitung total
        System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
        double totalNilai = 0;
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + nama[i]);
            System.out.println("Nilai: " + nilai[i]);
            totalNilai += nilai[i];
        }
        
        // Hitung rata-rata
        double rataRata = totalNilai / jumlahMahasiswa;
        
        // Tampilkan hasil
        System.out.println("\nHasil Analisis:");
        System.out.println("-------------------------------");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("%-10s: %d%n", nama[i], nilai[i]);
        }
        System.out.println("-------------------------------");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("\ndibuat bagus gilang pradita");
       
    }
}

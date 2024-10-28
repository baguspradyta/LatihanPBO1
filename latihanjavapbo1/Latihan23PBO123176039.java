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
public class Latihan23PBO123176039 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("run:");
            System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
            
            // Input nama petugas
            System.out.print("Masukkan Nama Petugas : ");
            String namaPetugas = input.nextLine();
            
            // Input jumlah mahasiswa
            System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
            int jumlahMahasiswa = input.nextInt();
            
            // Array untuk menyimpan nilai
            int[] nilai = new int[jumlahMahasiswa];
            
            // Input nilai mahasiswa
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " = ");
                nilai[i] = input.nextInt();
            }
            
            // Mencari nilai terbesar dan terkecil
            int nilaiTerbesar = nilai[0];
            int nilaiTerkecil = nilai[0];
            
            // Tampilkan hasil input
            System.out.println("\n=====Hasil Nilai Mahasiswa=====");
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = " + nilai[i]);
                
                // Update nilai terbesar dan terkecil
                if (nilai[i] > nilaiTerbesar) {
                    nilaiTerbesar = nilai[i];
                }
                if (nilai[i] < nilaiTerkecil) {
                    nilaiTerkecil = nilai[i];
                }
            }
            
            // Tampilkan hasil analisis
            System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
            System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);
            System.out.println("\nPetugas : " + namaPetugas);
            System.out.println("dibuat bagus gilang pradita");
        }
    }
}

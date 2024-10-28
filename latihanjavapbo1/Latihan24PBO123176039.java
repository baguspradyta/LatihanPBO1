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
public class Latihan24PBO123176039  {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("========Program Perbandingan Nilai========\n");
                System.out.print("Masukkan nilai pertama: ");
                int nilaiPertama = scanner.nextInt();
                System.out.print("Masukkan nilai kedua: ");
                int nilaiKedua = scanner.nextInt();
                
                if (nilaiPertama > nilaiKedua) {
                    System.out.println("Hasil: " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
                } else if (nilaiPertama < nilaiKedua) {
                    System.out.println("Hasil: " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
                } else {
                    System.out.println("Hasil: " + nilaiPertama + " Sama dengan " + nilaiKedua);
                }
                
                System.out.print("Ulangi Aktifitas? (Ya/Tidak): ");
                String lanjut = scanner.next();
                
                if (!lanjut.equalsIgnoreCase("Ya")) {
                    break;
                }
            }
            System.out.println("dibuat bagus gilang pradita");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanjavapbo1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author bagus
 * 
 * NAMA    : BAGUS GILANG PRADITA
 * NIM     : 23176039
 * KELAS   : PBO1
 * JURUSAN : SISTEM INFORMASI
 * 
 */
public class Latihan17PBO123176039
 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            DecimalFormat formatRupiah = new DecimalFormat("#,##0.0");
            
            System.out.println("run:");
            System.out.println("=============Program Tunjangan=============");
            
            // Input gaji pokok
            System.out.print("Berapa gaji pokok anda perbulan?: ");
            double gajiPokok = input.nextDouble();
            input.nextLine(); // consume newline
            
            // Input status
            System.out.print("Status Anda? (Menikah/Belum): ");
            String status = input.nextLine();
            
            // Hitung tunjangan
            double tunjangan = 0;
            if (status.equalsIgnoreCase("Menikah")) {
                tunjangan = gajiPokok * 0.35; // 35% dari gaji pokok
            }
            
            // Hitung total gaji
            double totalGaji = gajiPokok + tunjangan;
            
            // Tampilkan hasil
            System.out.println("\n========Hasil Perhitungan Gaji Anda========");
            System.out.println("Gaji Pokok\t: Rp " + formatRupiah.format(gajiPokok));
            System.out.println("Tunjangan\t: Rp " + formatRupiah.format(tunjangan));
            System.out.println("Total Gaji\t: Rp " + formatRupiah.format(totalGaji));
            System.out.println("(dibuat = bagus gilang pradita )");
        }
    }
}
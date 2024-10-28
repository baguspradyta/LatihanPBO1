/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapbo1;

import java.text.DecimalFormat;

/**
 * NAMA    : BAGUS GILANG PRADITA
 * NIM     : 23176039
 * KELAS   : PBO1
 * JURUSAN : SISTEM INFORMASI
 * @author bagus
 */
public class Latihan19PBO123176039 {
    public static void main(String[] args) {
        // Format currency untuk Rupiah
        DecimalFormat formatRupiah = new DecimalFormat("#,###");
        
        System.out.println("run:");
        
        // Saldo awal
        double saldo = 8000000;
        
        // Persentase kenaikan (15% per bulan)
        double persentaseKenaikan = 0.15;
        
        // Loop untuk 6 bulan
        for (int bulan = 1; bulan <= 6; bulan++) {
            // Tampilkan saldo bulan ini
            System.out.println("Saldo di bulan ke-" + bulan + " Rp." + formatRupiah.format(saldo));
            
            // Hitung saldo untuk bulan berikutnya
            saldo = saldo * (1 + persentaseKenaikan);
        }
        
        System.out.println("dibuat bagus gilang pradita");
    }
}

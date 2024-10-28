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
public class Latihan20PBO123176039 {
    public static void main(String[] args) {
        // Format currency untuk Rupiah
        DecimalFormat formatRupiah = new DecimalFormat("#,###");
        
        // Saldo awal
        double saldo = 5000000;
        
        // Persentase kenaikan (sekitar 8% per bulan)
        double persentaseKenaikan = 0.08;
        
        // Loop untuk 8 bulan
        for (int bulan = 1; bulan <= 8; bulan++) {
            // Tampilkan saldo bulan ini
            System.out.printf("Saldo di bulan ke-%d Rp. %s%n", 
                            bulan, 
                            formatRupiah.format(Math.round(saldo)));
            
            // Hitung saldo untuk bulan berikutnya
            saldo = saldo * (1 + persentaseKenaikan);
        } 
        System.out.println("dibuat bagus gilang pradita");
    }
}

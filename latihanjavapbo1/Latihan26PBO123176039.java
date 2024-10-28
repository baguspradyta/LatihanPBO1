/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjavapbo1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * NAMA    : BAGUS GILANG PRADITA
 * NIM     : 23176039
 * KELAS   : PBO1
 * JURUSAN : SISTEM INFORMASI
 * @author bagus
 */
public class Latihan26PBO123176039 {
   
    public static void main(String[] args) {
        // Set zona waktu untuk Tegal, Indonesia
        ZoneId tegalZoneId = ZoneId.of("Asia/Jakarta");
        
        // Ambil waktu saat ini di zona waktu Tegal
        LocalDateTime now = LocalDateTime.now(tegalZoneId);
        
        // Format tanggal dan waktu
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");
        
        // Tampilkan waktu
        for (int i = 0; i < 0x1; i++) {
            // Format waktu
            String formattedDateTime = now.format(dateFormatter);
            System.out.println(formattedDateTime);
         }
         System.out.println("dibuat bagus gilang pradita");
    }
}


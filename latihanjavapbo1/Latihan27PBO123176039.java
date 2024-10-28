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
public class Latihan27PBO123176039 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("run:\n");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();

        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());

        System.out.println("dibuat bagus gilang pradita");
    }
}


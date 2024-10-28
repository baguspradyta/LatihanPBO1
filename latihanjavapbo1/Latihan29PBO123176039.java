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
public class Latihan29PBO123176039 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("run:");
        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println("MERAH");
        System.out.println("HIJAU");
        System.out.println("KUNING");
        System.out.println("BIRU");
        System.out.println("UNGU");
        System.out.print("PILIH WARNA FAVORITMU: ");
        String warnaFavorit = scanner.nextLine();

        System.out.print("NAMA KAMU: ");
        String nama = scanner.nextLine();

        System.out.println("run:");
        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println("MERAH");
        System.out.println("HIJAU");
        System.out.println("KUNING");
        System.out.println("BIRU");
        System.out.println("UNGU");
        System.out.println("PILIH WARNA FAVORITMU: " + warnaFavorit.toUpperCase());
        System.out.println("NAMA KAMU: " + nama);
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "===");

        switch (warnaFavorit.toUpperCase()) {
            case "MERAH" -> {
                System.out.println("Warna Favoritmu adalah MERAH");
                System.out.println("1. Berani,");
                System.out.println("2. Penuh semangat,");
                System.out.println("3. Berani mengambil resiko,");
                System.out.println("4. Memiliki jiwa kepemimpinan,");
                System.out.println("5. Suka menjadi pusat perhatian,");
                System.out.println("6. Berjiwa petualang,");
                System.out.println("7. Cepat emosi,");
                System.out.println("8. Mudah tersinggung.");
            }
        }}}

                
        
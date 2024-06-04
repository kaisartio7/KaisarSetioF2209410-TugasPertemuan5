/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo4;

/**
 *
 * @author Acer
 */
    import java.util.Scanner;

public class TugasPBO41 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca batas awal dan batas akhir
        System.out.print("Masukkan batas awal: ");
        int batasAwal = scanner.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = scanner.nextInt();
        
        // Memanggil prosedur untuk menghitung dan menampilkan jumlah deret bilangan genap
        hitungDanTampilkanJumlahGenap(batasAwal, batasAkhir);
        
        scanner.close();
    }
    
    // Prosedur untuk menghitung dan menampilkan jumlah deret bilangan genap
    public static void hitungDanTampilkanJumlahGenap(int batasAwal, int batasAkhir) {
        int jumlahGenap = 0;
        
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlahGenap += i;
            }
        }
        
        System.out.println("Jumlah deret bilangan genap dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + jumlahGenap);
    }
}


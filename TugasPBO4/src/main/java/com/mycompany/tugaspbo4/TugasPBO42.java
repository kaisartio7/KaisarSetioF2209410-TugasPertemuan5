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

public class TugasPBO42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca dua bilangan
        System.out.print("Masukkan bilangan pertama (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan bilangan kedua (b): ");
        int b = scanner.nextInt();
        
        // Memanggil prosedur untuk menghitung dan menampilkan GCD
        hitungDanTampilkanGCD(a, b);
        
        scanner.close();
    }
    
    // Prosedur untuk menghitung dan menampilkan GCD
    public static void hitungDanTampilkanGCD(int a, int b) {
        int gcd = hitungGCD(a, b);
        
        System.out.println("Pembagi Bersama Terbesar (GCD) dari " + a + " dan " + b + " adalah: " + gcd);
    }
    
    // Fungsi untuk menghitung GCD menggunakan Algoritma Euclidean
    public static int hitungGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


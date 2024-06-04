/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspbo4;

/**
 *
 * @author Acer
 */
 import java.util.Scanner;
public class TugasPBO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca nilai N
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();
        
        // Memanggil prosedur untuk mencetak teks sebanyak N kali
        cetakTeks(N);
        
        scanner.close();
    }
    
    // Prosedur untuk mencetak teks sebanyak N kali
    public static void cetakTeks(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;
import java.util.Scanner;


public class MenaraHanoiGame {
    

    public static void main(String[] args) {
        Boolean Kondisi = true;
        int langkah = 0;
        Scanner scanner = new Scanner(System.in);

        Stack s1 = new Stack(4);
        Stack s2 = new Stack(4);
        Stack s3 = new Stack(4);
        s1.fill(4, 3, 2, 1);

        while (Kondisi = true && langkah <= 15) {
            System.out.println("Stack 1: " + s1);
            System.out.println("Stack 2: " + s2);
            System.out.println("Stack 3: " + s3);

            System.out.print("Masukkan Stack Asal: ");
            int asal = scanner.nextInt();
            System.out.print("Masukkan Stack Tujuan: ");
            int tujuan = scanner.nextInt();

            if (asal == 1 && tujuan == 2) {
                if (s2.isEmpty() || s1.peek() < s2.peek()) {
                    s2.push(s1.pop());

                } else {
                    System.out.println("Pergerakan tidak valid!");
                }
            } else if (asal == 1 && tujuan == 3) {
                if (s3.isEmpty() || s1.peek() < s3.peek()) {
                    s3.push(s1.pop());

                } else {
                    System.out.println("Pergerakan tidak valid!");
                }
            } else if (asal == 2 && tujuan == 1) {
                if (s1.isEmpty() || s2.peek() < s1.peek()) {
                    s1.push(s2.pop());

                } else {
                    System.out.println("Pergerakan tidak valid!");
                }
            } else if (asal == 2 && tujuan == 3) {
                if (s3.isEmpty() || s2.peek() < s3.peek()) {
                    s3.push(s2.pop());

                } else {
                    System.out.println("Pergerakan tidak valid!");
                }
            } else if (asal == 3 && tujuan == 1) {
                if (s1.isEmpty() || s3.peek() < s1.peek()) {
                    s1.push(s3.pop());

                } else {
                    System.out.println("Pergerakan tidak valid!");
                }
            } else if (asal == 3 && tujuan == 2) {
                if (s2.isEmpty() || s3.peek() < s2.peek()) {
                    s2.push(s3.pop());

                } else {
                    System.out.println("Pergerakan tidak valid!");
                }
            } else {
                System.out.println("Asal dan Tujuan tidak valid!");
            }
            if (s3.isFull() || s2.isFull()) {
                System.out.println("Permainan Selesai!");
                Kondisi = false; // Menghentikan loop
                System.out.println("Stack Akhir: ");
                System.out.println("Stack 1: " + s1);
                System.out.println("Stack 2: " + s2);
                System.out.println("Stack 3: " + s3);
            }
            langkah++;
            if (langkah >= 15) {
                System.out.println("Permainan gagal");
            }
        }

    }

}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class PerhitunganLingkaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diameter = 0;
        boolean validInput = false;

        System.out.println("======Perhitungan Lingkaran======");

        // Input validation loop
        while (!validInput) {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            if (scanner.hasNextDouble()) { // Check if input is a valid double number
                diameter = scanner.nextDouble();
                if (diameter > 0) {
                    validInput = true;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                }
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai");
                scanner.next(); // Clear the invalid input
            }
        }

        // Calculations
        double radius = diameter / 2;
        double luas = Math.PI * radius * radius;
        double keliling = 2 * Math.PI * radius;

        // Output results
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran = %.0f cm%n", radius);
        System.out.printf("Luas Lingkaran = %.2f cm%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);
    }
}
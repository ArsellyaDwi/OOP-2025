/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
public class Pengeluaran extends AnggaranPribadi {
    public Pengeluaran(String nama, double saldo, double jumlah) {
        super(nama, "Pengeluaran", saldo, jumlah);
    }

    // Override method untuk mencatat pengeluaran
    @Override
    double catatPengeluaran() {
        saldo -= jumlah;
        System.out.println("Pengeluaran tercatat: " + jumlah);
        System.out.println("Saldo sekarang: " + saldo);
        return saldo;
    }
}

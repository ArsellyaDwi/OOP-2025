/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
// Kelas turunan untuk menangani logika pengeluaran
public class Pengeluaran extends AnggaranPribadi {
    public Pengeluaran(String nama, double saldo, double jumlah) {
        super(nama, "Pengeluaran", saldo, jumlah);
    }

    // Override method catatPengeluaran dengan pengecekan saldo
    @Override
    public double catatPengeluaran() {
        if (getJumlah() > getSaldo()) {
            System.out.println("Saldo tidak cukup.");
        } else {
            setSaldo(getSaldo() - getJumlah());
            System.out.println("Pengeluaran tercatat: " + getJumlah());
            System.out.println("Saldo sekarang: " + getSaldo());
        }
        return getSaldo();
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
// Kelas Pengeluaran mewarisi dari Anggaran dan mengimplementasikan logika pengeluaran
public class Pengeluaran extends Anggaran {
    private double saldo;

    // Konstruktor menerima saldo awal
    public Pengeluaran(double saldoAwal) {
        this.kategori = "Pengeluaran";
        this.saldo = saldoAwal;
    }

    // Override method prosesTransaksi untuk mengurangi saldo
    @Override
    public double prosesTransaksi(double jumlahBaru) {
        if (jumlahBaru > saldo) {
            System.out.println("Saldo tidak cukup.");
            return saldo;
        }
        saldo -= jumlahBaru;
        System.out.println("Pengeluaran berhasil dicatat: " + jumlahBaru);
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}

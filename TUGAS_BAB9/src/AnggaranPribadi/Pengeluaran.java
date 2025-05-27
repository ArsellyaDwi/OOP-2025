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
public class Pengeluaran extends Anggaran implements Transaksi {
    private double saldo;

    public Pengeluaran(double saldoAwal) {
        this.kategori = "Pengeluaran";
        this.saldo = saldoAwal;
    }

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

    @Override
    public void tampilkanInfo() {
        System.out.println("Kategori: " + kategori);
        System.out.println("Saldo saat ini: " + saldo);
    }
}
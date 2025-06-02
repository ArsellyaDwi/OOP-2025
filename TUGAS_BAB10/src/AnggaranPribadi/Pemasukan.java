/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
// Kelas Pemasukan mewarisi dari Anggaran dan mengimplementasikan logika pemasukan
public class Pemasukan extends Anggaran implements Transaksi {
    private double saldo;

    public Pemasukan(double saldoAwal) {
        this.kategori = "Pemasukan";
        this.saldo = saldoAwal;
    }

    @Override
    public double prosesTransaksi(double jumlahBaru) {
        saldo += jumlahBaru;
        System.out.println("Pemasukan berhasil ditambahkan: " + jumlahBaru);
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
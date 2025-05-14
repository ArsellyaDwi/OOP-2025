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
public class Pemasukan extends Anggaran {
    private double saldo; // Saldo saat ini

    // Konstruktor menerima saldo awal
    public Pemasukan(double saldoAwal) {
        this.kategori = "Pemasukan";
        this.saldo = saldoAwal;
    }

    // Override method abstrak untuk menambahkan saldo
    @Override
    public double prosesTransaksi(double jumlahBaru) {
        saldo += jumlahBaru;
        System.out.println("Pemasukan berhasil ditambahkan: " + jumlahBaru);
        return saldo;
    }

    // Getter saldo untuk melihat sisa saldo
    public double getSaldo() {
        return saldo;
    }
}
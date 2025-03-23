/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
public class AnggaranPribadi {
    String nama, kategori;
    double saldo, jumlah;

    // Constructor untuk menginisialisasi data anggaran
    public AnggaranPribadi(String nama, String kategori, double saldo, double jumlah) {
        this.nama = nama;
        this.kategori = kategori;
        this.saldo = saldo;
        this.jumlah = jumlah;
    }

    // Method untuk mencetak data anggaran
    String cetakNama() {
        return nama;
    }

    String cetakKategori() {
        return kategori;
    }

    double cetakSaldo() {
        return saldo;
    }

    double cetakJumlah() {
        return jumlah;
    }

    // Method untuk menambah pemasukan
    double tambahPemasukan() {
        if (!kategori.equalsIgnoreCase("Pemasukan")) {
            System.out.println("Kategori salah! Harus 'Pemasukan'.");
            return saldo;
        }
        saldo += jumlah;
        return saldo;
    }

    // Method untuk mencatat pengeluaran
    double catatPengeluaran() {
        if (!kategori.equalsIgnoreCase("Pengeluaran")) {
            System.out.println("Kategori salah! Harus 'Pengeluaran'.");
            return saldo;
        }
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi untuk pengeluaran sebesar Rp " + jumlah);
            return saldo;
        } else {
            saldo -= jumlah;
            return saldo;
        }
    }
}

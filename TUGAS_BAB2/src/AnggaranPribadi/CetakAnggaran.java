/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
public class CetakAnggaran {
    public static void main(String[] args) {
        // Membuat objek anggaran menggunakan constructor
        AnggaranPribadi anggaran = new AnggaranPribadi("Arsellya", "Pemasukan", 500000, 250000);

        // Menampilkan informasi awal
        System.out.println("Sistem Pencatatan Anggaran Pribadi");
        System.out.println("----------------------------------");
        System.out.println("Nama Pemilik: " + anggaran.cetakNama());
        System.out.println("Kategori: " + anggaran.cetakKategori());
        System.out.println("Saldo Awal: Rp " + anggaran.cetakSaldo());
        System.out.println("Jumlah: Rp " + anggaran.cetakJumlah());

        // Menambah pemasukan
        System.out.println("\nMenambah Pemasukan...");
        System.out.println("Saldo setelah pemasukan: Rp " + anggaran.tambahPemasukan());

        // Mencatat pengeluaran
        anggaran.kategori = "Pengeluaran";
        anggaran.jumlah = 200000;
        System.out.println("\nMencatat Pengeluaran...");
        System.out.println("Saldo setelah pengeluaran: Rp " + anggaran.catatPengeluaran());

        // Pengeluaran melebihi saldo
        anggaran.jumlah = 600000;
        System.out.println("\nMencoba pengeluaran yang lebih besar dari saldo...");
        System.out.println("Saldo setelah pengeluaran: Rp " + anggaran.catatPengeluaran());
    }
}


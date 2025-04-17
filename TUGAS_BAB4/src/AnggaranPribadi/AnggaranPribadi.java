/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
// Kelas dasar untuk anggaran pribadi, menerapkan prinsip enkapsulasi
public class AnggaranPribadi {
    // Properti dibuat private agar tidak bisa diakses langsung dari luar class
    private String nama;
    private String kategori;
    private double saldo;
    private double jumlah;

    // Constructor untuk inisialisasi data
    public AnggaranPribadi(String nama, String kategori, double saldo, double jumlah) {
        this.nama = nama;
        this.kategori = kategori;
        this.saldo = saldo;
        this.jumlah = jumlah;
    }

    // Getter dan Setter untuk properti nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk kategori
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // Getter dan Setter untuk saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Getter dan Setter untuk jumlah
    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    // Method menambah pemasukan jika kategori sesuai
    public double tambahPemasukan() {
        if (!kategori.equalsIgnoreCase("Pemasukan")) {
            System.out.println("Kategori salah! Harus 'Pemasukan'.");
            return saldo;
        }
        saldo += jumlah;
        return saldo;
    }

    // Method mencatat pengeluaran jika kategori sesuai
    public double catatPengeluaran() {
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

    // Placeholder method yang belum digunakan
    public double tambahPengeluaran() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
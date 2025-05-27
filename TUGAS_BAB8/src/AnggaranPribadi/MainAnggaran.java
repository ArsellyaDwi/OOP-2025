/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
// Kelas utama untuk menjalankan simulasi anggaran dengan polimorfisme
public class MainAnggaran {
    public static void main(String[] args) {
        Anggaran anggaran; // Tipe referensi adalah kelas abstrak (polimorfisme)

        // Penerapan polimorfisme: objek aslinya adalah Pemasukan
        anggaran = new Pemasukan(1000);
        double saldoSetelahPemasukan = anggaran.prosesTransaksi(500);
        System.out.println("Saldo setelah pemasukan: " + saldoSetelahPemasukan);

        // Penerapan polimorfisme: objek aslinya adalah Pengeluaran
        anggaran = new Pengeluaran(saldoSetelahPemasukan);
        double saldoSetelahPengeluaran = anggaran.prosesTransaksi(300);
        System.out.println("Saldo setelah pengeluaran: " + saldoSetelahPengeluaran);
    }
}
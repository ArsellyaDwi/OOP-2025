/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
// Kelas turunan khusus untuk Pemasukan
public class Pemasukan extends AnggaranPribadi {

    // Konstruktor set otomatis kategori "Pemasukan"
    public Pemasukan(String nama, double saldo, double jumlah) {
        super(nama, "Pemasukan", saldo, jumlah);
    }

    public double prosesTransaksi(double jumlahBaru) {
        return tambahPemasukan(jumlahBaru);
    }
}
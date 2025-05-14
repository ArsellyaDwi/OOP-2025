/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
// Kelas abstrak sebagai dasar untuk semua jenis anggaran
public abstract class Anggaran {
    public String kategori;
    public double jumlah;

    // Method abstrak yang harus diimplementasikan oleh subclass
    public abstract double prosesTransaksi(double jumlahBaru);
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
public abstract class Anggaran {
    public String kategori;
    public double jumlah;
    
// Method abstrak untuk proses transaksi
public abstract double prosesTransaksi(double jumlahBaru);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
// Kelas turunan untuk menangani logika pemasukan
public class Pemasukan extends AnggaranPribadi {
    public Pemasukan(String nama, double saldo, double jumlah) {
        super(nama, "Pemasukan", saldo, jumlah);
    }

    // Overloading di class Pemasukan
    public double tambahPemasukan(double jumlahBaru) {
    setSaldo(getSaldo() + jumlahBaru);
    return getSaldo();
    }
}
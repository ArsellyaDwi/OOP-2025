/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnggaranPribadi;

/**
 *
 * @author LENOVO
 */
public class Pemasukan extends AnggaranPribadi {
    public Pemasukan(String nama, double saldo, double jumlah) {
        super(nama, "Pemasukan", saldo, jumlah);
    }

    // Override method untuk menambah pemasukan
    @Override
    double tambahPemasukan() {
        saldo += jumlah;
        return saldo;
    }
}
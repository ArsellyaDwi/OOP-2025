/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3.Inheritanceee;

/**
 *
 * @author LENOVO
 */
public class Tabung extends Lingkaran {
    int t;
    double volume;
    public Tabung(){
        t=20;
    }
    void Keterangan(){
        Deskripsi();
        System.out.println("mengitung Volume Tabung");
    }
    double volume(){
       volume = (luas()*t);
       return volume;
    } 
}

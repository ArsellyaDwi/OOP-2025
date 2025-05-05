/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3.Inheritanceee;

/**
 *
 * @author LENOVO
 */
public class Lingkaran {
//  attribut
    int r;
    double phi,luas;
    
//    construtor
    public Lingkaran(){
        r = 7;
        phi = 3.14;
    }
//    method
    void Deskripsi(){
        System.out.println(" Ini adalah hasil menghitung");
    }
//    method untuk menghitung luas
    double luas(){
        luas=(phi*r*r);
        return luas; 
    }
}

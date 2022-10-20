/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class main {
    public static void main(String[] args){
        person Person1 = new person();
        person Person2 = new person();
        
        Person1.nama = "Anton";
        Person2.nama = "Riko";
        
        Person1.jeniskelamin = "Laki - laki";
        Person2.jeniskelamin = "Laki - laki";
        
        Person1.umur = 22;
        Person2.umur = 23;
        
        System.out.println("Nama: "+ Person1.nama);
        System.out.println("Jenis Kelamin: " + Person1.jeniskelamin);
        System.out.println("Umur: " + Person1.umur);
        
        System.out.println("Nama: "+ Person2.nama + "\nJenis Kelamin: " + Person2.jeniskelamin + "\nUmur: " + Person2.umur);
    }
}

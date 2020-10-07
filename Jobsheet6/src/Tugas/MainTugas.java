/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class MainTugas {
    
public static void main(String[] args) {
        
      
        Dosen dsn = new Dosen();
        dsn.setNama("Mrs.Ella");
        dsn.setSKS(12);
        
        Pegawai pg = new Pegawai();
        pg.setNama("Mr.Jefri");
        
        DaftarGaji daftar_gaji = new DaftarGaji(3);
        daftar_gaji.addPegawai(dsn);
        daftar_gaji.addPegawai(pg);
        daftar_gaji.printSemuaGaji();
    }   
}
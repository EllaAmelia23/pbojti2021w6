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
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawai = 0;
    
    public DaftarGaji(int jumlah_pegawai){
        listPegawai = new Pegawai[jumlah_pegawai];
    }
    
    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawai] = p;
        jumlahPegawai++;
    }
    
    public void printSemuaGaji(){
        for (int i=0;i<jumlahPegawai;i++){
            System.out.print(listPegawai[i].getNama()+" Akan Memperoleh Gaji ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
